// Generated from Micro.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MicroParser}.
 */
public interface MicroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MicroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MicroParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MicroParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MicroParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MicroParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#program_body}.
	 * @param ctx the parse tree
	 */
	void enterProgram_body(MicroParser.Program_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#program_body}.
	 * @param ctx the parse tree
	 */
	void exitProgram_body(MicroParser.Program_bodyContext ctx);
}