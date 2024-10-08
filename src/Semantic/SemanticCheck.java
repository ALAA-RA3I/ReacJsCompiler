
package Semantic;
import SymbolTable.SymbolTable;
import SymbolTable.Row;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class SemanticCheck {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean check() {
        if (!checkIfHooksImport(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "some hooks used in code but not import above" + ANSI_RESET);
            return false;
        }
       else if (!duplicateImportComponent(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "Some Component Duplicate Imported" + ANSI_RESET);
            return false;
        }
       else if (!checkUnmatchedOpeningTags(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "ٍSome Tage not process correctly " + ANSI_RESET);
            return false;
        } else if (!checkForRedublicationVariable(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "some variables are redublicated" + ANSI_RESET);
            return false;
        } else if (!checkForRedublicationFunction(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "some function are redublicated" + ANSI_RESET);
            return false;
        } else if (!checkForExport(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "some Thing not exported" + ANSI_RESET);
            return false;
        } else if (!useUndeclareVariableinJsx(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "some unDeclare variable is use it " + ANSI_RESET);
            return false;
        }
        return true;
    }

    public boolean checkIfHooksImport(SymbolTable symbolTable) {

        Set<String> usedHooks = new HashSet<>();

        Set<String> importedHooks = new HashSet<>();

        for (Row row : symbolTable.rows) {
            if (row != null) {
                String type = row.getType();

                if (type.contains("hooks_name")) {
                    usedHooks.add(row.getValue());
                }

                if (type.contains("lib_hooks_Name")) {
                    importedHooks.add(row.getValue());
                }
            }
        }
        for (String hook : usedHooks) {
            if (!importedHooks.contains(hook)) {
                System.out.println(ANSI_RED + hook + " Not Imported " + ANSI_RESET);
                return false;
            }
        }
        return true;  // All used hooks are properly imported
    }

    public boolean checkForRedublicationVariable(SymbolTable symbolTable) {
        for (int i = 0; i < symbolTable.rows.size(); i++) {
            if (symbolTable.rows.get(i)!=null){
                if (symbolTable.rows.get(i).getType().equals("variable_name")) {
                    String Variable = symbolTable.rows.get(i).getValue();
                    for (int j=symbolTable.rows.size()-1;j>i; j--){
                        if (symbolTable.rows.get(j).getType().equals("variable_name")){
                            if (Variable.equals(symbolTable.rows.get(j).getValue())){
                                System.out.println(ANSI_RED + Variable + " is  already define as variable with same name" + ANSI_RESET);
                                return false ;
                            }
                        }
                    }
                }
                }
            }
        return  true;
        }
        public boolean checkForRedublicationFunction(SymbolTable symbolTable){
            for (int i = 0; i < symbolTable.rows.size(); i++) {
                if (symbolTable.rows.get(i)!=null){
                    if (symbolTable.rows.get(i).getType().equals("Handler_Method_Name")) {
                        String Method = symbolTable.rows.get(i).getValue();
                        for (int j=symbolTable.rows.size()-1;j>i; j--){
                            if (symbolTable.rows.get(j).getType().equals("Handler_Method_Name")){
                                if (Method.equals(symbolTable.rows.get(j).getValue())){
                                    System.out.println(ANSI_RED + Method + " is already define as Method with same name " + ANSI_RESET);
                                    return false ;
                                }
                            }
                        }
                    }
                }
            }
        return true;
        }

        public boolean checkForExport(SymbolTable symbolTable){
        Set <String> exportedComponent = new HashSet<String>();
            Set <String> mainFunction = new HashSet<String>();

            for (Row row : symbolTable.rows) {
                if (row != null) {
                    String type = row.getType();
                    if (type.contains("component_exported")) {
                        exportedComponent.add(row.getValue());
                    }
                    if (type.contains("MainFunction_Name")) {
                        mainFunction.add(row.getValue());
                    }
                }
            }
            for (String function : mainFunction) {
                if (!exportedComponent.contains(function)) {
                    System.out.println(ANSI_RED + function + " Not Exported " + ANSI_RESET);
                    return false;
                }
            }
            return true;

                      }

    public boolean duplicateImportComponent(SymbolTable symbolTable) {
        for (int i = 0 ; i < symbolTable.rows.size() ; i++) {
            if (symbolTable.rows.get(i) != null) {
                if(symbolTable.rows.get(i).getType().equals("lib_hooks_Name")){
                    String lib_hooks_Name = symbolTable.rows.get(i).getValue();
                    for(int j= symbolTable.rows.size()-1; j > i ; j--){
                        if(symbolTable.rows.get(j).getType().equals("lib_hooks_Name")){
                            if(lib_hooks_Name.equals(symbolTable.rows.get(j).getValue())){
                                System.out.println( ANSI_RED + lib_hooks_Name + " Are Duplicate Imported " +ANSI_RESET);
                                return false;
                            }
                        }

                    }
                }
            }
        }
        return true;
    }


    public boolean checkUnmatchedOpeningTags(SymbolTable symbolTable) {
        Stack<String> tagStack = new Stack<>();

        for (int i = 0; i < symbolTable.rows.size(); i++) {
            Row currentRow = symbolTable.rows.get(i);

            if (currentRow != null) {

                if (currentRow.getType().equals("Tag_Name")) {
                    String tagName = currentRow.getValue().substring(1, currentRow.getValue().length() - 1); // Extract tag name
                    tagStack.push(tagName);
                }

                else if (currentRow.getType().equals("Tag_Close_Name")) {
                    String closingTagName = currentRow.getValue();


                    if (closingTagName.contains("<missing JSX_CLOSE_TAG>")) {
                        System.out.println(ANSI_RED +"Error: Missing closing tag for " + tagStack.peek() +ANSI_RESET);
                        return false;
                    }


                    if (tagStack.isEmpty()) {
                        System.out.println(ANSI_RED + "Unexpected closing tag found: " + closingTagName + ANSI_RESET);
                        return false;
                    }


                    String expectedTagName = tagStack.pop();
                    String extractedClosingTag = closingTagName.substring(2, closingTagName.length() - 1);


                    if (!expectedTagName.equals(extractedClosingTag)) {
                        System.out.println(ANSI_RED +"Mismatched tags: Expected closing tag for <" + expectedTagName + ">, but found " + closingTagName + ANSI_RESET);
                        return false;
                    }
                }
            }
        }


        return true;
    }

    public boolean useUndeclareVariableinJsx(SymbolTable symbolTable){
        Set <String> Declare_Variables = new HashSet<String>();
        for (Row row : symbolTable.rows) {
            if (row != null) {
                String type = row.getType();
                if (type.contains("variable_name")) {
                    Declare_Variables.add(row.getValue());
                }
            }
        }
        for (int i = 0; i < symbolTable.rows.size(); i++) {
            if (symbolTable.rows.get(i)!=null){
                if (symbolTable.rows.get(i).getType().equals("Content_HTML_ELEMENT")) {
                    String Variable = symbolTable.rows.get(i).getValue();
                    if(Variable.contains("{") && Variable.contains("}") && !Variable.contains(".")){
                        String Variable1 = symbolTable.rows.get(i).getValue().substring(1, symbolTable.rows.get(i).getValue().length()-1);
                            if (!Declare_Variables.contains(Variable1)) {
                                System.out.println(ANSI_RED + Variable1 + " that you use it is not declare " + ANSI_RESET);
                                return false;
                            }
                    }
                }
            }
        }
        return  true;
    }
    }





