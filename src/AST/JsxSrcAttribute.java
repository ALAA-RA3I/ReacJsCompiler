package AST;

public class JsxSrcAttribute {

    String src ;

    SrcValue srcValue ;


    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public SrcValue getSrcValue() {
        return srcValue;
    }

    public void setSrcValue(SrcValue srcValue) {
        this.srcValue = srcValue;
    }

    @Override
    public String toString() {
        return "JsxSrcAttribute{" + "\n"+
                "src='" + src + '\'' + "\n"+
                ", srcValue=" + srcValue + "\n"+
                '}';
    }
}
