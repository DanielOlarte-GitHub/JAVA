package main;

import java.util.Scanner;

import acciones.Acciones;

public class Main {

    /*VARIABLES*/
    static Scanner leer = new Scanner(System.in);
    static Acciones acc = new Acciones();
    static String nombre;
    static int edad, estatura, pieBueno, posicion, genero, mixto, disponible;

    /**
     * MENU DONDE EL USUARIO ESCOJE LA OPCION QUE DESEA TOMAR
     */
    public static void menu() {

        System.out.println("\n\t\t\tMENU:\n");
        System.out.println("1) Crear Jugador"); //READY
        System.out.println("2) Crear Equipo"); //READY
        System.out.println("3) Ver Equipos"); //READY
        System.out.println("4) Ver Jugadores"); //READY
        System.out.println("5) Crear Partido"); //READY
        System.out.println("6) Agregar Jugador a Equipo"); //READY
        System.out.println("7) Solicitar Jugadores"); //
        System.out.println("8) Ver Jugadores de un equipo en Especifico"); //READY
        System.out.println("0) Salir"); //READY
        System.out.print("Escoja su opcion: ");
        int opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.println("REGISTRO DEL NUEVO JUGADOR!");
                acc.crearJugador();
                break;

            case 2:
                System.out.println("REGISTRO DEL NUEVO EQUIPO!");
                acc.crearEquipo();
                break;

            case 3:
                System.out.println("\n\n\tVER LOS EQUIPOS!\n");
                acc.verEquipos();
                break;

            case 4:
                System.out.println("\n\n\tVER LOS JUGADORES!\n");
                acc.verJugadores();
                break;

            case 5:
                System.out.println("\n\n\tCREAR PARTIDO!");
                acc.crearPartido();
                break;

            case 6:
                System.out.println("\n\n\tAGREGAR JUGADORES AL EQUIPO!");
                acc.agregarJugadorAEquipo();
                break;

            case 7:
                System.out.println("\n\n\tSOLICITAR JUGADORES PARA UN PARTIDO!");
                acc.solicitarJugador();
                break;

            case 8:
                System.out.println("\n\n\tVER LOS JUGADORES DE UN EQUIPO EN ESPECIFICO!");
                acc.verJugadoresDeUnEquipo();
                break;

            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("DIGITO UN VALOR INCORRECTO INTENTELO DE NUEVO");
                break;
        }
        menu();
    }

    public static void main(String[] args) {
        System.out.println("\t\tBIENVENIDO A SPOTIFY CAMP NOU 5!");
        menu();
    }
}
