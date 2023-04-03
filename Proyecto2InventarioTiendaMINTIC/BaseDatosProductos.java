/*
 Para simular de una manera más realista la base de datos, es necesario construir 3 métodos que
representen las operaciones de: AGREGAR, ACTUALIZAR y BORRAR los productos disponibles. Se
debe implementar una clase con el nombre BaseDatosProductos que contenga el HashMap
listaProductos e implemente los 3 métodos solicitados
 */

import java.util.HashMap;

public class BaseDatosProductos {
    private HashMap<String, Productos> listaProductos;

    public BaseDatosProductos() {
        listaProductos = new HashMap<String, Productos>();

        Productos producto1 = new Productos("1", "Manzanas", 5000, 25);
        Productos producto2 = new Productos("2", "Limones", 2300, 15);
        Productos producto3 = new Productos("3", "Peras", 2700, 33);
        Productos producto4 = new Productos("4", "Arandanos", 9300, 5);
        Productos producto5 = new Productos("5", "Tomates", 2100, 42);
        Productos producto6 = new Productos("6", "Fresas", 4100, 3);
        Productos producto7 = new Productos("7", "Helado", 4500, 41);
        Productos producto8 = new Productos("8", "Galletas", 500, 8);
        Productos producto9 = new Productos("9", "Chocolate", 3500, 80);
        Productos producto10 = new Productos("10", "Jamon", 15000, 10);

        listaProductos.put(producto1.getCodigo(), producto1);
        listaProductos.put(producto2.getCodigo(), producto2);
        listaProductos.put(producto3.getCodigo(), producto3);
        listaProductos.put(producto4.getCodigo(), producto4);
        listaProductos.put(producto5.getCodigo(), producto5);
        listaProductos.put(producto6.getCodigo(), producto6);
        listaProductos.put(producto7.getCodigo(), producto7);
        listaProductos.put(producto8.getCodigo(), producto8);
        listaProductos.put(producto9.getCodigo(), producto9);
        listaProductos.put(producto10.getCodigo(), producto10);
    }

    public boolean agregarProducto(Productos producto) {
        // producto que ya existe
        if (this.listaProductos.containsKey(producto.getCodigo())) {
            System.out.println("ERROR");
            return true;
        } else {
            this.listaProductos.put(producto.getCodigo(), producto);
            return false;
        }
    }

    public boolean actualizarProducto(Productos producto) {
        // producto que no existe
        if (this.listaProductos.containsKey(producto.getCodigo())) {
            this.listaProductos.replace(producto.getCodigo(), producto);
            return false;
        } else {
            System.out.println("ERROR");
            return true;
        }
    }

    public boolean borrarProducto(String codigo) {
        // producto que no existe 
        if (this.listaProductos.containsKey(codigo)) {
            this.listaProductos.remove(codigo);
            return false;
        } else {
            System.out.println("ERROR");
            return true;
        }
    }

    public HashMap<String, Productos> getListaProductos() {
        return this.listaProductos;
    }

    public void setListaProductos(HashMap<String, Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "BaseDatosProductos{" + "listaProductos=" + this.listaProductos + '}';
    }
}




