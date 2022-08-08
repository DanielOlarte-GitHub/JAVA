package listasYDemas;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Es una lista que NO REPITE VALORES
 * HashSet = Organiza de forma rara
 *
 * LinkedHashSet = Mantiene el orden en que fueron ingresados
 */
public class HashSetes {
    //static HashSet frutas = new HashSet(); //Ordena los elementos
    static LinkedHashSet frutas = new LinkedHashSet(); //Con este respeta el orden
    public static void main(String[] args) {
        frutas.add("Gola");
        frutas.add("Gola");//No se repite ya que has set no lo permite
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
        //System.out.println(frutas.get(posicion)+" Elemento en la posicion "+posicion);

        System.out.println(frutas.size()+" Tamaño Actual");

        System.out.println(frutas.contains("Gola")+" Contiene Gola");

        System.out.println("\nLIMPIANDO lISTA");
        frutas.clear();
        System.out.println(frutas.isEmpty()+" Esta vacio");
        imprimir();
    }
}
