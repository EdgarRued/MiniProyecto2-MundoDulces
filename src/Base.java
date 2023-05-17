import java.util.ArrayList;

import javax.swing.JFrame;

public class Base extends JFrame {
    private static ArrayList <Dulce> base= new ArrayList<>();
    int coincide,cont;
    public Base(){
        
         }

 
 public void EliminarDelArreglo(int i){
    base.remove(i);
 }
 public void InstertarAlArreglo(Dulce dulce){
    
    base.add(dulce);
 }
 
 


 public String prueba(){
    Dulce culde = base.get(0);
    String a= culde.getNombre();
    return a;
 }
 public void EliminarDelArreglo(String i){
   
 }
 public ArrayList<Dulce> obtain(){
      return base;
 }

 public void DataUpload(ArrayList<Dulce> P){
      base = P;
 }
public void Actualice(String n, Categoria c, int pre, int PosX, Base beis){
      Dulce dulce = base.get(PosX);
      dulce.setNombre(n);
      dulce.setCatego(c);
      dulce.setPrecio(pre);
      dispose();
      App app = new App (base ,beis );
}

}
