package GenerateCode;

import SymbolTable.SymbolTable;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CodeGenerate {
    SymbolTable symbolTable ;
    String FileName ;

    String Html = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>Product Page</title>\n" +
            "    <style>\n" +
            "        .container {\n" +
            "            display: flex;\n" +
            "        }\n" +
            "        .left-side {\n" +
            "            flex: 1;\n" +
            "        }\n" +
            "        .right-side {\n" +
            "            flex: 1;\n" +
            "        }\n" +
            "        img {\n" +
            "            width: 300px;\n" +
            "            height: 200px;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "    <div class=\"container\">\n" +
            "        <div class=\"left-side\">\n" +
            "            <h1>All Products</h1>\n" +
            "            <div>\n" +
            "                <h3>Product 1</h3>\n" +
            "                <img id=\"product1-img\" src=\"./images/OIP (1).jpg\" alt=\"Product 1\" />\n" +
            "            </div>\n" +
            "            <div>\n" +
            "                <h3>Product 2</h3>\n" +
            "                <img id=\"product2-img\" src=\"./images/OIP.jpg\" alt=\"Product 2\" />\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"right-side\">\n" +
            "            <h1>Product Description</h1>\n" +
            "            <p id=\"product-name\"></p>\n" +
            "            <p id=\"product-description\"></p>\n" +
            "            <p id=\"product-title\"></p>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "\n" +
            "    <script src=\"script.js\"></script>\n" +
            "\n" +
            "</body>\n" +
            "</html>";

/////////////// js /////////////////////
    String JavaScript = "" ;
   public String Property = "" ;
 public    String Method = "" ;
  public   String Handler_Method = "" ;
    boolean isProperty = false ;
    boolean isMethod = false ;
    boolean isHandler_Method = false ;


public CodeGenerate(SymbolTable symbolTable){
    this.symbolTable = symbolTable;
}
    public void generate(){
        PrintWriter printWriter ;
        PrintWriter printWriter1 ;
        this.Property(this.symbolTable);
        this.Method(this.symbolTable);
        this.Handler_Method(this.symbolTable);
        this.JavaScriptCode();
try {
    printWriter = new PrintWriter("Result/script.js");
    printWriter1 = new PrintWriter("Result/index.html");
}
catch (FileNotFoundException e){
    throw new RuntimeException(e);
}
        printWriter.println(this.JavaScript);
        printWriter1.println(this.Html);
        printWriter1.close();
        printWriter.close();
    }


//////////////// java Script ////////////////////
public void JavaScriptCode(){
            this.JavaScript =  this.Property  + "\n" +
                    this.Method + "\n" +
                    this.Handler_Method + "\n" +
                    "    document.getElementById('product1-img').addEventListener('click', function() { \n " +
                "        handleProductClick(\"Description for Product 1\", \"Product1\", \"title1\"); \n " +
                "    }); \n" +
                "\n" +
                "    document.getElementById('product2-img').addEventListener('click', function() { \n " +
                "        handleProductClick(\"Description for Product 2\", \"Product2\", \"title2\");\n " +
                "    }); \n" +
                "}); \n "
                ;
}
public void Property(SymbolTable symbolTable){
    for(int i = 0 ; i<symbolTable.rows.size() ;  i++){
        if(symbolTable.rows.get(i) != null){
            if(symbolTable.rows.get(i).getType().contains("Property")){
                isProperty = true ;
                break;
            }
        }
    }
    if(!isProperty){
        this.Property = "";
    }
    else {
        this.Property =  " document.addEventListener('DOMContentLoaded', function() { \n" +
                " let productDetail = {\n " +
                " name: \"\"," +
                " description: \"\", " +
                " title: \"\" " +
                "  }; " +
                " \n " ;
    }
    }
    public  void Method (SymbolTable symbolTable){
        for(int i = 0 ; i<symbolTable.rows.size() ;  i++){
            if(symbolTable.rows.get(i) != null){
                if(symbolTable.rows.get(i).getType().contains("use_state_method")){
                    isMethod = true ;
                    break;
                }
            }
        }
        if(!isMethod){
            this.Method = "";
        }
        else {
            this.Method =  "   const setProductDetail = (details) => { \n " +
                    "  productDetail = { ...productDetail, ...details }; \n" +
                    "  document.getElementById('product-name').textContent = productDetail.name;\n " +
                    "  document.getElementById('product-description').textContent = productDetail.description;\n" +
                    "        document.getElementById('product-title').textContent = productDetail.title;\n " +
                    "    }; \n" +
                    " \n " ;
        }
    }
    public void Handler_Method(SymbolTable symbolTable){
        for(int i = 0 ; i<symbolTable.rows.size() ;  i++){
            if(symbolTable.rows.get(i) != null){
                if(symbolTable.rows.get(i).getType().contains("Handler_Method_Name")){
                    isHandler_Method = true ;
                    break;
                }
            }
        }

        if(!isHandler_Method){
            this.Handler_Method = "";
        }
        else {
             this.Handler_Method = " const handleProductClick = (description, name, title) => { \n " +
                    "        setProductDetail({ description, name, title });\n " +
                    "    };  \n" +
                    "\n ";
        }
    }


    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
}
