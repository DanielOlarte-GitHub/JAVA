package Controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import Modelo.Logica;
import Vista.Ventana;

public class ControladorK implements KeyListener{

	Logica l;
	Ventana v;
	Timer myTimer = new Timer();
	
	public ControladorK(Logica log) {
		l = log;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
