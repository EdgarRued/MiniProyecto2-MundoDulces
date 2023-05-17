import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Base base = new Base();
        ArrayList<Dulce> beis = base.obtain();
        App app= new App(beis,base);
    }
}
