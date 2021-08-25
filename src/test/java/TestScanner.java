import edu.emory.mathcs.backport.java.util.Arrays;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestScanner extends TestResourcesUtils {

    private static final Logger logger = LogManager.getLogger(TestScanner.class);

    @Test
    public void testMicroScanner() {
        CharStream chars = new ANTLRInputStream("PROGRAM pg BEGIN PROGRAM_BODY END");
        MicroLexer scanner = new MicroLexer(chars);
        Vocabulary vocabulary = scanner.getVocabulary();

        String[] strList = new String[] { "'PROGRAM'", "Identifier", "'BEGIN'", "'PROGRAM_BODY'", "'END'" };
        List<String> tokenDisplayNameList = Arrays.asList(strList);
        int i=0;
        for(Token token: scanner.getAllTokens()){
            Assertions.assertEquals(tokenDisplayNameList.get(i), vocabulary.getDisplayName(token.getType()));
            ++i;
        }

        String text = getStringFromInputStream(getFileFromResourceAsStream("test1/input1.micro"));

        chars = new ANTLRInputStream(text);
        scanner = new MicroLexer(chars);
        vocabulary = scanner.getVocabulary();

        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        for(Token token: scanner.getAllTokens()){
            stringBuilder
                    .append("Token Type: ").append(vocabulary.getDisplayName(token.getType())).append("\n")
                    .append("Value: ").append(token.getText()).append("\n");
            ++j;
        }

        String expected = getStringFromInputStream(getFileFromResourceAsStream("test1/input1.result"));
        Assertions.assertEquals(expected, stringBuilder.toString());
    }
}
