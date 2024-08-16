// Generated from C:/Users/ASUS/Desktop/compiler functional/Final/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(ReactParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionalDelaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalDelaration(ReactParser.FunctionalDelarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionalbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalbody(ReactParser.FunctionalbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooks(ReactParser.HooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(ReactParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(ReactParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#effect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffect(ReactParser.EffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#stateFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateFields(ReactParser.StateFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#handlerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerEvent(ReactParser.HandlerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(ReactParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#eventBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBody(ReactParser.EventBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxSelfCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSelfCloseTag(ReactParser.JsxSelfCloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxTag(ReactParser.JsxTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxContent(ReactParser.JsxContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxstyleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxstyleAttribute(ReactParser.JsxstyleAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxsrcAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxsrcAttribute(ReactParser.JsxsrcAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(ReactParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#styleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleValue(ReactParser.StyleValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#srcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcValue(ReactParser.SrcValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsFunction(ReactParser.JsFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ReactParser.ArgumentsContext ctx);
}