package AST;

import java.util.ArrayList;

public class Program {
    ArrayList<ImportStatment> importStatment = new ArrayList<ImportStatment>();
    FunctionalDeclaration functionalDeclaration ;
    ArrayList<ExportStatment> exportStatment = new ArrayList<ExportStatment>();

    public ArrayList<ImportStatment> getImportStatment() {
        return importStatment;
    }

    public void setImportStatment(ArrayList<ImportStatment> importStatment) {
        this.importStatment = importStatment;
    }

    public FunctionalDeclaration getFunctionalDeclaration() {
        return functionalDeclaration;
    }

    public void setFunctionalDeclaration(FunctionalDeclaration functionalDeclaration) {
        this.functionalDeclaration = functionalDeclaration;
    }

    public ArrayList<ExportStatment> getExportStatment() {
        return exportStatment;
    }

    public void setExportStatment(ArrayList<ExportStatment> exportStatment) {
        this.exportStatment = exportStatment;
    }

    @Override
    public String toString() {
        return "Program{" +
                "importStatment=" + importStatment +
                ", functionalDeclaration=" + functionalDeclaration +
                ", exportStatment=" + exportStatment +
                '}';
    }
}
