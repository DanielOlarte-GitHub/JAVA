package listasYDemas;

public class PersonaPrueba {
    private String nombre;
    private int edad;
    private int estatura;

    public PersonaPrueba(String nombre, int edad, int estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona:\n\t" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura ;
    }
}
