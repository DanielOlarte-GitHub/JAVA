package prueba;

import java.io.File;//Archivos leer
import java.util.Formatter;//Crear y Escribir archivos
import java.util.Scanner;//El Scanner aqui se usa para leer el archivo

public class ArchivosTextos {
    static File archivo;
    static Scanner leer;

    public static void asignarArchivo(){
        archivo = new File("C:\\Users\\danie\\IdeaProjects\\texto.txt");
        if(archivo.exists()){
            System.out.println(archivo.getName()+" Si existe");
        }else{
            System.out.println("El archivo no existe");
        }
    }

    public static void leerArchivo(){
        System.out.println("\nEMPEZANDO A LEER EL ARCHIVO");
        try{
            leer = new Scanner(archivo);
            while(leer.hasNext()){
                System.out.println(leer.next());
            }
            leer.close();
        }catch(Exception e){
            System.out.println("No se pudo leer el archivo");
        }finally {
            System.out.println("PROCESO DE LEER TERMINADO\n");

        }
    }

    public static void crearArchivoNuevo(){
        System.out.println("\nCREANDO NUEVO ARCHIVO");
        try{
            Formatter crear = new Formatter("C:\\Users\\danie\\IdeaProjects\\creadoConCodigo.txt");
            crear.format("Hola Mundo %s", "Que mas");
            crear.close();
        }catch(Exception e){
            System.out.println("No se pudo crear el archivo");
        }finally {
            System.out.println("PROCESO DE CREACION ARCHIVO TERMINADO\n");
        }

        leerArchivoNuevo();
    }

    public static void leerArchivoNuevo() {
        System.out.println("\nEMPEZANDO PROCESO DE LEER NUEVO ARCHIVO");
        try {
            File archivoNuevo = new File("C:\\Users\\danie\\IdeaProjects\\creadoConCodigo.txt");
            leer = new Scanner(archivoNuevo);

            while(leer.hasNext()){
                System.out.println(leer.next());
            }
            leer.close();
        }catch (Exception e){
            System.out.println("ERROR AL LEER EL ARCHIVO NUEVO\n");
        }finally {
            System.out.println("PROCESO DE LECTURA DEL NUEVO ARCHIVO TERMINADO");
        }
    }

    public static void main(String[] args) {
        asignarArchivo();
        leerArchivo();
        crearArchivoNuevo();
    }


}
