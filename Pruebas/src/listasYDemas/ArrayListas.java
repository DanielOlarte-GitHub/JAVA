package listasYDemas;
/**
 * ARRAYLIST VS LINKEDLIST
 * En resumen Array List algo sencillo pero no tiene tantas funciones como el Linked List
 * de resto es exactamente lo mismo
 */

import java.util.ArrayList;

public class ArrayListas {
    static ArrayList frutas = new ArrayList();

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
