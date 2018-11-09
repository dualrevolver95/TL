import java.util.*;

public class STC extends Object {


    public  String type;  // type,in calculator expample there only is one type==> Int.
    public  String value; // value, the value in here is a string not a integer value.
    public  int numLineas;
    public  SimpleNode ambito;

    public STC(String itype, String ivalue, int iNumLineas) {
        type = itype;
        value = ivalue;
        numLineas = iNumLineas;

    }

    public STC(String itype, String ivalue, int iNumLineas, Object iambito) {
        type = itype;
        value = ivalue;
        numLineas = iNumLineas;
        ambito = (SimpleNode) iambito;
    }

    public String getAmbitoString() {
        return ambito.toString();
    }

}