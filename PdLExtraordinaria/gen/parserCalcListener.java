// Generated from F:/OneDrive/DAVID/1.UNIVERSIDAD/1.UAH/3º/1ºCUATRI/PDL/1. 24-25/LAB/Extraordinaria/PdLExtraordinaria/parserCalc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parserCalc}.
 */
public interface parserCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parserCalc#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(parserCalc.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(parserCalc.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementoFuncion}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 */
	void enterElementoFuncion(parserCalc.ElementoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementoFuncion}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 */
	void exitElementoFuncion(parserCalc.ElementoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementoBegin}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 */
	void enterElementoBegin(parserCalc.ElementoBeginContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementoBegin}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 */
	void exitElementoBegin(parserCalc.ElementoBeginContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementoLlamadaFuncion}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 */
	void enterElementoLlamadaFuncion(parserCalc.ElementoLlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementoLlamadaFuncion}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 */
	void exitElementoLlamadaFuncion(parserCalc.ElementoLlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinicionFuncion}
	 * labeled alternative in {@link parserCalc#function}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionFuncion(parserCalc.DefinicionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinicionFuncion}
	 * labeled alternative in {@link parserCalc#function}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionFuncion(parserCalc.DefinicionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(parserCalc.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(parserCalc.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LlamadaFuncion}
	 * labeled alternative in {@link parserCalc#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(parserCalc.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LlamadaFuncion}
	 * labeled alternative in {@link parserCalc#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(parserCalc.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(parserCalc.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(parserCalc.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BloqueBegin}
	 * labeled alternative in {@link parserCalc#beginStatement}.
	 * @param ctx the parse tree
	 */
	void enterBloqueBegin(parserCalc.BloqueBeginContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BloqueBegin}
	 * labeled alternative in {@link parserCalc#beginStatement}.
	 * @param ctx the parse tree
	 */
	void exitBloqueBegin(parserCalc.BloqueBeginContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaAsignacion}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaAsignacion(parserCalc.SentenciaAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaAsignacion}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaAsignacion(parserCalc.SentenciaAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaIf}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIf(parserCalc.SentenciaIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaIf}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIf(parserCalc.SentenciaIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaWhile}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaWhile(parserCalc.SentenciaWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaWhile}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaWhile(parserCalc.SentenciaWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaFor}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaFor(parserCalc.SentenciaForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaFor}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaFor(parserCalc.SentenciaForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaReturn}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaReturn(parserCalc.SentenciaReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaReturn}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaReturn(parserCalc.SentenciaReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaPrint}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaPrint(parserCalc.SentenciaPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaPrint}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaPrint(parserCalc.SentenciaPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenciaLlamadaFuncion}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaLlamadaFuncion(parserCalc.SentenciaLlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenciaLlamadaFuncion}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaLlamadaFuncion(parserCalc.SentenciaLlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#asignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAsignStatement(parserCalc.AsignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#asignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAsignStatement(parserCalc.AsignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(parserCalc.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(parserCalc.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(parserCalc.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(parserCalc.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(parserCalc.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(parserCalc.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(parserCalc.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(parserCalc.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(parserCalc.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(parserCalc.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondicionComparacion}
	 * labeled alternative in {@link parserCalc#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondicionComparacion(parserCalc.CondicionComparacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondicionComparacion}
	 * labeled alternative in {@link parserCalc#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondicionComparacion(parserCalc.CondicionComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserCalc#compOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompOperator(parserCalc.CompOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserCalc#compOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompOperator(parserCalc.CompOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumero(parserCalc.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumero(parserCalc.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(parserCalc.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(parserCalc.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(parserCalc.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(parserCalc.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivMod(parserCalc.MultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivMod(parserCalc.MultDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LlamadaFuncionExpr}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncionExpr(parserCalc.LlamadaFuncionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LlamadaFuncionExpr}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncionExpr(parserCalc.LlamadaFuncionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Potencia}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(parserCalc.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Potencia}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(parserCalc.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaizCuadrada}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterRaizCuadrada(parserCalc.RaizCuadradaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaizCuadrada}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitRaizCuadrada(parserCalc.RaizCuadradaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterSumaResta(parserCalc.SumaRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitSumaResta(parserCalc.SumaRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negacion}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegacion(parserCalc.NegacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negacion}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegacion(parserCalc.NegacionContext ctx);
}