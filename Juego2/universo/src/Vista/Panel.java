package Vista;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel{

	private Image img;
	
	public void initComponents() {
		
		
	}
	
	public void paintComponents(Graphics g) 
	{
		String dir = "./Estrella_amarilla.png";
		
		for(int i = 0; i <= 3; i++)
		{
			int x = 10;
			int y = 10;
			img = new ImageIcon(dir).getImage();
			g.drawImage(img,x,y,getWidth(),getHeight(),this);
			x = x + 25;
			y = y + 25;
		}
		
		
	}
	
	
	
	
}
