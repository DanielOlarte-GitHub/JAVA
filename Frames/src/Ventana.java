import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.net.MalformedURLException;
import java.net.URL;

import static java.awt.Image.SCALE_SMOOTH;

public class Ventana extends JFrame {
    VentanitaNueva ventanita;
    JPanel panelsito;

    public Ventana() throws MalformedURLException {

        //setSize(500,500); //Tamaño
        //setLocation(400,150); // Locación
        // setBounds(400,150,500,500); //Locacion y Tamaño

        setTitle("NUEVO FRAME");//Titulo de la ventana
        setSize(500,500);
        setLocationRelativeTo(null);//Centrado en la pantalla
        setMinimumSize(new Dimension(400,400));//tamaño minimo de la ventana

        this.getContentPane().setBackground(Color.blue);//color

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() throws MalformedURLException {
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();

    }

    private void colocarPanel(){
        /*CREACION DEL PANEL*/
        panelsito = new JPanel(); //Creacion del panel
        panelsito.setLayout(null); //DESACTIVA LAYOUTS DISEÑO
        this.getContentPane().add(panelsito); //Se agrega el panel a la ventana
        panelsito.setBackground(Color.lightGray);//color
    }

    private void colocarEtiquetas() throws MalformedURLException {
        /*CREACION DE LA ETIQUETA DEL TITULO*/
        JLabel etiqueta = new JLabel("HALLOWEEN",0); //Se crea el label con texto y centrado
        etiqueta.setOpaque(true);//Permite pintar el fondo
        etiqueta.setBounds(10,10,460,50);//POSICION Y MEDIDAS DE LA ETIQUETA
        etiqueta.setForeground(Color.white);//Color a la Letra
        etiqueta.setBackground(Color.black);
        etiqueta.setFont(new Font("Chiller",1,40));
        panelsito.add(etiqueta); //Se agrega la etiqueta al panel

        /*CREACION DE LA ETIQUETA IMAGEN*/

        //JLabel imagenHalloween = new JLabel(new ImageIcon(new URL("https://play-lh.googleusercontent.com/3vrU06bF7Mhatz63YpAv_Q6D7cufIv4katFLlb622G14RQJE02M7AXDB0wu6zTn-EtA")));
        /*JLabel imagenHalloween = new JLabel();
        imagenHalloween.setIcon(new ImageIcon(new URL("https://play-lh.googleusercontent.com/3vrU06bF7Mhatz63YpAv_Q6D7cufIv4katFLlb622G14RQJE02M7AXDB0wu6zTn-EtA")));
        imagenHalloween.setBounds(100,70,300,370);*/


        JLabel imagenHalloween = new JLabel();
        ImageIcon imagen = new ImageIcon(new URL("https://play-lh.googleusercontent.com/3vrU06bF7Mhatz63YpAv_Q6D7cufIv4katFLlb622G14RQJE02M7AXDB0wu6zTn-EtA"));
        imagenHalloween.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300, 370, SCALE_SMOOTH))); //ACOMODA LA IMAGEN
        imagenHalloween.setBounds(100,70,300,370);


        panelsito.add(imagenHalloween);
    }

    private void colocarBotones() throws MalformedURLException {
        /*CREACION DE BOTON
        JButton botonsito = new JButton("->");
        botonsito.setForeground(Color.white);
        botonsito.setBackground(Color.black);
        botonsito.setFont(new Font("Chiller",1,15));
        //botonsito.setEnabled(true);*/


        ActionListener cambio1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    ventanita = new VentanitaNueva();
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }
                ventanita.setVisible(true);
                setVisible(false);
            }
        };

        /*BOTON IMAGEN*/
        ImageIcon imagen = new ImageIcon(new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrL_pDzZ_G-aDIkF55E9cZ4mEgTPs5hQiTaA&usqp=CAU"));
        JButton botonsito = new JButton();
        botonsito.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(30,30,SCALE_SMOOTH)));
        botonsito.setBounds(430,410,30,30);
        botonsito.addActionListener(cambio1);
        panelsito.add(botonsito);

    }
}
