package cadenas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

//Clase Administradora
public class Administradora {

    //Variables, Objetos, Listas staticas para poder usarlas en los metodos de la clase
    private static String sucursal;
    private static Ingredientes ingr = new Ingredientes();
    private static Productos pr = new Productos();
    private static ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
    private static ArrayList<Productos> productos = new ArrayList<Productos>();

    //Metodo para Mostrar los productos creados
    public static void mostrarProductos() {
        JOptionPane.showMessageDialog(null, "Mostrando Productos de la sucursal " + sucursal);
        String cadena = "PRODUCTOS SUCURSAL " + sucursal + "\n\n";
        for (int i = 0; i < productos.size(); i++) {
            cadena += "Producto " + (i + 1) + ":\nId: " + productos.get(i).getId() + " ";
            cadena += "Nombre: " + productos.get(i).getNombre() + " ";
            cadena += "Precio: " + productos.get(i).getPrecio() + " ";
            cadena += "\nIngredientes: ";
            for (int j = 0; j < productos.get(i).ingredientes.size(); j++) {
                cadena += "\n\t\tId: Ingrediente " + productos.get(i).ingredientes.get(j).getId() + " ";
                cadena += "Nombre: " + productos.get(i).ingredientes.get(j).getNombre() + " ";
                cadena += "Precio: " + productos.get(i).ingredientes.get(j).getPrecio() + " ";
            }
            cadena += "\n\n\n";
        }

        JOptionPane.showMessageDialog(null, cadena);
    }

    //Metodo para mostrar los Ingredientes existentes
    public static void mostrarIngredientes() {
        JOptionPane.showMessageDialog(null, "Mostrando Ingredientes de la sucursal " + sucursal);
        String cadena = "INGREDIENTES SUCURSAL " + sucursal + "\n\n";
        for (int i = 0; i < ingredientes.size(); i++) {
            cadena += "Id: Ingrediente " + ingredientes.get(i).getId() + " ";
            cadena += "Nombre: " + ingredientes.get(i).getNombre() + " ";
            cadena += "Precio: " + ingredientes.get(i).getPrecio() + " ";
            cadena += "\n";
        }

        JOptionPane.showMessageDialog(null, cadena);
    }

    //Metodo para agregar los ingredientes quemados cuando se compile el programa
    public static void agregarIngredientes() {
        Ingredientes ing = new Ingredientes("1", "Jamon", 800);
        ingredientes.add(ing);
        ing = new Ingredientes("2", "Queso", 900);
        ingredientes.add(ing);
        ing = new Ingredientes("3", "Tocineta", 700);
        ingredientes.add(ing);
        ing = new Ingredientes("4", "Tomate", 600);
        ingredientes.add(ing);
        ing = new Ingredientes("5", "Lechuga", 600);
        ingredientes.add(ing);
        ing = new Ingredientes("6", "Cebolla", 780);
        ingredientes.add(ing);
        ing = new Ingredientes("7", "Salsa Tomate", 500);
        ingredientes.add(ing);
        ing = new Ingredientes("8", "Salsa Mayonesa", 500);
        ingredientes.add(ing);
        ing = new Ingredientes("9", "Salsa Moztasa", 500);
        ingredientes.add(ing);
        ing = new Ingredientes("10", "Papas", 1000);
        ingredientes.add(ing);
        ing = new Ingredientes("11", "Carne Res", 1300);
        ingredientes.add(ing);
        ing = new Ingredientes("12", "Carne Pollo", 1200);
        ingredientes.add(ing);
        ing = new Ingredientes("13", "Pescado", 1300);
        ingredientes.add(ing);
        ing = new Ingredientes("14", "Soja", 780);
        ingredientes.add(ing);
        ing = new Ingredientes("15", "Pepinillo", 500);
        ingredientes.add(ing);
        ing = new Ingredientes("16", "Champiñones", 560);
        ingredientes.add(ing);
        ing = new Ingredientes("17", "Calabacin", 500);
        ingredientes.add(ing);
        ing = new Ingredientes("18", "Mortadela", 800);
        ingredientes.add(ing);
        ing = new Ingredientes("19", "Pavo", 1400);
        ingredientes.add(ing);
        ing = new Ingredientes("20", "Huevo", 1000);
        ingredientes.add(ing);
    }

    //Metodo que Elimina el producto del ArrayList
    public static void eliminarProducto() {
        JOptionPane.showMessageDialog(null, "Eliminar Productos de la sucursal " + sucursal);
        JOptionPane.showMessageDialog(null, "Elija uno de los siguientes Productos de la sucursal " + sucursal);
        mostrarProductos();
        int elim = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del producto que desee eliminar"));
        productos.remove(elim - 1);
        JOptionPane.showMessageDialog(null, "PRODUCTO ELIMINADO CON EXITO");
    }

    //Metodo para editar el producto del ArrayList con un menu interno
    public static void editarProducto() {
        boolean bandera = true, banderaIngredientes = true;

        JOptionPane.showMessageDialog(null, "Editar Productos de la sucursal " + sucursal);
        JOptionPane.showMessageDialog(null, "Elija uno de los siguientes Productos de la sucursal " + sucursal);
        mostrarProductos();
        int edit = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del producto que desee editar"));

        while (bandera) {
            int opcEdit = Integer.parseInt(JOptionPane.showInputDialog("Que desea editar del producto: " + productos.get(edit - 1).getNombre() + "\n\n1) Id\n2) Nombre\n3) Ingredientes"));

            if (opcEdit == 1) {
                String id = JOptionPane.showInputDialog("Digite el nuevo Id ");
                productos.get(edit - 1).setId(id);
                bandera = false;

            } else if (opcEdit == 2) {
                String nombre = JOptionPane.showInputDialog("Digite el nuevo nombre ");
                productos.get(edit - 1).setNombre(nombre);
                bandera = false;

            } else if (opcEdit == 3) {
                ArrayList<Ingredientes> ingredientesProducto = new ArrayList<Ingredientes>();
                while (banderaIngredientes) {
                    JOptionPane.showMessageDialog(null, "Digite el Id uno por uno de los siguientes Ingredientes que desee");
                    mostrarIngredientes();
                    int in = Integer.parseInt(JOptionPane.showInputDialog("Digite el Id del ingrediente deseado\n(Si no desea mas ingredientes digite 0)"));
                    if (in == 0) {
                        banderaIngredientes = false;
                    } else {
                        Ingredientes ingProd = new Ingredientes(ingredientes.get(in - 1).getId(), ingredientes.get(in - 1).getNombre(), ingredientes.get(in - 1).getPrecio());
                        ingredientesProducto.add(ingProd);
                    }
                }
                productos.get(edit - 1).setIngredientes(ingredientesProducto);
                bandera = false;
                JOptionPane.showMessageDialog(null, "PRODUCTO EDITADO CON EXITO");
            } else {
                JOptionPane.showMessageDialog(null, "Digito un valor Invalido, intente de nuevo");
            }
        }

    }

    //Metodo para crear un producto
    public static void crearProducto() {
        JOptionPane.showMessageDialog(null, "Creando Producto de la sucursal " + sucursal);
        ArrayList<Ingredientes> ingredientesProducto = new ArrayList<Ingredientes>();
        String id, nombre;
        int precio = 0, in;
        boolean bandera = true;

        id = JOptionPane.showInputDialog("Digite el Id del Producto");
        nombre = JOptionPane.showInputDialog("Digite el Nombre del Producto");

        while (bandera) {
            JOptionPane.showMessageDialog(null, "Digite el Id uno por uno de los siguientes Ingredientes que desee");
            mostrarIngredientes();
            in = Integer.parseInt(JOptionPane.showInputDialog("Digite el Id del ingrediente deseado\n(Si no desea mas ingredientes digite 0)"));
            if (in == 0) {
                bandera = false;
            } else {
                Ingredientes ingProd = new Ingredientes(ingredientes.get(in - 1).getId(), ingredientes.get(in - 1).getNombre(), ingredientes.get(in - 1).getPrecio());
                ingredientesProducto.add(ingProd);
                precio += ingredientes.get(in - 1).getPrecio();
            }
        }

        precio += (precio * 0.25);

        Productos prod = new Productos(id, nombre, precio, ingredientesProducto);
        productos.add(prod);
    }

    //Metodo para escoger la sucursal
    public static String sucursal() {
        boolean bandera = true;
        int sucur;

        while (bandera) {
            sucur = Integer.parseInt(JOptionPane.showInputDialog("Digite una de las 3 sucursales con las que va a trabajar:\n1) San Pedro\n2) Los Yoses\n3) Curridabat"));

            if (sucur == 1) {
                sucursal = "SAN PEDRO";
                bandera = false;

            } else if (sucur == 2) {
                sucursal = "LOS YOSES";
                bandera = false;

            } else if (sucur == 3) {
                sucursal = "CURRIDABAT";
                bandera = false;

            } else {
                JOptionPane.showMessageDialog(null, "Digito un valor Invalido, intente de nuevo");
            }
        }
        return sucursal;
    }
}
