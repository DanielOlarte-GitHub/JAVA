package hilos;
class Otro implements Runnable{
    @Override
    public void run() {
        for (double i=0;i<20;i+=0.5){
            System.out.println(i+" RE CONTRA Fake");
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                System.out.println("ERROR MANO");
            }
        }
    }
}

public class Hilos extends Thread{
    @Override
    public void run() {
        for (double i=0;i<20;i+=0.5){
            System.out.println(i+" Fake");
            try{
                Thread.sleep(3000);
            }catch(Exception e){
                System.out.println("ERROR MANO");
            }
        }
    }

    public static void main(String[] args) {
        /*CON EXTENDS: Se puede en la misma clase*/
        /*Hilos hilito = new Hilos();
        hilito.start();
        for (int i=0; i<20; i++){
            System.out.println(i+" Real");
            try{
                Thread.sleep(5000);
            }catch(Exception e){

            }
        }*/

        /*CON IMPLEMENTS: Otra clase*/
        Thread hilito = new Thread(new Otro());
        hilito.start();
    }
}
