import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.InputStream;

public class Micro {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Adhitha Dias\n");

        CharStream chars = new ANTLRInputStream("PROGRAM pg BEGIN PROGRAM_BODY END");
        MicroLexer scanner = new MicroLexer(chars);
        Vocabulary vocabulary = scanner.getVocabulary();

        for(Token token: scanner.getAllTokens()){
            System.out.println("Token Type: " + vocabulary.getDisplayName(token.getType()));
            System.out.println("Value: " + token.getText());
        }

    }
}
