import edu.emory.mathcs.backport.java.util.Arrays;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestScanner {

    @Test
    public void testMicroScanner() {
        CharStream chars = new ANTLRInputStream("PROGRAM pg BEGIN PROGRAM_BODY END");
        MicroLexer scanner = new MicroLexer(chars);
        Vocabulary vocabulary = scanner.getVocabulary();

        String[] strList = new String[] { "'PROGRAM'", "Identifier", "'BEGIN'", "'PROGRAM_BODY'", "'END'" };
        List<String> tokenDisplayNameList = Arrays.asList(strList);
        int i=0;
        for(Token token: scanner.getAllTokens()){
            System.out.println("Token Type: " + vocabulary.getDisplayName(token.getType()));
            System.out.println("Value: " + token.getText());
            Assertions.assertEquals(tokenDisplayNameList.get(i), vocabulary.getDisplayName(token.getType()));
            ++i;
        }
    }
}
