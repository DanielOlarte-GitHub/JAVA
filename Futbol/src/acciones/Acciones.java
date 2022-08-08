package acciones;
import java.util.ArrayList;
import java.util.Scanner;

import equipos.Equipo;
import jugadores.Jugador;
import partido.Partido;

public class Acciones {

    /*VARIABLES*/
    int idContEquipos = 0, idEscogido, idEscogido2, hora, numeroCancha, idContJugadores = 0, mixto, aux, edad, estatura, pieBueno, posicion, genero, disponible;
    ArrayList<Jugador> jugador = new ArrayList<Jugador>();
    ArrayList<Equipo> equipos = new ArrayList<Equipo>();
    Scanner leer = new Scanner(System.in);
    String nombre;


    /**
     * Metodo para crear un equipo nuevo
     *
     */
    public void crearEquipo() {
        System.out.println("Nombre: ");
        nombre = leer.nextLine();
        nombre = leer.nextLine(); //DOBLE PARA EVITAR UN ERROR
        System.out.println("Mixto: \n1-> Si \n2-> No");
        mixto = leer.nextInt();

        Equipo newEqu = new Equipo(nombre, mixto, idContEquipos);
        equipos.add(newEqu);
        idContEquipos++;
    }

    /**
     * Metodo para crear un nuevo jugador
     *
     */
    public void crearJugador() {
        System.out.println("Nombre Completo: ");
        nombre = leer.nextLine();
        System.out.println("pieBueno: \n1-> Izquierdo \n2-> Derecho): ");
        pieBueno = leer.nextInt();
        System.out.println("Posicion: \n1-> POR \n2-> DFC \n3-> LTI \n4-> LTD \n5-> MC \n6-> MI \n7-> MD \n8-> MCO \n9-> MCD \n10->DC \n11->EI \n12->ED");
        posicion = leer.nextInt();
        System.out.println("Genero: \n1-> Masculino \n2-> Femenino");
        genero = leer.nextInt();
        System.out.println("Edad: ");
        edad = leer.nextInt();
        System.out.println("Estatura: ");
        estatura = leer.nextInt();
        System.out.println("Disponible para que lo fichen otros equipos: ");
        disponible = leer.nextInt();

        Jugador newJugad = new Jugador(nombre, pieBueno, posicion, genero, edad, estatura, idContJugadores, disponible);
        jugador.add(newJugad);
        idContJugadores++;

    }

    /**
     * Metodo que muestra TODOS los jugadores de la plataforma
     */
    public void verJugadores() {
        if (idContJugadores == 0) {
            System.out.println("NO HA CREADO NINGUN JUGADOR");
        } else {
            System.out.println("\n\n");
            for (Jugador jug : jugador) {
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

    /**
     * Metodo que muestra TODOS los equipos de la plataforma que NO sean Mixtos
     */
    public void verEquiposNoMixtos() {
        if (idContEquipos == 0) {
            System.out.println("NO HA CREADO NINGUN EQUIPO");
        } else {
            System.out.println("\n\n");
            for (Equipo equipo : equipos) {
                if(equipo.getMixto()==1){
                    System.out.println("ID: " + equipo.getId());
                    System.out.println("NOMBRE: " + equipo.getNombre());
                    System.out.println("JUGADORES: ");
                    equipo.getJugadores();
                    System.out.println("MIXTO: " + equipo.getMixto());
                    System.out.println("\n");
                }
            }
        }
    }


    /**
     * Metodo que muestra TODOS los equipos de la plataforma que sean Mixtos
     */
    public void verEquiposMixtos() {
        if (idContEquipos == 0) {
            System.out.println("NO HA CREADO NINGUN EQUIPO");
        } else {

            System.out.println("\n\n");
            for (Equipo equipo : equipos) {
                if(equipo.getMixto()==2){
                    System.out.println("ID: " + equipo.getId());
                    System.out.println("NOMBRE: " + equipo.getNombre());
                    System.out.println("JUGADORES: ");
                    equipo.getJugadores();
                    System.out.println("MIXTO: " + equipo.getMixto());
                    System.out.println("\n");
                }
            }
        }
    }

    /**
     * Metodo que muestra TODOS los equipos de la plataforma
     */
    public void verEquipos() {
        if (idContEquipos == 0) {
            System.out.println("NO HA CREADO NINGUN EQUIPO");
        } else {

            System.out.println("\n\n");
            for (Equipo equipo : equipos) {
                System.out.println("ID: " + equipo.getId());
                System.out.println("NOMBRE: " + equipo.getNombre());
                System.out.println("JUGADORES: ");
                equipo.getJugadores();
                System.out.println("MIXTO: " + equipo.getMixto());
                System.out.println("\n");
            }
        }
    }

    /**
     * Metodo para crear un nuevo partido
     */
    public void crearPartido() {
        if (idContEquipos < 2) {
            System.out.println("ES NECESARIO AL MENOS 2 EQUIPOS CREADOS PARA JUGAR");
        } else {
            System.out.println("¿DESEA QUE LOS EQUIPOS SEAN MIXTO O NO?\n1-> Si\n2-> No\n3-> No importa");
            mixto = leer.nextInt();

            if(mixto==1){
                verEquiposMixtos();
            }else if(mixto==2){
                verEquiposNoMixtos();
            }else if(mixto==3){
                verEquipos();
            }

            System.out.println("ESCOJA EL ID DEL PRIMER EQUIPO QUE VA A JUGAR EL PARTIDO");
            idEscogido = leer.nextInt();
            System.out.print("ESCOJA EL ID DEL SEGUNDO EQUIPO QUE VA A JUGAR EL PARTIDO");
            idEscogido2 = leer.nextInt();
            System.out.println("¿A QUE HORA VA A SER EL PARTIDO?");
            hora = leer.nextInt();


            numeroCancha = (int) (Math.random() * 10 + 1); //Da el numero de la cancha de forma automatica entre 10 canchas
            Equipo eq1 = new Equipo();
            Equipo eq2 = new Equipo();

            for (Equipo equipo : equipos) {//Busca ambos equipos escogidos

                if (equipo.getId() == idEscogido) {
                    eq1 = equipo;
                }

                if (equipo.getId() == idEscogido2) {
                    eq2 = equipo;
                }
            }

            Partido part = new Partido(hora, numeroCancha, eq1, eq2);

            System.out.println("SE HA CREADO EL PARTIDO!\nDatos del partido:\nEquipos: " + eq1.getNombre() + " Vs " + eq2.getNombre());
            System.out.println("Hora: " + hora + "\nNumero de la Cancha: " + numeroCancha);
        }
    }

    /**
     * Metodo para agregar jugadores a un equipo en especifico
     */
    public void agregarJugadorAEquipo() {

        verJugadores();
        System.out.println("ESCOJA EL ID DEL JUGADOR QUE DESEE AGREGAR A UN EQUIPO");
        idEscogido = leer.nextInt();

        verEquipos();
        System.out.println("ESCOJA EL ID DEL EQUIPO QUE VA A AGREGAR AL JUGADOR");
        idEscogido2 = leer.nextInt();

        for (Equipo equipo : equipos) {//Busca el equipo escogido
            if (equipo.getId() == idEscogido2) {
                for (Jugador jug : jugador) {//Busca el jugador escogido
                    if (jug.getId() == idEscogido) {
                        equipo.agregarJugadores(jug);//Agrega el jugador al equipo
                        break;
                    }
                }
            }
        }
    }


    public void solicitarJugador() {
        System.out.println("¿Desea filtrar los jugadores?\n1-> Por posicion que esten disponibles\n 2-> Todos los disponibles");
        aux = leer.nextInt();

        if(aux == 1){

            System.out.println("Digite la Posicion que desee buscar jugadores: \n1-> POR \n2-> DFC \n3-> LTI \n4-> LTD \n5-> MC \n6-> MI \n7-> MD \n8-> MCO \n9-> MCD \n10->DC \n11->EI \n12->ED");
            aux = leer.nextInt();

            for (Jugador jug : jugador) {
                if(jug.getDisponible() == 1){
                    if(jug.getPosicion()==aux){
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
        }else if(aux==2){
            for (Jugador jug : jugador){
                if(jug.getDisponible() == 1){

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
    }

    /**
     * Metodo para ver todos los jugadores de 1 equipo en especifico
     */
    public void verJugadoresDeUnEquipo() {
        if (idContEquipos == 0) {
            System.out.println("NO HA CREADO NINGUN EQUIPO");
        } else {
            verEquipos();
            System.out.println("ESCOJA EL ID DEL EQUIPO QUE QUIERA VER LOS JUGADORES");
            idEscogido = leer.nextInt();

            for (Equipo equipo : equipos) {//Busca el equipo escogido
                if (equipo.getId() == idEscogido) {
                    equipo.verTodaLaInfoDeLosJugadores();//Muestra a sus jugadores con su informacion
                    break;
                }
            }
        }
    }
}
