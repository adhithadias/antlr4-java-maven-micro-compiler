public class CTreeVisitor extends CBaseListener{

    @Override
    public void enterPrimaryExpression(CParser.PrimaryExpressionContext ctx) {
        System.out.println("entering primary expression");
    }

    @Override
    public void exitPrimaryExpression(CParser.PrimaryExpressionContext ctx) {
        System.out.println("exiting primary expression: " + ctx.getText());
    }

    @Override
    public void enterAssignmentExpression(CParser.AssignmentExpressionContext ctx) {
        System.out.println("Entering assignment expr: " + ctx.getText());
    }

    @Override public void exitAssignmentExpression(CParser.AssignmentExpressionContext ctx) {

    }

}
