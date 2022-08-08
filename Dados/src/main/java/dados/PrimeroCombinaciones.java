package dados;

import java.util.Scanner;

public class PrimeroCombinaciones {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int[] dados = new int[3];
        System.err.println("Digite el valor a Superar");
        int valorSuperar = leer.nextInt();
        tiradas(dados, valorSuperar, 0, 0);
    }
    
    public static void tiradas(int[]dados, int valorSuperar, int suma, int tirada){
        
        //imprime cuando ya acabe
        if( tirada==dados.length && suma>= valorSuperar){
            for(int i = 0; i < dados.length; i++){
                if(i==dados.length-1){
                    System.out.print(dados[i]+" = ");
                }else{
                    System.out.print(dados[i]+" + ");
                }
                
            }
            System.out.println(suma);
        //Tiradas
        } else if(tirada!=dados.length){
            for (int i = 1; i <= 6; i++) {
                dados[tirada] = i;
                suma+=i;
                tiradas(dados, valorSuperar, suma, (tirada+1));
                suma-=i;
            }
        }
        
    }
}
