import AST.Program;
import GenerateCode.CodeGenerate;
import Visitor.ReactVisitor;
import gen.ReactLexer;
import gen.ReactParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//      String source = "Files/test.txt";
        String source = "Files/FunctionalComponentTest1.txt";
        CharStream charstream = CharStreams.fromFileName(source);
        ReactLexer lexer = new ReactLexer(charstream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ReactParser parser = new ReactParser(tokens) ;
        ParseTree ast = parser.program();
        ReactVisitor exampleVisitor = new ReactVisitor();
        Program program = (Program) exampleVisitor.visit(ast);
        CodeGenerate codeGenerate = new CodeGenerate(exampleVisitor.symbolTable);
        codeGenerate.generate();

//        System.out.println(program);
    }
}

