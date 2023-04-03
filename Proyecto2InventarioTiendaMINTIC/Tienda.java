/**
 * @author Daniel Olarte
 * @version 1.0
 * @since 2017-10-10
 */

 /*
    La tienda de Pepe vende diferentes productos, usualmente frutas, dulces y algunos tipos de
    carne. Con el propósito de mejorar el control sobre las ventas y el inventario de la tienda,
    Pepe decide construir una aplicación en Java que le permita almacenar la información de
    los productos y realizar algunos cálculos sobre los datos.
    Inicialmente se debe construir una base de datos que almacene la información de los
    productos disponibles en la tienda. Debido a que Pepe no cuenta con un servidor de base
    de datos, solicita que temporalmente la base de datos sea representada mediante un
    HashMap llamado listaProductos que tendrá por llave el código del producto y
    por valor una instancia de la clase Productos que tendrá como atributos código,
    nombre, precio e inventario.La Tabla 1 presenta los productos disponibles a la
    fecha


    Adicionalmente, Pepe está interesado en analizar los datos de los productos disponibles y conocer:
    el nombre del producto con el precio mayor; el nombre del producto con el precio menor; el
    promedio de precios de todos los productos y el valor total del inventario a la fecha. Este último se
    obtiene multiplicando el precio de cada producto por el inventario disponible y luego sumando
    todos los resultados
*/

import java.util.HashMap;
import java.util.Scanner;

public class Tienda {

    static Scanner leer = new Scanner(System.in);//para leer datos del usuario
    static BaseDatosProductos baseDatos = new BaseDatosProductos(); // instancia de la clase BaseDatosProductos

    /*
     * El método main es el metodo principal de la aplicación. 
     */
    public static void main(String[] args) {
        boolean error = false; // variable para controlar errores


        HashMap<String, Productos> listaProductos = baseDatos.getListaProductos();

        System.out.println("Bienvenido a la tienda de Pepe");

        int opcion = 0;
        do {

         
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Borrar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. producto con precio mayor");
            System.out.println("6. producto con precio menor");
            System.out.println("7. promedio de precios");
            System.out.println("8. valor total del inventario");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            
            
            opcion = leer.nextInt();
            switch (opcion) { //Switch para las opciones
                case 0:
                    System.out.println("Gracias por usar la aplicación");
                    break;
                case 1:
                    System.out.print("Ingrese el código del producto: ");
                    String codigo = leer.next();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = leer.nextDouble();
                    System.out.print("Ingrese el inventario del producto: ");
                    int inventario = leer.nextInt();
                    Productos producto = new Productos(codigo, nombre, precio, inventario);
                    error = baseDatos.agregarProducto(producto);
                    break;
                case 2:
                    System.out.print("Ingrese el código del producto: ");
                    codigo = leer.next();
                    System.out.print("Ingrese el nombre del producto: ");
                    nombre = leer.next();
                    System.out.print("Ingrese el precio del producto: ");
                    precio = leer.nextDouble();
                    System.out.print("Ingrese el inventario del producto: ");
                    inventario = leer.nextInt();
                    producto = new Productos(codigo, nombre, precio, inventario);
                    error = baseDatos.actualizarProducto(producto);
                    break;
                case 3:
                    System.out.print("Ingrese el código del producto: ");
                    codigo = leer.next();
                    baseDatos.borrarProducto(codigo);
                    break;
                    
                case 4:
                    System.out.println("\n\nInventario de la tienda");
                    System.out.println("Código\tNombre\tPrecio\tInventario");
                    for (Productos p : listaProductos.values()) {
                        System.out.println(p.getCodigo() + "\t" + p.getNombre() + "\t" + p.getPrecio() + "\t" + p.getInventario());
                    }
                    System.out.println("\n\n");
                    break;
                case 5:
                    System.out.println("\n\nProducto con precio mayor");
                    System.out.println("Código\tNombre\tPrecio\tInventario");
                    Productos productoMayor = productoMayor();
                    System.out.println(productoMayor.getCodigo() + "\t" + productoMayor.getNombre() + "\t" + productoMayor.getPrecio() + "\t" + productoMayor.getInventario());
                    System.out.println("\n\n");
                    break;
                case 6:
                    System.out.println("\n\nProducto con precio menor");
                    System.out.println("Código\tNombre\tPrecio\tInventario");
                    Productos productoMenor = productoMenor();
                    System.out.println(productoMenor.getCodigo() + "\t" + productoMenor.getNombre() + "\t" + productoMenor.getPrecio() + "\t" + productoMenor.getInventario());
                    System.out.println("\n\n");
                    break;
                case 7:
                    System.out.println("\n\nPromedio de precios");
                    System.out.println("Promedio: " + promedioPrecios());
                    System.out.println("\n\n");
                    break;
                case 8:
                    System.out.println("\n\nValor total del inventario");
                    System.out.println("Valor total: " + valorTotalInventario());
                    System.out.println("\n\n");
                    break;
                    
                default:
                    System.out.println("\n\nOpción inválida\n\n");
            }
        } while (opcion!= 0);

        if(error != true){
            Productos productoMayor = productoMayor();
            Productos productoMenor = productoMenor();
                

            System.out.print(productoMayor.getNombre() +" " +productoMenor.getNombre() + " " );
            System.out.printf("%.1f %.1f", promedioPrecios(), valorTotalInventario());
        
        }
        
        
    }

    /*
     * Método que permite agregar un producto a la base de datos
     */
    public static Productos productoMayor() {
        HashMap<String, Productos> listaProductos = baseDatos.getListaProductos();
        Productos productoMayor = null;
        for (Productos p : listaProductos.values()) {
            if (productoMayor == null) {
                productoMayor = p;
            } else {
                if (p.getPrecio() > productoMayor.getPrecio()) {
                    productoMayor = p;
                }
            }
        }
        return productoMayor;
    }

    /*
    metodo que retorna el producto con el precio menor
    */
    public static Productos productoMenor() {
        HashMap<String, Productos> listaProductos = baseDatos.getListaProductos();
        Productos productoMenor = null;
        for (Productos p : listaProductos.values()) {
            if (productoMenor == null) {
                productoMenor = p;
            } else {
                if (p.getPrecio() < productoMenor.getPrecio()) {
                    productoMenor = p;
                }
            }
        }
        return productoMenor;
    }

    /*
     * Método que calcula el promedio de precios de los productos
     */
    public static double promedioPrecios() {
        HashMap<String, Productos> listaProductos = baseDatos.getListaProductos();
        double promedio = 0;
        int contador = 0;
        for (Productos p : listaProductos.values()) {
            promedio += p.getPrecio();
            contador++;
        }
        return promedio / contador;
    }

    /*
     * Método que calcula el valor total del inventario
     */
    public static double valorTotalInventario() {
        HashMap<String, Productos> listaProductos = baseDatos.getListaProductos();
        double total = 0;
        for (Productos p : listaProductos.values()) {
            total += p.getPrecio() * p.getInventario();
        }
        return total;
    }
}


