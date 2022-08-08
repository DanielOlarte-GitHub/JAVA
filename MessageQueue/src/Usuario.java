public class Usuario {

    private String id;
    private Broker br;

    public Usuario(String id, Broker br) {
        this.id = id;
        this.br = br;
    }

    public void pedirMensaje(){
        br.verMensajes(id);
    }
}
