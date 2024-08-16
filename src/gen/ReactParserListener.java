// Generated from C:/Users/ASUS/Desktop/compiler functional/Final/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void enterImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importStatment}.
	 * @param ctx the parse tree
	 */
	void exitImportStatment(ReactParser.ImportStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(ReactParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(ReactParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionalDelaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalDelaration(ReactParser.FunctionalDelarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionalDelaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalDelaration(ReactParser.FunctionalDelarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionalbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalbody(ReactParser.FunctionalbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionalbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalbody(ReactParser.FunctionalbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 */
	void enterHooks(ReactParser.HooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 */
	void exitHooks(ReactParser.HooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(ReactParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(ReactParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(ReactParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(ReactParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(ReactParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(ReactParser.EffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#stateFields}.
	 * @param ctx the parse tree
	 */
	void enterStateFields(ReactParser.StateFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#stateFields}.
	 * @param ctx the parse tree
	 */
	void exitStateFields(ReactParser.StateFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#handlerEvent}.
	 * @param ctx the parse tree
	 */
	void enterHandlerEvent(ReactParser.HandlerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#handlerEvent}.
	 * @param ctx the parse tree
	 */
	void exitHandlerEvent(ReactParser.HandlerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(ReactParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(ReactParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#eventBody}.
	 * @param ctx the parse tree
	 */
	void enterEventBody(ReactParser.EventBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#eventBody}.
	 * @param ctx the parse tree
	 */
	void exitEventBody(ReactParser.EventBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void enterJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 */
	void exitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxSelfCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterJsxSelfCloseTag(ReactParser.JsxSelfCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxSelfCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitJsxSelfCloseTag(ReactParser.JsxSelfCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxTag}.
	 * @param ctx the parse tree
	 */
	void enterJsxTag(ReactParser.JsxTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxTag}.
	 * @param ctx the parse tree
	 */
	void exitJsxTag(ReactParser.JsxTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttributes}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttributes(ReactParser.JsxAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void enterJsxContent(ReactParser.JsxContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxContent}.
	 * @param ctx the parse tree
	 */
	void exitJsxContent(ReactParser.JsxContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxAttribute(ReactParser.JsxAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxstyleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxstyleAttribute(ReactParser.JsxstyleAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxstyleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxstyleAttribute(ReactParser.JsxstyleAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsxsrcAttribute}.
	 * @param ctx the parse tree
	 */
	void enterJsxsrcAttribute(ReactParser.JsxsrcAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsxsrcAttribute}.
	 * @param ctx the parse tree
	 */
	void exitJsxsrcAttribute(ReactParser.JsxsrcAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(ReactParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(ReactParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#styleValue}.
	 * @param ctx the parse tree
	 */
	void enterStyleValue(ReactParser.StyleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#styleValue}.
	 * @param ctx the parse tree
	 */
	void exitStyleValue(ReactParser.StyleValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#srcValue}.
	 * @param ctx the parse tree
	 */
	void enterSrcValue(ReactParser.SrcValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#srcValue}.
	 * @param ctx the parse tree
	 */
	void exitSrcValue(ReactParser.SrcValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#jsFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsFunction(ReactParser.JsFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#jsFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsFunction(ReactParser.JsFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ReactParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ReactParser.ArgumentsContext ctx);
}