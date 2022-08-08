package jugadores;

import java.util.ArrayList;

public class Jugador{

    /*INFORMACION*/
    //pieBueno 1-> Izquierdo 2-> Derecho
    //posicion 1-> POR   2-> DFC   3-> LTI   4-> LTD   5-> MC   6-> MI   7-> MD   8-> MCO   9-> MCD   10->DC   11->EI   12->ED
    //genero 1-> Masculino   2-> Femenino
    //disponible 1-> Si   2-> No

    /*VARIABLES*/
    private String nombreCompleto;
    private int edad, estatura, pieBueno, posicion, genero, id, disponible;

    /*CONSTRUCTOR*/
    public Jugador(String nombre, int pieBueno, int posicion, int genero, int edad, int estatura, int id, int disponible) {
        super();
        this.nombreCompleto = nombre;
        this.pieBueno = pieBueno;
        this.posicion = posicion;
        this.genero = genero;
        this.edad = edad;
        this.estatura = estatura;
        this.id = id;
        this.disponible = disponible;
    }

    /*GETTERS Y SETTERS*/
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getPieBueno() {
        return pieBueno;
    }

    public void setPieBueno(int pieBueno) {
        this.pieBueno = pieBueno;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
}
