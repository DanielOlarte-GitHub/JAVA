import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class Broker {
    private List<Usuario> usuarios;
    Queue<Mensaje> queueDeMensajes = new LinkedList<Mensaje>();

    public Broker(List usuarios) {
        this.usuarios = usuarios;
    }

    public void añadirMensaje(Mensaje mensaje){
        queueDeMensajes.add(mensaje);
    }

    public void verMensajesPorFiltro(int filtro){
        System.out.println("Buscando Mensajes por Filtro...\n");
        for(Mensaje mensaje: queueDeMensajes){
            if(mensaje.getTipo() == filtro){
                System.out.println("Buscando usuarios activos para enviar el mensaje...\n");
                for(Usuario usu : usuarios){
                    if(usu.getEstado() == 0){
                        usu.verMensajes(mensaje.getContenido());
                    }
                }
            }
        }
    }

    public void verTodosLosMensajes(){
        for(Mensaje mensaje: queueDeMensajes){
            System.out.println("TIPO: " + mensaje.getTipo());
            System.out.println("CONTENIDO: " + mensaje.getContenido());
            System.out.println("\n");
        }
    }
}
