import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.InputStream;

public class Micro {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Adhitha Dias\n");

        ANTLRInputStream antlrInputStream = new ANTLRInputStream("hello world this is a simple text");


        HelloLexer lexer = new HelloLexer(antlrInputStream);

        CommonTokenStream tokenStream = new CommonTokenStream( lexer );
        HelloParser parser = new HelloParser( tokenStream );
        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new HelloWalker(), tree );

        InputStream inputStream = Micro.class.getResourceAsStream("/input.txt");
        antlrInputStream = new ANTLRInputStream("int main () { return 0; }");
        CLexer cLexer = new CLexer(CharStreams.fromStream(inputStream));
        tokenStream = new CommonTokenStream(cLexer);
        CParser cParser = new CParser(tokenStream);

        ParseTree cTree = cParser.primaryExpression();
        ParseTreeWalker cWalker = new ParseTreeWalker();
        cWalker.walk(new CTreeVisitor(), cTree);

        CharStream chars = new ANTLRInputStream("PROGRAM pg BEGIN PROGRAM_BODY END");
        MicroLexer scanner = new MicroLexer(chars);
        Vocabulary vocabulary = scanner.getVocabulary();

        for(Token token: scanner.getAllTokens()){
            System.out.println("Token Type: " + vocabulary.getDisplayName(token.getType()));
            System.out.println("Value: " + token.getText());
        }

    }
}
