

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import static java.awt.Image.SCALE_SMOOTH;

public class VentanitaNueva extends JFrame {
    JPanel panel;
    Ventana principal;
    JLabel labelSubscriber1, labelSubscriber2, labelSubscriber3;
    JTextArea texto;
    JRadioButton radiobotonsito, radiobotonsito2, radiobotonsito3;

    public VentanitaNueva() throws MalformedURLException {
        setTitle("Nueva ventana");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);

        iniciarComponentes();
    }

    public void iniciarComponentes() throws MalformedURLException {
        agregarPanel();
        agregarLabel();
        agregarRadioBoton();
        agregarCajaTexto();
        agregarComboBox();
        agregarBoton();
        agregarLabelsSubs();
    }

    private void agregarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.lightGray);//color

    }

    private void agregarLabel(){

        JLabel titulo = new JLabel("PUB SUB",0);
        titulo.setBounds(50,10,350,50);//POSICION Y MEDIDAS DE LA ETIQUETA
        titulo.setFont(new Font("Chiller",1,40));
/*
        MouseListener mousePrueba = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                titulo.setText("OTRA COSA");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                titulo.setText("PUB SUB");
            }
        };

        titulo.addMouseListener(mousePrueba);
*/
        panel.add(titulo);


    }

    private void agregarRadioBoton(){
        radiobotonsito = new JRadioButton("Suscriptor 1", true);
        radiobotonsito.setBounds(80,80,120,30);
        radiobotonsito.setFont(new Font("Chiller", 1, 15));
        radiobotonsito.setOpaque(false);

        radiobotonsito2 = new JRadioButton("Suscriptor 2", false);
        radiobotonsito2.setBounds(200,80,120,30);
        radiobotonsito2.setFont(new Font("Chiller", 1, 15));
        radiobotonsito2.setOpaque(false);

        radiobotonsito3 = new JRadioButton("Suscriptor 3", false);
        radiobotonsito3.setBounds(320,80,120,30);
        radiobotonsito3.setFont(new Font("Chiller", 1, 15));
        radiobotonsito3.setOpaque(false);

        panel.add(radiobotonsito);
        panel.add(radiobotonsito2);
        panel.add(radiobotonsito3);

        ButtonGroup grupoBotonesRadio = new ButtonGroup();
        grupoBotonesRadio.add(radiobotonsito);
        grupoBotonesRadio.add(radiobotonsito2);
        grupoBotonesRadio.add(radiobotonsito3);
    }

    private void agregarCajaTexto(){
        /*JTextField texto = new JTextField("SOY EL BROKER");
        texto.setBounds(150, 150, 200,200);*/

        texto = new JTextArea("\n\n\n\nSOY\nEL");
        texto.setBounds(30, 150, 200,200);
        texto.append("\nBROKER");//Mas texto
        panel.add(texto);

    }

    private void agregarComboBox(){
        String[] listaS = {"Pub-SUB","El otro", "No se si hay mas"};
        JComboBox lista = new JComboBox(listaS);
        lista.setBounds(370,10,100,20);
        lista.setFont(new Font("Chiller", 0, 16));
        lista.addItem("Otro mas");
        //lista.setSelectedItem("Otro mas");//el ya seleccionado de primeras
        panel.add(lista);
    }

    private void agregarBoton() throws MalformedURLException {
        ActionListener volver = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    principal = new Ventana();
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }
                principal.setVisible(true);
                setVisible(false);
            }
        };

        ActionListener enviarBoton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radiobotonsito.isSelected()){
                    labelSubscriber1.setText(texto.getText());
                    JOptionPane.showMessageDialog(null,"MENSAJE ENVIADO AL SUB 1");
                }else if(radiobotonsito2.isSelected()){
                    labelSubscriber2.setText(texto.getText());
                    JOptionPane.showMessageDialog(null,"MENSAJE ENVIADO AL SUB 2");
                }else if(radiobotonsito3.isSelected()){
                    labelSubscriber3.setText(texto.getText());
                    JOptionPane.showMessageDialog(null,"MENSAJE ENVIADO AL SUB 3");
                }

                //labelSubscriber1.setText(labelSubscriber1.getText()+texto.getText());

            }
        };

        ImageIcon imagen = new ImageIcon(new URL("https://cdn-icons-png.flaticon.com/512/56/56856.png"));
        JButton devolver = new JButton(new ImageIcon(imagen.getImage().getScaledInstance(30,30,SCALE_SMOOTH)));
        devolver.setBounds(5,5,30,30);
        devolver.addActionListener(volver);
        panel.add(devolver);



        JButton enviar = new JButton("Enviar");
        enviar.setBounds(180,400, 140,30);
        enviar.setFont(new Font("Chiller", 1, 20));
        enviar.addActionListener(enviarBoton);
        panel.add(enviar);
    }

    private void agregarLabelsSubs(){
        /*SUB 1*/
        labelSubscriber1 = new JLabel("Aun no hay mensajes");
        labelSubscriber1.setBounds(270,150,180,40);
        labelSubscriber1.setFont(new Font("Chiller",1, 15));
        labelSubscriber1.setOpaque(true);
        labelSubscriber1.setBackground(Color.white);
        panel.add(labelSubscriber1);

        JLabel sub1 = new JLabel("Subscriber 1");
        sub1.setBounds(330, 115, 100,40);
        sub1.setFont(new Font("Chiller",1, 18));
        panel.add(sub1);


        /*SUB 2*/
        labelSubscriber2 = new JLabel("Aun no hay mensajes");
        labelSubscriber2.setBounds(270,230,180,40);
        labelSubscriber2.setFont(new Font("Chiller",1, 15));
        labelSubscriber2.setOpaque(true);
        labelSubscriber2.setBackground(Color.white);
        panel.add(labelSubscriber2);

        JLabel sub2 = new JLabel("Subscriber 2");
        sub2.setBounds(330, 195, 200,40);
        sub2.setFont(new Font("Chiller",1, 18));
        panel.add(sub2);


        /*SUB 3*/
        labelSubscriber3 = new JLabel("Aun no hay mensajes");
        labelSubscriber3.setBounds(270,310,180,40);
        labelSubscriber3.setFont(new Font("Chiller",1, 15));
        labelSubscriber3.setOpaque(true);
        labelSubscriber3.setBackground(Color.white);
        panel.add(labelSubscriber3);

        JLabel sub3 = new JLabel("Subscriber 3");
        sub3.setBounds(330, 275, 100,40);
        sub3.setFont(new Font("Chiller",1, 18));
        panel.add(sub3);
    }
}
