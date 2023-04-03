package Executable;

import Vista.Ventana;

import Controlador.ControladorK;
import Modelo.Logica;

public class App {
	
	public static void main(String []args)
	{
		Ventana miVentana = new Ventana();
		Logica miLogica=new Logica(miVentana);
		ControladorK miControladorK = new ControladorK(miLogica);
		miVentana.setControlador(miControladorK);
		
	}
	
	
}
