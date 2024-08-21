package Visitor;

import AST.*;
import GenerateCode.CodeGenerate;
import Semantic.SemanticCheck;
import SymbolTable.*;
import gen.ReactParser;
import gen.ReactParserBaseVisitor;

import java.util.ArrayList;

public class ReactVisitor extends ReactParserBaseVisitor {
 public    SymbolTable symbolTable = new SymbolTable() ;
    private String classname ;
    private ArrayList<String> method_names = new ArrayList<String>();

    @Override
    public Object visitProgram(ReactParser.ProgramContext ctx) {
        Program p = new Program();
        for (int i = 0 ; i < ctx.importStatment().size() ; i++){
            p.getImportStatment().add(visitImportStatment(ctx.importStatment(i)));
        }
        p.setFunctionalDeclaration(visitFunctionalDelaration(ctx.functionalDelaration()));
        for (int j = 0 ; j < ctx.exportStatement().size(); j++){
            p.getExportStatment().add(visitExportStatement(ctx.exportStatement(j)));
        }

        this.symbolTable.print();
        SemanticCheck semanticCheck = new SemanticCheck() ;
        semanticCheck.setSymbolTable(this.symbolTable);
        semanticCheck.check();

        return  p ;
    }

    @Override
    public  ImportStatment visitImportStatment(ReactParser.ImportStatmentContext ctx) {
        ImportStatment importStatment = new ImportStatment();
        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
            importStatment.getFramework_property().add(ctx.IDENTIFIER(i).getText());
            Row row = new Row();
            row.setType("lib_hooks_Name");
            row.setValue(ctx.IDENTIFIER(i).getText());
            this.symbolTable.getRows().add(row);
        }
        importStatment.setLib_name(ctx.PATH().getText());

        Row row1 = new Row() ;
        row1.setType("path");
        row1.setValue(ctx.PATH().getText());
        this.symbolTable.getRows().add(row1);

        return importStatment;
    }



    @Override
    public ExportStatment visitExportStatement(ReactParser.ExportStatementContext ctx) {
        ExportStatment exportStatment = new ExportStatment() ;
        exportStatment.setExport_class_name(ctx.IDENTIFIER().getText());
        Row row = new Row();
        row.setType("component_exported");
        row.setValue(ctx.IDENTIFIER().getText());
        this.symbolTable.getRows().add(row);
        return  exportStatment ;
    }

    @Override
    public FunctionalDeclaration visitFunctionalDelaration(ReactParser.FunctionalDelarationContext ctx) {
        FunctionalDeclaration functionalDeclaration = new FunctionalDeclaration();
        functionalDeclaration.setFunction_name(ctx.IDENTIFIER().getText());

        Row row = new Row() ;
        row.setType("MainFunction_Name");
        row.setValue(ctx.IDENTIFIER().getText());
        this.symbolTable.getRows().add(row);

        functionalDeclaration.setFunctionalbody(visitFunctionalbody(ctx.functionalbody()));
        return  functionalDeclaration ;
    }

    @Override
    public Functionalbody visitFunctionalbody(ReactParser.FunctionalbodyContext ctx) {
        Functionalbody functionalbody = new Functionalbody() ;
        if(ctx.hooks() != null){
            for (int i = 0 ; i < ctx.hooks().size() ; i ++){
                functionalbody.getHooks().add(visitHooks(ctx.hooks(i)));
            }
        }
         if(ctx.handlerEvent() != null){
             for (int j = 0 ; j < ctx.handlerEvent().size() ; j ++){
                 functionalbody.getHandlerEvents().add(visitHandlerEvent(ctx.handlerEvent(j)));
             }
        }
         if(ctx.variableDeclaration() != null)
         {
             for (int k = 0 ; k < ctx.variableDeclaration().size() ; k ++){
                 functionalbody.getVariableDeclarations().add(visitVariableDeclaration(ctx.variableDeclaration(k)));
             }
         }

        functionalbody.setJsxElement(visitJsxElement(ctx.jsxElement()));

        return  functionalbody;
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx) {
       VariableDeclaration variableDeclaration = new VariableDeclaration();
       variableDeclaration.setVariable(ctx.IDENTIFIER().getText());

        Row row = new Row() ;
        row.setType("variable_name");
        row.setValue(ctx.IDENTIFIER().getText());
        this.symbolTable.getRows().add(row);
        if(ctx.expression() !=null){
            variableDeclaration.setValue(visitExpression(ctx.expression()));
        }
        return variableDeclaration;
    }

    @Override
    public Expression visitExpression(ReactParser.ExpressionContext ctx) {
       Expression expression = new Expression();
       Row row = new Row() ;
      if(ctx.IDENTIFIER() != null){
          expression.setIdentifier(ctx.IDENTIFIER().getText());
          row.setType("variable_value");
          row.setValue(ctx.IDENTIFIER().getText());
          this.symbolTable.getRows().add(row);
      }
      else if (ctx.NUMBER() != null){
          expression.setNumber(ctx.NUMBER().getText());
          row.setType("variable_value");
          row.setValue(ctx.NUMBER().getText());
          this.symbolTable.getRows().add(row);
      }
      else if(ctx.STRING() != null){
          expression.setString(ctx.STRING().getText());
          row.setType("variable_value");
          row.setValue(ctx.STRING().getText());
          this.symbolTable.getRows().add(row);
      }
      return expression;
    }

    @Override
    public Hooks visitHooks(ReactParser.HooksContext ctx) {
        Hooks hooks = new Hooks() ;
        if(ctx.state() != null){
            hooks.setState(visitState(ctx.state()));
        }
        else if(ctx.ref() != null){
            hooks.setRef(visitRef(ctx.ref()));
        }
        else {
            hooks.setEffect(visitEffect(ctx.effect()));
        }
        return  hooks;
    }

    @Override
    public State visitState(ReactParser.StateContext ctx) {
        State state = new State() ;

        state.setUse_state_value(ctx.IDENTIFIER(0).getText());
        Row row = new  Row () ;
        row.setType("Use_State_Value");
        row.setValue(ctx.IDENTIFIER(0).getText());
        this.symbolTable.getRows().add(row);

        state.setUse_state_method(ctx.IDENTIFIER(1).getText());
        Row row1 = new  Row () ;
        row1.setType("use_state_method");
        row1.setValue(ctx.IDENTIFIER(1).getText());
        this.symbolTable.getRows().add(row1);

        state.setHooks_name(ctx.IDENTIFIER(2).getText());
        Row row2 = new  Row () ;
        row2.setType("hooks_name");
        row2.setValue(ctx.IDENTIFIER(2).getText());
        this.symbolTable.getRows().add(row2);
if(ctx.stateFields() != null)
{
    state.setStateFields(visitStateFields(ctx.stateFields()));
}
else {
    state.setExpression(visitExpression(ctx.expression()));
}

        return state ;
    }

    @Override
    public Ref visitRef(ReactParser.RefContext ctx) {
      Ref ref = new Ref();
      ref.setRefName(ctx.IDENTIFIER(0).getText());
      ref.setHooks_name(ctx.IDENTIFIER(1).getText());
        Row row1 = new  Row () ;
        row1.setType("ref_name");
        row1.setValue(ctx.IDENTIFIER(0).getText());
        this.symbolTable.getRows().add(row1);

        Row row2 = new  Row () ;
        row2.setType("hooks_name");
        row2.setValue(ctx.IDENTIFIER(1).getText());
        this.symbolTable.getRows().add(row2);

      if(ctx.parameters() != null){
          ref.setParameters(visitParameters(ctx.parameters()));
      }
      return ref;
    }

    @Override
    public Effect visitEffect(ReactParser.EffectContext ctx) {
Effect effect = new Effect();
effect.setHooks_name(ctx.IDENTIFIER(0).getText());
effect.setString_value(ctx.STRING().getText());
        Row row = new  Row () ;
        row.setType("hooks_name");
        row.setValue(ctx.IDENTIFIER(0).getText());
        this.symbolTable.getRows().add(row);

        Row row1 = new  Row () ;
        row1.setType("effect_string");
        row1.setValue(ctx.STRING().getText());
        this.symbolTable.getRows().add(row1);


if(ctx.IDENTIFIER(1) != null){
    effect.setDependency(ctx.IDENTIFIER(1).getText());
    Row row2 = new  Row () ;
    row2.setType("effect_dependency");
    row2.setValue(ctx.IDENTIFIER(1).getText());
    this.symbolTable.getRows().add(row2);
}
return effect ;
    }

    @Override
    public StateFields visitStateFields(ReactParser.StateFieldsContext ctx) {
        StateFields stateFields = new StateFields() ;
        for(int i = 0 ; i < ctx.IDENTIFIER().size() ; i ++){
            stateFields.getProperty().add(ctx.IDENTIFIER(i).getText());

            Row row = new Row() ;
            row.setType("Property");
            row.setValue(ctx.IDENTIFIER(i).getText());
            this.symbolTable.getRows().add(row);
        }
        for (int j=0 ; j< ctx.STRING().size() ; j++){
            stateFields.getString().add(ctx.STRING(j).getText());

            Row row = new Row() ;
            row.setType("Property_Default_Value");
            row.setValue(ctx.STRING(j).getText());
            this.symbolTable.getRows().add(row);
        }



        return stateFields;
    }

    @Override
    public HandlerEvent visitHandlerEvent(ReactParser.HandlerEventContext ctx) {
        HandlerEvent handlerEvent = new HandlerEvent() ;

        handlerEvent.setMethodName(ctx.IDENTIFIER().getText());
        handlerEvent.setParameters(visitParameters(ctx.parameters()));
        handlerEvent.setEventBody(visitEventBody(ctx.eventBody()));

        Row row =  new Row() ;
        row.setType("Handler_Method_Name");
        row.setValue(ctx.IDENTIFIER().getText());
        this.symbolTable.getRows().add(row);

        return handlerEvent ;
    }


    @Override
    public Parameters visitParameters(ReactParser.ParametersContext ctx) {
        Parameters parameters = new Parameters() ;
        for(int i = 0 ; i < ctx.IDENTIFIER().size() ; i ++){
            parameters.getParameter_names().add(ctx.IDENTIFIER(i).getText());

            Row row = new Row() ;
            row.setType("Parameter_of_Method");
            row.setValue(ctx.IDENTIFIER(i).getText());
            this.symbolTable.getRows().add(row);

        }
        return  parameters ;
    }

    @Override
    public EventBody visitEventBody(ReactParser.EventBodyContext ctx) {
        EventBody eventBody = new EventBody() ;
        eventBody.setMethod_name(ctx.IDENTIFIER(0).getText());
        Row row = new Row() ;
        row.setType("EventBody_Method_Name");
        row.setValue(ctx.IDENTIFIER(0).getText());
        this.symbolTable.getRows().add(row);
        if(ctx.IDENTIFIER(1) != null){
            for (int i = 0 ;i <ctx.IDENTIFIER().size() ; i++){
                eventBody.getProperty().add(ctx.IDENTIFIER(i).getText());
                Row row1 = new Row() ;
                row1.setType("Property_Handle_method");
                row1.setValue(ctx.IDENTIFIER(i).getText());
                this.symbolTable.getRows().add(row1);
            }
        }
        if(ctx.STRING() != null) {
            eventBody.setString_value(ctx.STRING().getText());
            Row row2 = new Row() ;
            row2.setType("String_Handle_method");
            row2.setValue(ctx.STRING().getText());
            this.symbolTable.getRows().add(row2);
        }

        return eventBody ;
    }


    @Override
    public JsxElement visitJsxElement(ReactParser.JsxElementContext ctx) {
        JsxElement jsxElement = new JsxElement() ;
        if(ctx.jsxTag()!=null){
            jsxElement.setJsxTag(visitJsxTag(ctx.jsxTag()));
        }
        else{
            jsxElement.setJsxSelfCloseTage(visitJsxSelfCloseTag(ctx.jsxSelfCloseTag()));
        }
        return jsxElement ;

    }

    @Override
    public JsxSelfCloseTage visitJsxSelfCloseTag(ReactParser.JsxSelfCloseTagContext ctx) {
        JsxSelfCloseTage jsxSelfCloseTage = new JsxSelfCloseTage();
        String tag_name = ctx.JSX_TAG().getText().substring(1);
        jsxSelfCloseTage.setJsx_tag(tag_name);
        for(int i =0 ; i < ctx.jsxAttributes().size() ; i++){
            if(ctx.jsxAttributes(i)!=null){
                jsxSelfCloseTage.getJsxAttributes().add(visitJsxAttributes(ctx.jsxAttributes(i)));
            }
        }

        Row row = new Row() ;
        row.setType("Self_Tag_Name");
        row.setValue(tag_name);
        this.symbolTable.getRows().add(row);

        return jsxSelfCloseTage;
    }

    @Override
    public JsxTag visitJsxTag(ReactParser.JsxTagContext ctx) {
        JsxTag jsxTag = new JsxTag() ;
        String tag_name = ctx.JSX_TAG().getText()+">";
        jsxTag.setJsx_tag(tag_name);
        String tag_close_name = ctx.JSX_CLOSE_TAG().getText();
        jsxTag.setJsx_close_tag(tag_close_name);
        for(int i =0 ; i < ctx.jsxAttributes().size() ; i++){
            if(ctx.jsxAttributes(i)!=null){
                jsxTag.getJsxAttributes().add(visitJsxAttributes(ctx.jsxAttributes(i)));
            }
        }
        for(int j=0 ;j<ctx.jsxContent().size() ; j ++){
            if(ctx.jsxContent(j) != null){
                jsxTag.getJsxContents().add(visitJsxContent(ctx.jsxContent(j)));
            }
        }
        Row row = new Row() ;
        row.setType("Tag_Name");
        row.setValue(tag_name);
        this.symbolTable.getRows().add(row);
        Row row1 = new Row() ;
        row1.setType("Tag_Close_Name");
        row1.setValue(tag_close_name);
        this.symbolTable.getRows().add(row1);

        return  jsxTag ;
    }

    @Override
    public JsxAttributes visitJsxAttributes(ReactParser.JsxAttributesContext ctx) {
        JsxAttributes jsxAttributes = new JsxAttributes() ;
        if(ctx.jsxAttribute()!=null){
            jsxAttributes.setJsxAttribute(visitJsxAttribute(ctx.jsxAttribute()));
        } else if (ctx.jsxsrcAttribute()!=null) {
            jsxAttributes.setJsxSrcAttribute(visitJsxsrcAttribute(ctx.jsxsrcAttribute()));
        }
        else{
            jsxAttributes.setJsxStyleِAttribute(visitJsxstyleAttribute(ctx.jsxstyleAttribute()));
        }
        return jsxAttributes;
    }


    @Override
    public JsxContent visitJsxContent(ReactParser.JsxContentContext ctx) {
        JsxContent jsxContent = new JsxContent() ;
        if(ctx.jsxElement()!=null){
            jsxContent.setJsxElement(visitJsxElement(ctx.jsxElement()));
        }
else if(ctx.expression() != null){
    jsxContent.setExpression(visitExpression(ctx.expression()));
}
        else if(ctx.IDENTIFIER().size() > 1) {
            jsxContent.setProperty('{' + ctx.IDENTIFIER(0).getText() + '.' + ctx.IDENTIFIER(1).getText() + '}');
            Row row = new Row();
            row.setType("Content_HTML_ELEMENT");
            row.setValue('{' + ctx.IDENTIFIER(0).getText() + '.' + ctx.IDENTIFIER(1).getText() + '}');
            this.symbolTable.getRows().add(row);

        }
        else if (ctx.IDENTIFIER().size() == 1) {
            jsxContent.setProperty('{' + ctx.IDENTIFIER(0).getText() + '}');
            Row row = new Row();
            row.setType("Content_HTML_ELEMENT");
            row.setValue('{' + ctx.IDENTIFIER(0).getText() + '}');
            this.symbolTable.getRows().add(row);
        }
        return  jsxContent;
    }


    @Override
    public JsxAttribute visitJsxAttribute(ReactParser.JsxAttributeContext ctx) {
        JsxAttribute jsxAttribute = new JsxAttribute() ;
        String Attribute_Name = ctx.ATTRIBUTE().getText().substring(0,ctx.ATTRIBUTE().getText().length()-1);
        jsxAttribute.setAttribute(Attribute_Name);
        jsxAttribute.setAttributeValue(visitAttributeValue(ctx.attributeValue()));

        Row row = new Row();
        row.setType("Attribute_Name");
        row.setValue(Attribute_Name);
        this.symbolTable.getRows().add(row);

        return jsxAttribute;
    }


    @Override
    public JsxStyleAttribute visitJsxstyleAttribute(ReactParser.JsxstyleAttributeContext ctx) {
        JsxStyleAttribute jsxStyleAttribute = new JsxStyleAttribute() ;
        String Attribute_Name = ctx.STYLE().getText().substring(0,ctx.STYLE().getText().length()-1);
        jsxStyleAttribute.setStyle(Attribute_Name);
        jsxStyleAttribute.setStyleValue(visitStyleValue(ctx.styleValue()));

        Row row = new Row() ;
        row.setType("Attribute_Name");
        row.setValue(Attribute_Name);
        this.symbolTable.getRows().add(row);

        return jsxStyleAttribute ;
    }
    @Override
    public JsxSrcAttribute visitJsxsrcAttribute(ReactParser.JsxsrcAttributeContext ctx) {
        JsxSrcAttribute jsxSrcAttribute = new JsxSrcAttribute() ;
        String Attribute_Name = ctx.SRC().getText().substring(0,ctx.SRC().getText().length()-1);
        jsxSrcAttribute.setSrc(Attribute_Name);
        jsxSrcAttribute.setSrcValue(visitSrcValue(ctx.srcValue()));

        Row row = new Row() ;
        row.setType("Attribute_Name");
        row.setValue(Attribute_Name);
        this.symbolTable.getRows().add(row);

        return jsxSrcAttribute;
    }
    @Override
    public AttributeValue visitAttributeValue(ReactParser.AttributeValueContext ctx) {
        AttributeValue attributeValue = new AttributeValue() ;
        if(ctx.STRING()!=null) {
            attributeValue.setString(ctx.STRING().getText());
            Row row = new Row() ;
            row.setType("Attribute_Value");
            row.setValue(ctx.STRING().getText());
            this.symbolTable.getRows().add(row);
        }
        else {
            attributeValue.setJsFunction(visitJsFunction(ctx.jsFunction()));
        }
        return attributeValue;
    }
    @Override
    public StyleValue visitStyleValue(ReactParser.StyleValueContext ctx) {
        StyleValue styleValue = new StyleValue() ;
        for(int i= 0 ; i< ctx.IDENTIFIER().size() ; i ++){
            styleValue.getIdentifier().add(ctx.IDENTIFIER(i).getText());
            Row row = new Row() ;
            row.setType("Css_Property");
            row.setValue(ctx.IDENTIFIER(i).getText());
            this.symbolTable.getRows().add(row);

            if(ctx.STRING(i)!=null){
                styleValue.getString().add(ctx.STRING(i).getText());
                Row row1 = new Row() ;
                row1.setType("Css_Property_Value");
                row1.setValue(ctx.STRING(i).getText());
                this.symbolTable.getRows().add(row1);
            }
            else {
                styleValue.getNumber().add(Integer.parseInt(ctx.NUMBER(i).getText()));
                Row row1 = new Row() ;
                row1.setType("Css_Property_Value");
                row1.setValue(ctx.NUMBER(i).getText());
                this.symbolTable.getRows().add(row1);
            }
        }
        return  styleValue ;
    }

    @Override
    public SrcValue visitSrcValue(ReactParser.SrcValueContext ctx) {
        SrcValue srcValue = new SrcValue() ;
        if(ctx.STRING()!=null){
            srcValue.setString(ctx.STRING().getText());
            Row row = new Row() ;
            row.setType("ImgSrcValue");
            row.setValue(ctx.STRING().getText());
            this.symbolTable.getRows().add(row);
        }
        else {
            srcValue.setIdentifier(ctx.IDENTIFIER(0).getText()+'.'+ctx.IDENTIFIER(1).getText());
            Row row = new Row() ;
            row.setType("ImgSrcValue");
            row.setValue(ctx.IDENTIFIER(0).getText()+'.'+ctx.IDENTIFIER(1).getText());
            this.symbolTable.getRows().add(row);


        }
        return  srcValue ;
    }


    @Override
    public JsFunction visitJsFunction(ReactParser.JsFunctionContext ctx) {
        JsFunction jsFunction = new JsFunction() ;
        jsFunction.setFunctionBody(visitFunctionBody(ctx.functionBody()));
        return jsFunction ;
    }

    @Override
    public FunctionBody visitFunctionBody(ReactParser.FunctionBodyContext ctx) {
        FunctionBody functionBody = new FunctionBody() ;
//        String methodName = ctx.IDENTIFIER().getText();
//        if (!method_names.contains(methodName)) {
//            throw new RuntimeException("Method " + methodName + " has not been defined");
//        }
//        else {
        functionBody.setMethod_name(ctx.IDENTIFIER().getText());
        functionBody.setArguments(visitArguments(ctx.arguments()));
        Row row = new Row() ;
        row.setType("Call_By_Method_Name");
        row.setValue(ctx.IDENTIFIER().getText());
        this.symbolTable.getRows().add(row);
//        }
        return functionBody ;
    }

    @Override
    public Arguments visitArguments(ReactParser.ArgumentsContext ctx) {
        Arguments arguments = new Arguments() ;
        for(int i = 0 ; i < ctx.STRING().size() ; i ++){
            if(ctx.STRING(i)!=null){
                arguments.getStrings().add(ctx.STRING(i).getText());
                Row row = new Row() ;
                row.setType("Function_Arguments");
                row.setValue(ctx.STRING(i).getText());
                this.symbolTable.getRows().add(row);
            }
        }
        return  arguments ;
    }

}

