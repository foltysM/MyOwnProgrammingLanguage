
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

enum VarType {INT, REAL, STRING, ARRAY, UNKNOWN}

class Value {
    public String name;
    public VarType type;

    public Value(String name, VarType type) {
        this.name = name;
        this.type = type;
    }
}


public class LLVMActions extends DwunastaBaseListener {

    Boolean id = false;
    Boolean take_global = false;
    Stack<Value> stack = new Stack<>();
    String value, function;
    Boolean global;
    HashMap<String, VarType> globalnames = new HashMap<>();
    HashSet<String> functions = new HashSet<>();
    HashMap<String, VarType> localnames = new HashMap<>();

    @Override
    public void exitRepetitions(DwunastaParser.RepetitionsContext ctx) {
        value = ctx.INT().getText();
        LLVMGenerator.repeatstart(value);
    }

    @Override
    public void enterProg(DwunastaParser.ProgContext ctx) {
        global = true;
    }

    @Override
    public void exitFparam(DwunastaParser.FparamContext ctx) {
        String ID = ctx.ID().getText();
        functions.add(ID);
        function = ID;
        LLVMGenerator.functionstart(ID);
    }

    @Override
    public void enterFblock(DwunastaParser.FblockContext ctx) {
        global = false;
    }

    @Override
    public void exitFblock(DwunastaParser.FblockContext ctx) {
        if (!localnames.containsKey(function)) {
            LLVMGenerator.assign(set_variable(function, VarType.INT, take_global), "0");
        }
        LLVMGenerator.load("%" + function);
        LLVMGenerator.functionend();
        localnames = new HashMap<>();
        global = true;
        //TODO do przemyślenia
    }


    @Override
    public void exitAssign(DwunastaParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        String a = ctx.getParent().getText();
        String cf = ctx.ASSIGN().getText();
        char ch = a.charAt(a.length()-2);
        if(!id) {
            Value v = stack.pop();
            if (v.type == VarType.INT) {
                LLVMGenerator.assign_i32(set_variable(ID, v.type, take_global), v.name);
            }
            if (v.type == VarType.REAL) {
                LLVMGenerator.assign_double(set_variable(ID, v.type, take_global), v.name);
            }
            if (v.type == VarType.STRING) {
                LLVMGenerator.assign_string(set_variable(ID, v.type, take_global), v.name);
            }
            if (v.type == VarType.ARRAY) {
                LLVMGenerator.assign_array(set_variable(ID, v.type, take_global), v.name);
            }
        }
        id = false;


        //todo inny assign!
    }

    public String set_variable(String ID, VarType TYPE, Boolean set_global) {

        String id;
        if (global || set_global) {
            if (!globalnames.containsKey(ID)) {
                globalnames.put(ID, TYPE);
                if (TYPE == VarType.INT) {
                    LLVMGenerator.declare_i32(ID, true);
                }
                if (TYPE == VarType.REAL) {
                    LLVMGenerator.declare_double(ID, true);
                }
                if (TYPE == VarType.STRING) {
                    LLVMGenerator.declare_string(ID, true);
                }
                if (TYPE == VarType.ARRAY) {
                    LLVMGenerator.declare_array(ID, true);
                }
                if (TYPE == VarType.UNKNOWN) {
                    System.err.println("Unknown data type!");
                    System.exit(-1);
                }

            }
            id = "@" + ID;
        } else {
            if (!localnames.containsKey(ID)) {
                localnames.put(ID, TYPE);
                if (TYPE == VarType.INT) {
                    LLVMGenerator.declare_i32(ID, false);
                }
                if (TYPE == VarType.REAL) {
                    LLVMGenerator.declare_double(ID, false);
                }
                if (TYPE == VarType.STRING) {
                    LLVMGenerator.declare_string(ID, false);
                }
                if (TYPE == VarType.ARRAY) {
                    LLVMGenerator.declare_array(ID, false);
                }
            }
            id = "%" + ID;
        }
        return id;
    }


    @Override
    public void exitId_assign(DwunastaParser.Id_assignContext ctx) {
        id = true;
        if (ctx.ID() != null) {
            String ID = ctx.ID().getText();

            if (localnames.containsKey(ID)) {
                LLVMGenerator.load("%" + ID);
            } else if (globalnames.containsKey(ID)) {
                LLVMGenerator.load("@" + ID);
            } else if (functions.contains(ID)) {
                LLVMGenerator.call(ID);
            } else {
                error(ctx.getStart().getLine(), "Unknown " + ID + ": local > global > function");
            }
            value = "%" + (LLVMGenerator.reg - 1);
        }

//        if( ctx.INT() != null ){
//            value = ctx.INT().getText();
//        }
    }
    @Override
    public void exitCall(DwunastaParser.CallContext ctx) {
        LLVMGenerator.call(ctx.ID().getText());
    }

    @Override
    public void exitAssign_string(DwunastaParser.Assign_stringContext ctx) {
        String ID = ctx.ID().getText();
        String cont = ctx.STRING().getText();
        // Value v = stack.pop();
        //variables.put(ID, v.type);
        //TODO declare - zarezerwowanie mmiejsca
        //TODO scanf - przypisanie
        System.out.println(ctx.ID().getText());
        System.out.println(ctx.ID().getSymbol());
        //System.out.println(stack.pop().name);
    }

    @Override
    public void exitIf(DwunastaParser.IfContext ctx) {
    }

    @Override
    public void enterBlockif(DwunastaParser.BlockifContext ctx) {
        LLVMGenerator.ifstart();
    }

    @Override
    public void exitBlockif(DwunastaParser.BlockifContext ctx) {
        LLVMGenerator.ifend();
    }

    @Override
    public void exitEqual(DwunastaParser.EqualContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.INT().getText();
        if (global) {
            if (globalnames.containsKey(ID)) {
                LLVMGenerator.icmp(set_variable(ID, VarType.INT, take_global), INT);
            } else {
                ctx.getStart().getLine();
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        } else {
            if (localnames.containsKey(ID)) {
                LLVMGenerator.icmp(ID, INT);
            } else {
                ctx.getStart().getLine();
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }

        }
    }

    @Override
    public void exitStart(DwunastaParser.StartContext ctx) {
        if (ctx.getParent() instanceof DwunastaParser.LoopContext) {
            LLVMGenerator.repeatend();
        }
    }


    @Override
    public void exitString(DwunastaParser.StringContext ctx) {
        stack.push(new Value(ctx.STRING().getText(), VarType.STRING));
    }

    @Override
    public void exitArray(DwunastaParser.ArrayContext ctx) {
        stack.push(new Value(ctx.ARRAY().getText(), VarType.ARRAY));
    }

    @Override
    public void exitInt(DwunastaParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT));
    }

    @Override
    public void exitReal(DwunastaParser.RealContext ctx) {
        stack.push(new Value(ctx.REAL().getText(), VarType.REAL));
    }

    @Override
    public void exitAdd(DwunastaParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSub(DwunastaParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                //LLVMGenerator.add_i32(v1.name, v2.name);
                LLVMGenerator.sub_i32(v2.name, v1.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                //LLVMGenerator.add_double(v1.name, v2.name);
                LLVMGenerator.sub_double(v2.name, v1.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }


    @Override
    public void exitCastint(DwunastaParser.CastintContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.fptosi(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
    }

    @Override
    public void exitCastreal(DwunastaParser.CastrealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.sitofp(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
    }

    @Override
    public void exitRead(DwunastaParser.ReadContext ctx) {
        String ID = ctx.ID().getText();

        // wersja dla integer
//        if (!variables.containsKey(ID)) {
//            variables.put(ID, VarType.INT);
//            LLVMGenerator.declare_i32(ID);
//        }
        LLVMGenerator.scanf(set_variable(ID, VarType.INT, take_global));
    }


    @Override
    public void exitPrint(DwunastaParser.PrintContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = VarType.UNKNOWN;
        if (localnames.containsKey(ID)) {
            //LLVMGenerator.load("%" + ID);
            type = localnames.get(ID);
        } else if (globalnames.containsKey(ID)) {
            //LLVMGenerator.load("@" + ID);
            type = globalnames.get(ID);
        } else if (functions.contains(ID)) {
            LLVMGenerator.call(ID);
        }
        if( !localnames.containsKey(ID) && globalnames.containsKey(ID))
        {
            take_global = true;
        }
        value = "%" + (LLVMGenerator.reg - 1);
        if (type != null) {
            if (type == VarType.INT) {
                LLVMGenerator.load_i32(set_variable(ID, type, take_global));
                LLVMGenerator.printf_i32(set_variable(ID, type, take_global));
            }
            if (type == VarType.REAL) {
                LLVMGenerator.printf_double(set_variable(ID, type, take_global));
            }
            if (type == VarType.STRING) {
                LLVMGenerator.printf_string(set_variable(ID, type, take_global));
            }
            if (type == VarType.ARRAY) {
                LLVMGenerator.printf_array(set_variable(ID, type, take_global));
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable " + ID);
        }
        take_global = false;

    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }

    @Override
    public void exitProg(DwunastaParser.ProgContext ctx) {
        LLVMGenerator.close_main();
        String generated = LLVMGenerator.generate();
        System.out.println(generated);
        try {
            File myObj = new File("output.ll");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("output.ll");
            myWriter.write(generated);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
