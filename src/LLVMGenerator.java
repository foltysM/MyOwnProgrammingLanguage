import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;




class DeclarationText {
    public String text1;
    public String text2;

    public DeclarationText(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }
}

class Function_declarations {
    public String function_name;
    public String text1;
    public String text2;

    public Function_declarations(String function_name, String text1, String text2)
    {
        this.function_name = function_name;
        this.text1 = text1;
        this.text2 = text2;
    }

}

class LLVMGenerator {

    static String header_text = "";
    static String main_text = "";
    static String buffer = "";
    static String buffer1 = "";
    static String buffer2 = "";
    static int reg = 1;
    static int main_reg = 1;
    static int br = 0;
    static int br_if = 0;
    static Boolean class_member = false;
    //static String buffer_id = "";
    static String buffer_id1 = "";
    static String buffer_id2 = "";


    static HashMap<String, Function_declarations> functions_strings = new HashMap<>();
    static Stack<Integer> brstack = new Stack<>();
    static Stack<Integer> brstack_if = new Stack<>();
    //static HashMap<String, DeclarationText> class_functions = new HashMap<>();

    static void repeatstart(String repetitions) {
        declare_r(Integer.toString(reg));
        int counter = reg;
        reg++;
        assign_i32("%" + counter, "0", false);
        br++;
        buffer += "br label %cond" + br + "\n";
        buffer += "cond" + br + ":\n";

        load_i32("%" + counter, false);
        add("%" + (reg - 1), "1");
        assign_i32("%" + counter, "%" + (reg - 1), false);

        buffer += "%" + reg + " = icmp slt i32 %" + (reg - 2) + ", " + repetitions + "\n";
        reg++;

        buffer += "br i1 %" + (reg - 1) + ", label %true" + br + ", label %false" + br + "\n";
        buffer += "true" + br + ":\n";
        brstack.push(br);
    }

    static void icmp(String id, String value) {
        buffer += "%" + reg + " = load i32, i32* " + id + "\n";
        reg++;
        buffer += "%" + reg + " = icmp eq i32 " + (reg - 1) + ", " + value + "\n";
        reg++;
    }

    static void ifstart() {
        br_if++;
        buffer += "br i1 %" + (reg - 1) + ", label %truea" + br_if + ", label %falsea" + br_if + "\n";
        buffer += "truea" + br_if + ":\n";
        brstack_if.push(br_if);
    }

    static void ifend() {
        int b = brstack_if.pop();
        buffer += "br label %falsea" + b + "\n";
        buffer += "falsea" + b + ":\n";
    }

    static void repeatend() {
        int b = brstack.pop();
        buffer += "br label %cond" + b + "\n";
        buffer += "false" + b + ":\n";
    }


    static void assign_i32(String id, String value, Boolean is_in_class) {
        if(is_in_class)
        {
            buffer2 += "store i32 " + value + ", i32* " + id + "\n";
        }else{
            buffer += "store i32 " + value + ", i32* " + id + "\n";
        }

    }

    static void add(String val1, String val2) {
        buffer += "%" + reg + " = add i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void load_i32(String id, Boolean is_in_class) {
        if(!(is_in_class))
        {
            buffer += "%" + reg + " = load i32, i32* " + id + "\n";
        }else
        {
            buffer2 += "%" + reg + " = load i32, i32* " + id + "\n";
        }

        reg++;
    }

    static void printf_i32(String id, Boolean is_in_class) {
        if(!is_in_class) {
            buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
        }else
        {
            buffer2 += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 1) + ")\n";
        }
        reg++;
    }

    static void printf_double(String id) {
        buffer += "%" + reg + " = load double, double* " + id + "\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 1) + ")\n";
        reg++;
    }

    static void declare_double(String id, Boolean global) {
        if (global) {
            header_text += "@" + id + " = global double 0.0\n";
        } else {
            buffer += "%" + id + " = alloca double\n";
        }
    }



    static void assign_double(String id, String value) {
        buffer += "store double " + value + ", double* " + id + "\n";
    }

    static void scanf(String id) {
        buffer += "%" + reg + " = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* " + id + ")\n";
        reg++;
    }

    static void scanf_double(String id) {
        buffer += "%" + reg + " = call double (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, double 0, double 0), double* %" + id + ")\n";
        reg++;
    }

    static void add_i32(String val1, String val2) {
        buffer += "%" + reg + " = add i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void add_double(String val1, String val2) {
        buffer += "%" + reg + " = fadd double " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void sub_i32(String val1, String val2) {
        buffer += "%" + reg + " = sub i32 " + val1 + ", " + val2 + "\n";
        reg++;
    }

    static void sub_double(String val1, String val2) {
        buffer += "%" + reg + " = fsub double " + val1 + ", " + val2 + "\n";
        reg++;
    }


    static void sitofp(String id) {
        buffer += "%" + reg + " = sitofp i32 " + id + " to double\n";
        reg++;
    }

    static void fptosi(String id) {
        buffer += "%" + reg + " = fptosi double " + id + " to i32\n";
        reg++;
    }

    static void functionstart(String id, Boolean class_member1) {
        class_member = class_member1;
        if (!class_member) {
            main_text += buffer;
            main_reg = reg;
            buffer = "define i32 @" + id + "() nounwind {\n";
            reg = 1;
        }else
        {
            //split string
            String [] s = id.split("\\.");
            buffer_id1 = s[0];
            buffer_id2 = s[1];
            main_text += buffer;
            main_reg = reg;
            buffer1 = "define i32 @";
            buffer2 = "() nounwind {\n";
            reg = 1;
        }
    }

    static void functionend() {
        if(!class_member) {
            buffer += "ret i32 %" + (reg - 1) + "\n";
            buffer += "}\n";
            header_text += buffer;
            buffer = "";
            reg = main_reg;
        }else{
            buffer2 += "ret i32 %" + (reg - 1) + "\n";
            buffer2 += "}\n";
            //class_functions.put(buffer_id, new DeclarationText(buffer1, buffer2));

            functions_strings.put(buffer_id1, new Function_declarations(buffer_id2, buffer1, buffer2));

            reg = main_reg;

            buffer_id1 = "";
            buffer_id2 = "";
            buffer1 = "";
            buffer2 = "";
        }
    }

    static void declare_inner_function(String object_name, String structure_name) {
        //buffer2 = buffer2.replace(buffer_id1, buffer_id2);
        Function_declarations declaration =  functions_strings.get(structure_name);
        declaration.text2 = declaration.text2.replace(structure_name, object_name);//todo buffer1 & buffer2 -> buffer
        String a = declaration.text1+object_name+"."+declaration.function_name+declaration.text2;
        header_text += a;
    }


    static String generate() {
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
        text += "@.string = private constant [4 x i8] c\"%s\\0A\\00\"\n";
        //text += const_text;
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }

    static void close_main() {
        main_text += buffer;
    }

    static void declare_i32(String id, Boolean global, Boolean is_in_class) {
        if (!is_in_class) {
            if (global) {
                header_text += "@" + id + " = global i32 0\n";
            } else {
                buffer += "%" + id + " = alloca i32\n";
            }
        }else
        {
            if (global) {
                header_text += "@" + id + " = global i32 0\n";
            } else {
                buffer2 += "%" + id + " = alloca i32\n";
            }
        }
    }

    static void declare_r(String id) {
        buffer += "%" + id + " = alloca i32\n";
    }

    static void call(String id) {
        buffer += "%" + reg + " = call i32 @" + id + "()\n";
        reg++;
    }

    static void declare_string(String id, Boolean global) {
        if (global) {
            header_text += "@" + id + " = global [6 x i8] c\"hello0\"\n";
        } else {
            buffer += "%" + id + " = alloca [6 x i8]\n";
        }
    }

    static void declare_array(String id, Boolean global) {
        if (global) {
            header_text += "@" + id + " = global [6 x i8] c\"hello0\"\n";
        } else {
            buffer += "%" + id + " = alloca [6 x i8]\n";
        }
    }

    static void assign_string(String id, String value) {
        String[] str = new String[6];
        char c = 'a';
        int ascii = 0;
        for (int i = 0; i < 6; i++) {
            if (i < value.length()) {
                c = value.charAt(i);
                ascii = c;
            } else {
                ascii = 0;
            }
            str[i] = "i8 " + String.valueOf(ascii);
        }

        buffer += "store [6 x i8] " + Arrays.toString(str) + ", [6 x i8]* " + id + "\n";
    }

    static void assign_array(String id, String value) {
        String[] str = new String[6];
        char c = 'a';
        int ascii = 0;
        for (int i = 0; i < 6; i++) {
            if (i < value.length()) {
                c = value.charAt(i);
                ascii = c;
            } else {
                ascii = 0;
            }
            str[i] = "i8 " + String.valueOf(ascii);
        }

        buffer += "store [6 x i8] " + Arrays.toString(str) + ", [6 x i8]* " + id + "\n";
    }

    static void printf_string(String id) {
        buffer += "%" + reg + " = bitcast [6 x i8]* " + id + " to i8*\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.string, i32 0, i32 0), i8* %" + (reg - 1) + ")\n";
        reg++;
    }

    static void printf_array(String id) {
        buffer += "%" + reg + " = bitcast [6 x i8]* " + id + " to i8*\n";
        reg++;
        buffer += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.string, i32 0, i32 0), i8* %" + (reg - 1) + ")\n";
        reg++;
    }


}
