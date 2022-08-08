public class Usuario {
    private int estado; // 0-> Activado    1-> Desactivado
    private String nombre;

    public Usuario(int estado, String name) {
        this.estado = estado;
        this.nombre = name;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void verMensajes(String mensaje){
        System.out.println("NOMBRE USUARIO-> " + nombre + "\nMensaje -> " + mensaje+"\n");
    }
}
