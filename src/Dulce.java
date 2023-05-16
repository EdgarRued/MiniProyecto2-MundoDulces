public class Dulce {
    private String nombre;
    Categoria catego;
    int precio;
    public Dulce(String nombre, Categoria catego, int precio) {
        this.nombre = nombre;
        this.catego = catego;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Categoria getCatego() {
        return catego;
    }
    public void setCatego(Categoria catego) {
        this.catego = catego;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
