// Generated from F:/OneDrive/DAVID/1.UNIVERSIDAD/1.UAH/3º/1ºCUATRI/PDL/1. 24-25/LAB/Extraordinaria/PdLExtraordinaria/parserCalc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parserCalc}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parserCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parserCalc#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(parserCalc.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementoFuncion}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoFuncion(parserCalc.ElementoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementoBegin}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoBegin(parserCalc.ElementoBeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementoLlamadaFuncion}
	 * labeled alternative in {@link parserCalc#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoLlamadaFuncion(parserCalc.ElementoLlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinicionFuncion}
	 * labeled alternative in {@link parserCalc#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionFuncion(parserCalc.DefinicionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(parserCalc.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LlamadaFuncion}
	 * labeled alternative in {@link parserCalc#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(parserCalc.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(parserCalc.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BloqueBegin}
	 * labeled alternative in {@link parserCalc#beginStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueBegin(parserCalc.BloqueBeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaAsignacion}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaAsignacion(parserCalc.SentenciaAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaIf}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaIf(parserCalc.SentenciaIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaWhile}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaWhile(parserCalc.SentenciaWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaFor}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaFor(parserCalc.SentenciaForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaReturn}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaReturn(parserCalc.SentenciaReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaPrint}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaPrint(parserCalc.SentenciaPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenciaLlamadaFuncion}
	 * labeled alternative in {@link parserCalc#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaLlamadaFuncion(parserCalc.SentenciaLlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#asignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignStatement(parserCalc.AsignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(parserCalc.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(parserCalc.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(parserCalc.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(parserCalc.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(parserCalc.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondicionComparacion}
	 * labeled alternative in {@link parserCalc#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionComparacion(parserCalc.CondicionComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserCalc#compOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOperator(parserCalc.CompOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Numero}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(parserCalc.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(parserCalc.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(parserCalc.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDivMod}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivMod(parserCalc.MultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LlamadaFuncionExpr}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncionExpr(parserCalc.LlamadaFuncionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Potencia}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(parserCalc.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RaizCuadrada}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaizCuadrada(parserCalc.RaizCuadradaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumaResta}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumaResta(parserCalc.SumaRestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negacion}
	 * labeled alternative in {@link parserCalc#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(parserCalc.NegacionContext ctx);
}