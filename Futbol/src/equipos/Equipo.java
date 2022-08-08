package equipos;

import jugadores.Jugador;

import java.util.ArrayList;
//VICTORIAS EMPATES DERROTAS

public class Equipo {

    /*VARIABLES*/
    private int id;
    private String nombre;
    private int mixto;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    /*CONSTRUCTORES*/
    public Equipo(String nombre, int mixto, ArrayList<Jugador> jugadores) {
        super();
        this.nombre = nombre;
        this.mixto = mixto;
        this.jugadores = jugadores;
    }

    public Equipo(String nombre, int mixto, int id) {
        super();
        this.nombre = nombre;
        this.mixto = mixto;
        this.id = id;
    }

    public Equipo() {
    }

    /*GETTERS Y SETTERS*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMixto() {
        return mixto;
    }

    public void getJugadores() {
        System.out.println("JUGADORES: \n");
        for (Jugador jug : jugadores) {
            System.out.println("Nombre: " + jug.getNombreCompleto());
            System.out.println("\n");
        }
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * METODO PARA AGREGAR UN JUGADOR AL EQUIPO
     *
     * @param jug Objeto jugador que se agrega al equipo
     */
    public void agregarJugadores(Jugador jug) {
        jugadores.add(jug);
    }


    /**
     * METODO PARA VER A TODOS LOS JUGADORES DEL EQUIPO CON SU RESPECTIVA INFORMACION
     */
    public void verTodaLaInfoDeLosJugadores() {
        System.out.println("JUGADORES: \n");
        for (Jugador jug : jugadores) {
            System.out.println("ID: " + jug.getId());
            System.out.println("NOMBRE: " + jug.getNombreCompleto());
            System.out.println("EDAD: " + jug.getEdad());
            System.out.println("ESTATURA: " + jug.getEstatura());
            System.out.println("POSICION: " + jug.getPosicion());
            System.out.println("PIE BUENO: " + jug.getPieBueno());
            System.out.println("GENERO: " + jug.getGenero());
            System.out.println("\n");
        }
    }
}
