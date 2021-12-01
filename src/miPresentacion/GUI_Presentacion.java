package miPresentacion;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class GUI_Presentacion extends JFrame {
    //atributos
    private JButton miFoto, miHobby, misExpectativas;
    private Titulos titulo;
    private JPanel panelBotones, panelDatos;
    private Escucha escucha;
    private JLabel labelImagen;
    private JTextArea texto;

    //metodos
    public GUI_Presentacion(){
        initGUI();

        //configuracion base de la ventana
        this.setTitle("Mi Presentacion");
        this.setSize(600,540);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI_Presentacion miGUIPresentacion = new GUI_Presentacion();
            }
        });
    }

    private void initGUI() {
        //Definir container y Layout del JFrame
        //Crear objetos Escucha y Control
        escucha =new Escucha();
        //Configurar JComponents
        titulo = new Titulos("Hola soy Jesus, oprime los botones...", Color.BLACK);
        this.add(titulo,BorderLayout.NORTH);

        panelDatos = new JPanel();
        panelDatos.setBorder(BorderFactory.createTitledBorder(null,"Un poco mas de mi...",
                             TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION,
                              new Font("Calibri", Font.PLAIN,20), Color.BLACK));
        this.add(panelDatos,BorderLayout.CENTER);

        miFoto = new JButton("Este soy yo");
        miFoto.addMouseListener(escucha);
        miHobby = new JButton("Este es mi hobby");
        miHobby.addMouseListener(escucha);
        misExpectativas = new JButton("Estas son mis expectativas");

        panelBotones = new JPanel();
        panelBotones.add(miFoto);
        panelBotones.add(miHobby);
        panelDatos.setFocusable(true);
        panelDatos.addKeyListener(escucha);
        panelBotones.add(misExpectativas);

        this.add(panelBotones, BorderLayout.SOUTH);

        labelImagen = new JLabel();
        texto = new JTextArea(10,12);
        texto.setFont(new Font(Font.DIALOG,Font.BOLD+Font.ITALIC, 15));
    }

    private class Escucha implements MouseListener, KeyListener {
        private ImageIcon image;

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()== miHobby && e.getClickCount() == 2){
                image = new ImageIcon(getClass().getResource("/recursos/hobbies.jpg"));
                labelImagen.setIcon(image);
                panelDatos.add(labelImagen);
                texto.setText("En mis tiempos libres me gusta jugar videojuegos con amigos,\n"+ "ver series, películas, videos en YouTube, o salir con amigos o familia.");
                texto.setBackground(null);
                texto.setEditable(false);
                panelDatos.add(texto);

            }else if(e.getSource()==miFoto){
                image = new ImageIcon(getClass().getResource("/recursos/hola.jpg"));
                labelImagen.setIcon(image);
                panelDatos.add(labelImagen);
                texto.setText("Me llamo Jesús Adrián Peña y tengo 18 años");
                texto.setBackground(null);
                texto.setEditable(false);
                panelDatos.add(texto);
            }
            revalidate();
            repaint();

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void keyTyped(KeyEvent e) {
            if(e.getKeyChar()== 'm' || e.getKeyChar()== 'M' ) {
                /*texto.setText("Espero adquirir nuevos conocimientos que me permitan mejorar mis\n" + "habilidades como programador y me ayuden en el desarrollo\n" + "de mi carrera a futuro además, de tener un mejor entendimiento\n" + "de cómo funcionan los diferentes programas y aplicaciones\n" + "que usamos día a día y cómo crear dichas herramientas.");
                texto.setBackground(null);
                panelDatos.add(texto);*/

                System.out.println("cy");
            }
            revalidate();
            repaint();
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }


    }

}
