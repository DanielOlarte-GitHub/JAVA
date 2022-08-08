package cadenas;

//Clase de Ingrediente
public class Ingredientes {

    //Atributos
    private String id;
    private String nombre;
    private int precio;

    //Constructores
    public Ingredientes() {
        

    }

    public Ingredientes(String id, String nombre, int precio) {

        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
