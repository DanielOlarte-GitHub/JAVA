/*
    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
    #########################################
    ProjectName: FilterMssg
    ClassName: Launcher
    @Author: Johan Moreno, Juan De Los Rios, Santiago Nohrá
    -----> Version: 1.3
    #########################################
    *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Launcher {

    static Scanner leer = new Scanner(System.in);
    static List<Usuario> usuarios = new ArrayList<Usuario>();
    static Broker bk = new Broker(usuarios);
    static int salirBandera = 1, opcTemp = 0;
    static String nombreUsu = "", mensajeB = "";
    static int tipoMensaje;


    public static void solicitarMensajesPorFiltro(){

        System.out.println("\n\n\tSOLICITAR MENSAJES DEL BROKER POR FILTRO\n\n");

        System.out.println("Digite el tipo de mensaje que desea ingresar:\n0-> Invitacion\n1-> Recordatorio\n2-> Queja\n3-> Recomendacion\n4-> Normal");
        tipoMensaje = leer.nextInt();
        bk.verMensajesPorFiltro(tipoMensaje);
    }

    public static void enviarAlBroker(){

        System.out.println("\n\n\tENVIAR MENSAJES AL BROKER\n\n");

        System.out.println("Escriba el mensaje que desea guardar");
        mensajeB = leer.nextLine();
        mensajeB = leer.nextLine();
        System.out.println("Digite el tipo de mensaje que desea ingresar:\n0-> Invitacion\n1-> Recordatorio\n2-> Queja\n3-> Recomendacion\n4-> Normal");
        tipoMensaje = leer.nextInt();
        bk.añadirMensaje(new Mensaje(mensajeB, tipoMensaje));
        System.out.println("¿Desea escribir más mensajes? 0-> Si, 1-> No");
        salirBandera = leer.nextInt();

        if(salirBandera==0){
            enviarAlBroker();
        }
    }


    public static void verUsuarios(){
        System.out.println("\n\n\tUSUARIOS REGISTRADOS\n");

        for(Usuario us : usuarios){

            if(us.getEstado()==0){
                System.out.println("NOMBRE-> " + us.getNombre() + "\nESTADO-> Conectado\n" );
            }else{
                System.out.println("NOMBRE-> " + us.getNombre() + "\nESTADO-> Desconectado\n" );
            }
            System.out.println("//////////////////////////////////////////////////////////////////\n");
        }
    }

    public static void cambiarEstadoUsuario(){
        System.out.println("\n\n\tUSUARIOS REGISTRADOS:\n");

        for(Usuario us : usuarios){
            if(us.getEstado()==0){
                System.out.println("NOMBRE-> " + us.getNombre() + "\nESTADO-> Conectado" );
            }else{
                System.out.println("NOMBRE-> " + us.getNombre() + "\nESTADO-> Desconectado" );
            }
        }

        System.out.println("\nDigite el nombre de usuario que desea cambiar el estado");
        String nombreUsu = leer.nextLine();
        nombreUsu = leer.nextLine();

        for(Usuario usu: usuarios){
            if(usu.getNombre().equals(nombreUsu)){
                if(usu.getEstado() == 0){
                    System.out.println("CAMBIANDO ESTADO...");
                    System.out.println("Estado Nuevo-> DESACTIVADO");
                    usu.setEstado(1);
                }else{
                    System.out.println("CAMBIANDO ESTADO...");
                    System.out.println("Estado Nuevo-> ACTIVADO");
                    usu.setEstado(0);
                }
                break;
            }
        }
    }

    public static void crearUsuario(){

        System.out.println("\n\n\tREGISTRAR USUARIO\n");
        System.out.println("Digite el nombre del nuevo usuario");
        nombreUsu = leer.nextLine();
        nombreUsu = leer.nextLine();
        System.out.println("Digite el estado del usuario: \n0-> Conectado\n1-> Desconectado");
        int estadoUsu = leer.nextInt();

        Usuario usuar = new Usuario(estadoUsu, nombreUsu);
        usuarios.add(usuar);

        System.out.println("¿Desea añadir otro usuario? 0-> Si, 1-> No");
        salirBandera = leer.nextInt();
        if(salirBandera==0){
            crearUsuario();
        }

    }


    /**
     * METODO DE MENU, DONDE SE DIVIDE EL CODIGO A VARIAS OPCIONES QUE PUEDE TOMAR EL USUARIO
     */
    public static void menu(){
        int opc;

        System.out.println("\n\t\t\tMENU\n");
        System.out.println("Escoja la opción que desee");
        System.out.println("\t1. Crear Usuarios");
        System.out.println("\t2. Cambiar estado del Usuario");
        System.out.println("\t3. Ver usuarios actuales");
        System.out.println("\t4. Enviar mensajes a la cola del broker");
        System.out.println("\t5. Solicitar mensajes con un filtro");
        System.out.println("\t6. Ver todos los mensajes del Broker");
        System.out.println("\t0. Salir");
        System.out.print("\tDigite su opcion: ");
        opc = leer.nextInt();

        switch (opc){
            case 1:
                crearUsuario();
                break;

            case 2:
                cambiarEstadoUsuario();
                break;

            case 3:
                verUsuarios();
                break;

            case 4:
                enviarAlBroker();
                break;

            case 5:
                solicitarMensajesPorFiltro();
               break;

            case 6:
                bk.verTodosLosMensajes();
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

    public static void crearPerfilesPredeterminados(){
        Usuario user1 = new Usuario(0, "Usuario1");
        Usuario user2 = new Usuario(1, "Usuario2");
        Usuario user3 = new Usuario(0, "Usuario3");
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
    }

    public static void main(String args[]){
        System.out.println("\t\tMESSAGE SERVICE!");
        System.out.println("YA HAY UNA BASE DE DATOS CREADA");
        crearPerfilesPredeterminados();
        menu();

    }
}
