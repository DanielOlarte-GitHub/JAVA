import java.util.LinkedList;
import java.util.Queue;

public class Broker {
    Queue<Mensaje> queueDeMensajes = new LinkedList<>();

    public void añadirMensajeAlBroker(Mensaje mensaje){
        queueDeMensajes.add(mensaje);
    }

    public void verMensajes(String id){
        for(Mensaje mensaje: queueDeMensajes){
            if(mensaje.getId().equalsIgnoreCase(id)){
                System.out.println(mensaje.getContenido());
            }
        }
    }

    public void verTodosLosMensajes(){
        for(Mensaje mensaje: queueDeMensajes){
            System.out.println("ID:" + mensaje.getId());
            System.out.println("CONTENIDO:" + mensaje.getContenido());
            System.out.println("\n");
        }
    }
}
