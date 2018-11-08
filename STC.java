import java.util.*;

public class STC extends Object {


  String type;  // type,in calculator expample there only is one type==> Int.
  String value; // value, the value in here is a string not a integer value.
  int numLineas;

  public STC(String itype, String ivalue, int iNumLineas) {
    type=itype;
    value=ivalue;
    numLineas=iNumLineas;

  }
}