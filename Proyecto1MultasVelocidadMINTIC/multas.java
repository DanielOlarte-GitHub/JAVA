/**
 * Multas por exceso de velocidad
 * @author  Daniel Olarte
 * @version 1.0
 * @since   2022-09-1
 * 
 * Debido a la alta accidentabilidad presentadas en el ultimo año en las carreteras del territorio
    nacional, el gobierno ha decidido implementar un sistema de multas para los conductores que 
    permitan sancionar a los conductores que no respeten los limites de velocidad establecidos por
    los organismos de control. 
  
 * Los radares de tramo funcionan colocando dos cámaras en dos puntos alejados de una carretera
    con el fin de comprobar cuánto tiempo tarda un conductor recorrer dicho tramo. Estos radares no
    miden la velocidad de paso, sino el tiempo de paso representado como la velocidad media de un
    conductor en un trayecto con una longitud determinada. 

 * Formalmente, los radares de tramo se basan en el teorema de Lagrange (también conocido como
    el teorema de valor medio o de Bonnet-Lagrange), el cual nos dice que dice tenemos una función
    continua en un intervalo cerrado, y derivable en un intervalo abierto, entonces algún punto de ese
    intervalo abierto la función tendrá una derivada instantánea igual a la pendiente media de la curva
    en el intervalo cerrado.

 *  si hacemos un viaje desde Bogotá a Tunja y nuestra velocidad media es de 100 Km/h, necesariamente
    en algún punto del trayecto nuestra velocidad ha sido de 100 Km/h. Esto quiere decir que si la
    velocidad media supera la velocidad máxima permitida, gracias al teorema anterior, sabremos que
    en algún punto del trayecto se superó la velocidad máxima permitida. Por ejemplo, si colocamos las
    cámaras separadas 10 Km en un tramo cuya velocidad máxima es de 110 Km/h, y un conductortarda
    5 minutos en ser visto por la segunda cámara, sabremos que su velocidad media ha sido de 120
    Km/h, y por tanto, en algún sitio ha superado la velocidad permitida.

 *  Construir el software que procesesará los
    datos registrados por las cámaras. Su misión es crear un programa en Java que permita saber si un
    conductor debe ser multado o no.
 */

import java.util.Scanner;

public class multas {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("\n-----------------------------------------------------");
        System.out.println("Bienvenido al sistema de multas por exceso de velocidad");
        System.out.println("-----------------------------------------------------\n\n");

        //Declaración de variables
        double velMax, distancia, tiempo, velMed;

        // Entrada de datos
        System.out.println("\nIngrese la distancia entre las dos camaras (en Metros): ");
        distancia = leer.nextInt();

        System.out.println("\nIngrese la velocidad maxima permitida en la carretera (en KM/H):");
        velMax = leer.nextInt();
        
        System.out.println("\nIngrese el tiempo que tarda el vehiculo en recorrer la distancia (en Segundos): ");
        tiempo = leer.nextInt();

        // Proceso de datos (convirtiendo metros en km y segundos en horas)
        velMed = (distancia /1000) / (tiempo / 3600);


        // Salida de datos
        System.out.println("\nLa velocidad media del vehiculo es: " + velMed + " Km/H\n");
        System.out.println("Resultado de la multa: ");
        //Condicional para determinar si el vehiculo debe ser multado o no
        if (distancia < 0 || tiempo < 0) { //Si la distancia o el tiempo son negativos
            System.out.println("ERROR");
        } else if (velMed <= velMax) { //Si la velocidad media es menor o igual a la velocidad maxima
            System.out.println("OK");
        } else if (velMed > velMax && velMed <= (velMax * 1.2)) { //Si la velocidad media es mayor a la velocidad maxima y menor o igual a la velocidad maxima mas el 20%
            System.out.println("MULTA");
        } else if (velMed > (velMax * 1.2)) { //Si la velocidad media es mayor a la velocidad maxima mas el 20%
            System.out.println("CURSO SENSIBILIZACION");
        }     
        

        System.out.println("\n-----------------------------------------------------");
        System.out.println("Gracias por usar el sistema de multas por exceso de velocidad");
        System.out.println("-----------------------------------------------------\n\n");
        
        leer.close();
    }

}

