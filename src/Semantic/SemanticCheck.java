
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
 }

//    public boolean duplicateImportComponent(){
//
//    }



