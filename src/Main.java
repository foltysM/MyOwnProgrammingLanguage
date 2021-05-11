import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//todo zasieg zmiennych
//todo operatory zasiegu & konstruktory


public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("test_classes.x");

        DwunastaLexer lexer = new DwunastaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DwunastaParser parser = new DwunastaParser(tokens);

        ParseTree tree = parser.prog();

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);

    }

}


