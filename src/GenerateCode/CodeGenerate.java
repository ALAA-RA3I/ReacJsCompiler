package GenerateCode;

import SymbolTable.SymbolTable;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CodeGenerate {
    SymbolTable symbolTable ;
    String Html = "";

    String FileName ;

    public void generateHtml(SymbolTable symbolTable) {
            List<String> productNames = new ArrayList<>();
            List<String> imagePaths = new ArrayList<>();
            StringBuilder dynamicHtml = new StringBuilder(); // لتجميع كود HTML

            // بداية كود الـ HTML
            dynamicHtml.append("<!DOCTYPE html>\n")
                    .append("<html lang=\"en\">\n")
                    .append("<head>\n")
                    .append("    <meta charset=\"UTF-8\">\n")
                    .append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n")
                    .append("    <title>Product Page</title>\n")
                    .append("    <style>\n")
                    .append("        .container {\n")
                    .append("            display: flex;\n")
                    .append("        }\n")
                    .append("        .left-side {\n")
                    .append("            flex: 1;\n")
                    .append("        }\n")
                    .append("        .right-side {\n")
                    .append("            flex: 1;\n")
                    .append("        }\n")
                    .append("        img {\n")
                    .append("            width: 300px;\n")
                    .append("            height: 200px;\n")
                    .append("        }\n")
                    .append("    </style>\n")
                    .append("</head>\n")
                    .append("<body>\n")
                    .append("    <div class=\"container\">\n")
                    .append("        <div class=\"left-side\">\n")
                    .append("            <h1>All Products</h1>\n");

            // جمع أسماء المنتجات
            for (int i = 0; i < symbolTable.rows.size(); i++) {
                if (symbolTable.rows.get(i) != null) {
                    if (symbolTable.rows.get(i).getType().contains("variable_value")) {
                        productNames.add(symbolTable.rows.get(i).getValue());
                    }
                }
            }

            // جمع مسارات الصور
            for (int i = 0; i < symbolTable.rows.size(); i++) {
                if (symbolTable.rows.get(i) != null) {
                    if (symbolTable.rows.get(i).getType().contains("ImgSrcValue")) {
                        imagePaths.add(symbolTable.rows.get(i).getValue());
                    }
                }
            }

            // بناء الـ HTML باستخدام القيم التي تم جمعها
            for (int i = 0; i < productNames.size(); i++) {
                String productName = productNames.get(i);
                String imagePath = i < imagePaths.size() ? imagePaths.get(i) : "";

                dynamicHtml.append("<div>\n")
                        .append("<h3>").append(productName).append("</h3>\n")
                        .append("<img id=\"").append(productName.toLowerCase().replace(" ", "-"))
                        .append("-img\" src=\"")
                        .append(imagePath)
                        .append("\" alt=\"")
                        .append(productName)
                        .append("\"/>\n")
                        .append("</div>\n");
            }

            // إكمال الـ HTML
            dynamicHtml.append("        </div>\n")
                    .append("        <div class=\"right-side\">\n")
                    .append("            <h1>Product Description</h1>\n")
                    .append("            <p id=\"product-name\"></p>\n")
                    .append("            <p id=\"product-description\"></p>\n")
                    .append("            <p id=\"product-title\"></p>\n")
                    .append("        </div>\n")
                    .append("    </div>\n")
                    .append("\n")
                    .append("    <script src=\"script.js\"></script>\n")
                    .append("\n")
                    .append("</body>\n")
                    .append("</html>");

            // تخزين الـ HTML النهائي في المتغير Html
            this.Html = dynamicHtml.toString();
        }

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
        generateHtml(this.symbolTable);
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
