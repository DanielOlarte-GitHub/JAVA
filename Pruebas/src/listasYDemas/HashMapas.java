package listasYDemas;
/**
 * No guarda con indices de enteros como las Listas o Arreglos si no que guarda con una llave y el valor
 * KEY  ->  VALUE
 * 0    ->  "Hola"
 * 1    ->  "Si"
 * "Go" ->  2
 * Especificar o no que tipo de valores son la llave y el valor pero puede ser cualquiera si no se especifica
 *
 * HashMap ordena la llave
 * LinkedHashMap respeta el orden en el que se fue ingresado
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapas {

    static HashMap frutas = new HashMap();
    //static HashMap<Integer, String> frutass = new HashMap<>();
    //static LinkedHashMap frutas = new LinkedHashMap();
    public static void main(String[] args) {
        frutas.put(4,"Gola");
        frutas.put(5, 12);
        frutas.put(3, new PersonaPrueba("Daniel", 21, 170));
        frutas.put(2, new Integer("3"));
        System.out.println(frutas);
        imprimir();
        otrasPruebas();



    }

    public static void imprimir(){
        System.out.println("IMPRIMIEDO MAPA\n");
        /*for(Map.Entry<Objet,Object> frutita: frutas.entrySet()){
            System.out.println(frutita); NO SIRVE CON HASH MAP EL FOR EACH
        }*/
    }

    public static void otrasPruebas(){
        int llave = 5;
        System.out.println("\n\n\nEMPIEZAN METODOS PRUEBAS:\n");
        System.out.println(frutas.get(llave)+" Elemento con la llave "+llave);

        System.out.println(frutas.size()+" Tamaño Actual");

        System.out.println(frutas.containsValue("Gola")+" Contiene Gola");

        System.out.println("\nLIMPIANDO lISTA");
        frutas.clear();
        System.out.println(frutas.isEmpty()+" Esta vacio");

        imprimir();
    }
}
