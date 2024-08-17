
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
        if (!duplicateImportComponent(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "Some Component Duplicate Imported" + ANSI_RESET);
            return false;
        }
        if (!checkUnmatchedOpeningTags(this.symbolTable)) {
            System.out.println(ANSI_YELLOW + "ٍSome Tage not process correctly " + ANSI_RESET);
            return false;
        } else if (!checkForRedublicationVariable(this.symbolTable)) {
            System.out.println(ANSI_RED + "some variables are redublicated" + ANSI_RESET);
            return false;
        } else if (!checkForRedublicationFunction(this.symbolTable)) {
            System.out.println(ANSI_RED + "some function are redublicated" + ANSI_RESET);
            return false;
        } else if (!checkForExport(this.symbolTable)) {
            System.out.println(ANSI_RED + "some " + ANSI_RESET);
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
                        String Variable = symbolTable.rows.get(i).getValue();
                        for (int j=symbolTable.rows.size()-1;j>i; j--){
                            if (symbolTable.rows.get(j).getType().equals("Handler_Method_Name")){
                                if (Variable.equals(symbolTable.rows.get(j).getValue())){
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
            for (int i = 0; i<symbolTable.rows.size(); i++ ){
                if (symbolTable.rows.get(i)!=null) {
                    if (symbolTable.rows.get(i).getType().equals("MainFunction_Name")) {
                        String Variable = symbolTable.rows.get(i).getValue();
                        for (int j=0;j<symbolTable.rows.size();j++){
                            if (symbolTable.rows.get(j).getType().equals("component_exported")){
                                if (!Variable.equals(symbolTable.rows.get(j).getValue())){
                                    return false;
                                }
                            }
                        }
                    }
                }
            }return true;
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
        Stack<String> tagStack = new Stack<>(); // Stack to track opening tags

        for (int i = 0; i < symbolTable.rows.size(); i++) {
            Row currentRow = symbolTable.rows.get(i);

            if (currentRow != null) {
                // Process opening tags
                if (currentRow.getType().equals("Tag_Name")) {
                    String tagName = currentRow.getValue().substring(1, currentRow.getValue().length() - 1); // Extract tag name
                    tagStack.push(tagName); // Push the opening tag onto the stack
                }
                // Process closing tags
                else if (currentRow.getType().equals("Tag_Close_Name")) {
                    String closingTagName = currentRow.getValue();

                    // Check if it's a missing closing tag generated by the parser
                    if (closingTagName.contains("<missing JSX_CLOSE_TAG>")) {
                        System.out.println(ANSI_RED +"Error: Missing closing tag for " + tagStack.peek() +ANSI_RESET);
                        return false; // Error: an opening tag is missing its closing tag
                    }

                    // Check if the stack is empty (no matching opening tag)
                    if (tagStack.isEmpty()) {
                        System.out.println(ANSI_RED + "Unexpected closing tag found: " + closingTagName + ANSI_RESET);
                        return false; // Error: closing tag without an opening tag
                    }

                    // Get the last opened tag from the stack
                    String expectedTagName = tagStack.pop(); // Pop the last opened tag
                    String extractedClosingTag = closingTagName.substring(2, closingTagName.length() - 1); // Extract closing tag name

                    // Check if the closing tag matches the last opened tag
                    if (!expectedTagName.equals(extractedClosingTag)) {
                        System.out.println(ANSI_RED +"Mismatched tags: Expected closing tag for <" + expectedTagName + ">, but found " + closingTagName + ANSI_RESET);
                        return false; // Error: tags do not match
                    }
                }
            }
        }


        return true; // All tags are matched correctly
    }

    }





