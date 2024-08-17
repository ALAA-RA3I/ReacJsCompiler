
package Semantic;
import SymbolTable.SymbolTable;
import SymbolTable.Row;

import java.util.HashSet;
import java.util.Set;

public class SemanticCheck {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    SymbolTable symbolTable;

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public boolean check() {
        if (checkIfHooksImport(this.symbolTable) == false) {
            System.out.println(ANSI_RED + "some hooks used in code but not import above" + ANSI_RESET);
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
        // Set to store all used hooks in the code
        Set<String> usedHooks = new HashSet<>();

        // Set to store all imported hooks
        Set<String> importedHooks = new HashSet<>();

        // First, iterate over the symbol table to gather used hooks and imported hooks
        for (Row row : symbolTable.rows) {
            if (row != null) {
                String type = row.getType();

                // Check for hooks usage
                if (type.contains("hooks_name")) {
                    usedHooks.add(row.getValue());
                }

                // Check for hooks import
                if (type.contains("lib_hooks_Name")) {
                    importedHooks.add(row.getValue());
                }
            }
        }

        // Check if all used hooks are imported
        for (String hook : usedHooks) {
            if (!importedHooks.contains(hook)) {
                return false;  // Found a hook that is used but not imported
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
    }






