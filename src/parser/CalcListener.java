// Generated from C:/Users/Vincent/dev/CCalcCop/CCalc/src/parser\Calc.g4 by ANTLR 4.9
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(CalcParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(CalcParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(CalcParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(CalcParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CalcParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CalcParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(CalcParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(CalcParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCondExp(CalcParser.CondExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCondExp(CalcParser.CondExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnExp(CalcParser.UnExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnExp(CalcParser.UnExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(CalcParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(CalcParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinExp(CalcParser.BinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinExp}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinExp(CalcParser.BinExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLit}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(CalcParser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLit}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(CalcParser.IntLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolLit(CalcParser.BoolLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLit}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolLit(CalcParser.BoolLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 */
	void enterVariableId(CalcParser.VariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#variableId}.
	 * @param ctx the parse tree
	 */
	void exitVariableId(CalcParser.VariableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#functionId}.
	 * @param ctx the parse tree
	 */
	void enterFunctionId(CalcParser.FunctionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#functionId}.
	 * @param ctx the parse tree
	 */
	void exitFunctionId(CalcParser.FunctionIdContext ctx);
}