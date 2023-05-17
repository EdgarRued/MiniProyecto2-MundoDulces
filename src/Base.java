import java.util.ArrayList;

import javax.swing.JFrame;

public class Base extends JFrame {
    private static ArrayList <Dulce> base= new ArrayList<>();
    int coincide;
    public Base(){
        
         }

 
 public void EliminarDelArreglo(int i){
    base.remove(i);
 }
 public void InstertarAlArreglo(Dulce dulce){
    
    base.add(dulce);
 }
 public int ObtenerDelArreglo(String n){
    
    for (int i=0;i<base.size();i++){
        Dulce dulce = base.get(i);
        String comp = dulce.getNombre();
        if (comp.equals(n)){
            coincide= 1;
        }else{
            coincide= 2;
        }
    }

    return coincide;
    
 }
 public void SetDelArreglo(String name,Categoria c,int value,int posx){

    Dulce dulce = base.get(posx);
    dulce.setNombre(name);
    dulce.setCatego(c);
    dulce.setPrecio(value);
 }

 public int getposX(String nome){
    int resultX=0;
    for (int i=0;i<base.size();i++){
        Dulce dulce = base.get(i);
        String comp = dulce.getNombre();
        if(comp.equals(nome)){
            resultX=i;
        }
    }
    return resultX;
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
