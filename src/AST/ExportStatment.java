package AST;

public class ExportStatment {
    String export_class_name ;

    public String getExport_class_name() {
        return export_class_name;
    }

    public void setExport_class_name(String export_class_name) {
        this.export_class_name = export_class_name;
    }

    @Override
    public String toString() {
        return "ExportStatment{" +
                "export_class_name='" + export_class_name + '\'' +
                '}';
    }
}
