import java.util.Scanner;

public class Launcher {
    static boolean vacio = false;
    static Scanner leer = new Scanner(System.in);
    static Broker bk = new Broker();

    /**
     * METODO DE MENU, DONDE SE DIVIDE EL CODIGO A VARIAS OPCIONES QUE PUEDE TOMAR EL USUARIO
     */
    public static void menu(){
        int opc;

        System.out.println("\n\t\t\tMENU\n");
        System.out.println("Escoja la opción que desee");
        System.out.println("\t1. Enviar mensajes a la cola del broker");
        System.out.println("\t2. Solicitar mensajes de un usuario");
        System.out.println("\t3. Ver mensajes en el Broker");
        System.out.println("\t0. Salir");
        System.out.print("\tDigite su opcion: ");
        opc = leer.nextInt();

        switch (opc){
            case 1:
                enviarAlBroker();
                break;

            case 2:
                solicitarMensajes();
                break;

            case 3:
                verMensajesEnElBroker();
                break;

            case 0:

                System.out.println("Gracias por usar el programa");
                System.exit(0);
                break;

            default:
                System.out.println("Digito una opcion invalida, intente de nuevo");
                break;

        }
        menu();
    }


    /**
     * METODO PARA VER TODOS LOS MENSAJES QUE ESTAN EN EL BROKER
     */
    public static void verMensajesEnElBroker() {
        System.out.println("\n\n\tVER MENSAJES EN EL BROKER\n\n");

        if(vacio == true){
            bk.verTodosLosMensajes();
        }else{
            System.out.println("Aun no ha enviado ningun mensaje");
        }

    }

    /**
     * Metodo que solicita el mensaje que estan en el Broker para enviarlo a su destino especifico
     */
    public static void solicitarMensajes(){

        System.out.println("\n\n\tSOLICITAR MENSAJES DEL BROKER\n");

        if(vacio == true){
            System.out.println("Por favor ingrese el id o nombre de a quien se dirige el mensaje");
            String idTemp = leer.next();
            Usuario user = new Usuario(idTemp, bk);
            user.pedirMensaje();
        }else{
            System.out.println("Aun no ha enviado ningun mensaje");
        }
    }

    /**
     * Metodo donde se envian los mensajes para almacenar en el broker
     */
    public static void enviarAlBroker(){
        int salir = 0;
        vacio = true;

        System.out.println("\n\n\tENVIAR MENSAJES AL BROKER\n\n");

        while(salir == 0){
            System.out.println("Escriba el mensaje que desea guardar en la cola");
            String mensaje = leer.nextLine();
            mensaje = leer.nextLine();
            System.out.println("Digite el id de la conversación para el conjunto de mensajes");
            String idMensaje = leer.next();
            bk.añadirMensajeAlBroker(new Mensaje(idMensaje, mensaje));
            System.out.println("¿Desea escribir otro mensaje?\n0-> Si\n1-> No");
            salir = leer.nextInt();
        }
    }

    /**
     * METODO PRINCIPAL DEL PROGRAMA
     * @param args
     */
    public static void main(String args[]){
        System.out.println("\t\tMESSAGE QUEUE!");
        menu();
    }
}
