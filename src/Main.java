import org.antlr.runtime.tree.TreeWizard;
import org.antlr.v4.codegen.model.BaseVisitorFile;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//todo string
//todo array
//todo function
//todo zasieg zmiennych


public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("test_math.x");

        DwunastaLexer lexer = new DwunastaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DwunastaParser parser = new DwunastaParser(tokens);

        ParseTree tree = parser.prog();

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }

}


