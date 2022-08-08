package listasYDemas;
/**
 * ARRAYLIST VS LINKEDLIST
 * En resumen Linked List tiene mas funciones y funciona mejor por ese motivo para almacenar harto y eliminar
 * de resto es exactamente lo mismo
 */
import java.util.LinkedList;

public class LinkedListas {

    static LinkedList frutas = new LinkedList();

    public static void main(String[] args) {
        frutas.add("Gola");
        frutas.add(12);
        frutas.add(new PersonaPrueba("Daniel", 21, 170));
        frutas.add(new Integer("3"));
        System.out.println(frutas);
        imprimir();
        otrasPruebas();

    }

    public static void imprimir(){
        System.out.println("IMPRIMIEDO LISTA\n");
        for(Object frutita: frutas){
            System.out.println(frutita);
        }
        
    }

    public static void otrasPruebas(){
        int posicion = 0;
        System.out.println("\n\n\nEMPIEZAN METODOS PRUEBAS:\n");
        System.out.println(frutas.get(posicion)+" Elemento en la posicion "+posicion);

        System.out.println(frutas.size()+" Tamaño Actual");

        System.out.println(frutas.contains("Gola")+" Contiene Gola");

        System.out.println("\nLIMPIANDO lISTA");
        frutas.clear();
        System.out.println(frutas.isEmpty()+" Esta vacio");
        imprimir();
    }
}
