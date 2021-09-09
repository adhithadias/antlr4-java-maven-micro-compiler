import edu.emory.mathcs.backport.java.util.Arrays;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class TestScanner extends TestResourcesUtils {

    private static final Logger logger = LogManager.getLogger(TestScanner.class);

    @Test
    public void testMicroScanner() {
        CharStream chars = new ANTLRInputStream("int main () { return 0; }");
        MicroCLexer scanner = new MicroCLexer(chars);
        Vocabulary vocabulary = scanner.getVocabulary();

        String[] strList = new String[] { "'int'", "'main'", "'('", "')'", "'{'", "'return'", "INT_LITERAL", "';'", "'}'"  };
        List<String> tokenDisplayNameList = Arrays.asList(strList);
        int i=0;
        for(Token token: scanner.getAllTokens()){
            Assertions.assertEquals(tokenDisplayNameList.get(i), vocabulary.getDisplayName(token.getType()));
            ++i;
        }

        String text = getStringFromInputStream(getFileFromResourceAsStream("test/input1.uC"));

        chars = new ANTLRInputStream(text);
        scanner = new MicroCLexer(chars);


        vocabulary = scanner.getVocabulary();

        StringBuilder stringBuilder = new StringBuilder();
        int j = 0;
        for(Token token: scanner.getAllTokens()){
            stringBuilder
                    .append("Token Type: ").append(vocabulary.getDisplayName(token.getType())).append("\n")
                    .append("Value: ").append(token.getText()).append("\n");
            ++j;
        }

        String expected = getStringFromInputStream(getFileFromResourceAsStream("output/input1.out"));
        Assertions.assertEquals(expected, stringBuilder.toString());

    }

    static StringBuilder stringBuilder;

    @Test
    public void testInputs() {
        String path = "src/test/resources/test/input_files";
        File directoryPath = new File(path);
        File[] listOfFiles = directoryPath.listFiles();
        assert listOfFiles != null;
        for (File listOfFile : listOfFiles) {
            stringBuilder = new StringBuilder();
            String text = getStringFromInputStream(getFileFromResourceAsStream(listOfFile.toString().substring(19)));
            System.out.println(listOfFile.toString().substring(19));
            try {
                CharStream chars = new ANTLRInputStream(text);
                MicroCLexer lexer = new MicroCLexer(chars);
                MicroCParser parser = new MicroCParser(new CommonTokenStream(lexer));
                parser.setErrorHandler(new ParserErrorStrategy());
                ParseTree parseTree = parser.program(); // runs through the parser to see if the input generates a correct parser tree
                stringBuilder.append("Accepted");

            } catch (ParseCancellationException ignored) {
                System.out.println("ParseCancellationException");
            } catch (NullPointerException ignored) {
                System.out.println(ignored.getMessage());
            }

            if (stringBuilder.toString().length()>11) {
                Assertions.assertEquals(
                        getStringFromInputStream(getFileFromResourceAsStream("output/output_files" + listOfFile.toString().substring(35))),
                        stringBuilder.substring(0,12));
                continue;
            }

            Assertions.assertEquals(
                    getStringFromInputStream(getFileFromResourceAsStream("output/output_files" + listOfFile.toString().substring(35))),
                    stringBuilder.toString());

        }

    }

    static private class ParserErrorStrategy extends BailErrorStrategy {

        @Override
        public void reportError(Parser recognizer, RecognitionException ex) {
            stringBuilder.append("Not Accepted");
            System.out.println("Not Accepted 1");
        }

        @Override
        public Token recoverInline(Parser recognizer) throws RecognitionException {
            stringBuilder.append("Not Accepted");
            System.out.println("Not Accepted,2");
            return null;
        }
    }
}
