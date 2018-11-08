
import java.lang.String;


public class SignTable{
  public String ident;
  public String cont;
  public int linea;
  public int col;
  public String ambiente;
  public int tipo;
  public String tipoDato;

  public SignTable(){}

  public SignTable(String ident, String cont, int linea, int col, String ambiente, int tipo, String tipoDato){
    this.ident = ident;
    this.cont = cont;
    this.linea=linea;
    this.col = col;
    this.ambiente = ambiente;
    this.tipo=tipo;
    this.tipoDato=tipoDato;
  }
   public String getIdent(){
     return ident;
   }
   public String getCont(){
     return cont;
   }
   public String getAmbiente(){
     return ambiente;
   }
   public int getTipo(){
     return tipo;
   }
   public String getTipoDato(){
     return tipoDato;
   }
   public int getLinea(){
     return linea;
   }
   public int getCol(){
     return col;
   }
   public void setIdent(String ident){
     this.ident = ident;
   }
   public void setCont(String cont){
     this.cont = cont;
   }
   public void setAmbiente(String ambiente){
     this.ambiente = ambiente;
   }
   public void setTipo(int tipo){
     this.tipo = tipo;
   }
   public void setTipoDato(String tipoDato){
     this.tipoDato = tipoDato;
   }
   public void setLinea(int linea){
     this.linea=linea;
   }
   public void setCol(int col){
     this.col=col;
   }

}
