package cadenas;

import java.util.ArrayList;

//Clase de Productos
public class Productos {
    //Atributos
    private String id;
    private String nombre;
    private int precio;
    ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
    
    //Constructores
    public Productos(String id, String nombre, int precio, ArrayList<Ingredientes> ingredientes) {

        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        
    }
    
    public Productos(){
        
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

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
       
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
