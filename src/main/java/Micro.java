import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.InputStream;
import java.util.Arrays;

public class Micro {

    static StringBuilder stringBuilder;

    public static void main(String[] args) throws Exception {

        stringBuilder = new StringBuilder();
        MicroCLexer lexer = new MicroCLexer(CharStreams.fromFileName((args[0])));
        MicroCParser parser = new MicroCParser(new CommonTokenStream(lexer));
        parser.setErrorHandler(new ParserErrorStrategy());

        try {
            ParseTree parseTree = parser.program();

            if (stringBuilder.length()==0) {
                System.out.println("Accepted");
                JFrame frame = new JFrame("Antlr AST");
                JPanel panel = new JPanel();
                TreeViewer viewer = new TreeViewer(
                        Arrays.asList(parser.getRuleNames()),parseTree);
                viewer.setScale(1.5); // Scale a little
                panel.add(viewer);
                frame.add(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        } catch (NullPointerException | RecognitionException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }

    }

    static public class ParserErrorStrategy extends BailErrorStrategy {

        @Override
        public void reportError(Parser recognizer, RecognitionException ex) {
            stringBuilder.append("Not Accepted");
            System.out.println("reportError: Not Accepted");
        }

        @Override
        public Token recoverInline(Parser recognizer) throws RecognitionException {
            stringBuilder.append("Not Accepted");
            System.out.println("recoverInline: Not Accepted");
            return null;
        }
    }
}
