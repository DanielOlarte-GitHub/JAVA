package prueba;

import java.util.Scanner;


public class Prueba {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*System.out.println("A");
        int num1 = leer.nextInt();
        System.out.println("B");
        int num2 = leer.nextInt();
        System.out.println("C");
        int num3 = leer.nextInt();
        System.out.println("D");
        int num4 = leer.nextInt();
        System.out.println(leer.next());
        System.out.println(leer.next());
        System.out.println(leer.next());*/
        double i =10.3;
        String d = i+"";
        String[] num = d.split("");
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num.length);

    }
}
