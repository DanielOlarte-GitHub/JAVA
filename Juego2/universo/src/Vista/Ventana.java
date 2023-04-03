package Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controlador.ControladorK;

public class Ventana extends JFrame{
	
	
	public JLabel lbl = new JLabel();
	private JPanel pnl1 = new JPanel();
	
	private ControladorK ck;
	
	public Ventana()
	{
		setTitle("Universo");
		setLayout(null);
		setBounds(5,5,1750,1750);
		setBackground(new Color(50,50,104));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
		setVisible(true);
	}
	
	private void iniciarComponentes()
	{	
    
		
		pnl1.setBounds(0,0,535,475);
		pnl1.setBackground(new Color(50,50,104));

		add(setStars());
		add(pnl1);
		
	}

	
	Random r=new Random();
	public JLabel setStars()
	{
		JLabel aux = new JLabel();
        
		File file = new File("./Estrella_amarilla.png");
		BufferedImage bufferedImage;
		try {
			
			bufferedImage = ImageIO.read(file);
			ImageIcon imageIcon = new ImageIcon(bufferedImage);
			Image i=imageIcon.getImage();
			Image i2=i.getScaledInstance(15,15, Image.SCALE_SMOOTH);
			imageIcon.setImage(i2);
 			aux.setBounds(20,20,15,15);
			aux.setIcon(imageIcon);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 
    			
    		
		return aux;
		
		
	}
	
	
	public void setControlador(ControladorK ck)
	{
		this.ck = ck;
		this.addKeyListener(this.ck);
	}

}
