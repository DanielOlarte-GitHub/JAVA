package cadenas;

import javax.swing.JOptionPane;

public class Main {
    
    static Administradora adm = new Administradora ();
    static String sucursal;

    //Metodo del Menu principal del codigo
    public static void menu() {
        int opc;
        opc = Integer.parseInt(JOptionPane.showInputDialog("Menu de " + sucursal + ":\n\n\n1) Crear Producto\n2) Editar Producto\n3) Eliminar Producto\n4) Ver Producto\n5) Ver Ingredientes\n0)Salir"));
        switch (opc) {
            case 1:
                adm.crearProducto();
                break;

            case 2:
                adm.editarProducto();
                break;

            case 3:
                adm.eliminarProducto();
                break;

            case 4:
                adm.mostrarProductos();
                break;

            case 5:
                adm.mostrarIngredientes();
                break;

            case 0:
                JOptionPane.showMessageDialog(null, "Gracias Por Preferirnos");
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Digito un valor incorrecto, intentelo de nuevo");
                break;
        }
        menu();
    }

    //Metodo Principal
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "BIENVENIDO A LA CADENA DE COMIDA RAPIDA");
        adm.agregarIngredientes();
        sucursal = adm.sucursal();
        menu();
    }
}
