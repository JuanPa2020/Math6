package Interfaz;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.border.BevelBorder;

public class Inicio extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public static int tiempo=(1);
    public static int tp=(2);
    public static JLabel mat,luis,bs,sys,fun;
    private JLabel gif;

    public static void main(String[] args) {
        inia();
        logos();
        logos2();
        cargando();
        cerrar();

    }

    public static void cerrar(){
        Inicio i=new Inicio();
        i.dispose();
    }

    private static void inia() {
        Inicio ini=new Inicio();
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
    }

    private static void pp() {
        Principal p=new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }

    public static void logos(){
        mat.setVisible(false);
        luis.setVisible(false);
        bs.setVisible(false);
        while(tiempo!=0){
            try{
                Thread.sleep(3000);
                mat.setVisible(true);
                luis.setVisible(true);
                bs.setVisible(true);
            }catch (InterruptedException ex){
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            tiempo=0;
        }
    }
    public static void logos2(){
        sys.setVisible(false);
        fun.setVisible(false);
        while(tiempo!=0){
            try{
                Thread.sleep(3000);
                sys.setVisible(true);
                fun.setVisible(true);
            }catch (InterruptedException ex){
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            tiempo=0;
        }
    }

    public static void logos1(){
        mat.setVisible(false);
        luis.setVisible(false);
        bs.setVisible(false);
        while(tiempo!=0){
            try{
                Thread.sleep(1000);
                mat.setVisible(true);
                luis.setVisible(true);
                bs.setVisible(true);
            }catch (InterruptedException ex){
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            tiempo=0;
        }
    }

    public static void cargando(){
        while(tp!=0){
            try{
                Thread.sleep(3000);
                Inicio i=new Inicio();
                i.dispose();
                pp();
            }catch (InterruptedException ex){
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            tp=0;
        }
    }

    public Inicio() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/imagenes/2.jpg")));
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 444, 290);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), new Color(255, 140, 0), new Color(192, 192, 192), new Color(255, 255, 255)));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        bs = new JLabel("\r\n");
        bs.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/basico.JPG")));
        bs.setBounds(10, 157, 106, 105);
        contentPane.add(bs);

        luis = new JLabel("\r\n");
        luis.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/amigo.png")));
        luis.setBounds(101, 211, 56, 62);
        contentPane.add(luis);

        mat = new JLabel("New label");
        mat.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/2.jpg")));
        mat.setBounds(340, 11, 94, 122);
        contentPane.add(mat);

        sys = new JLabel("\r\n");
        sys.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/syslac.JPG")));
        sys.setBounds(10, 11, 205, 84);
        contentPane.add(sys);

        fun = new JLabel("\r\n");
        fun.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/amigo.png")));
        fun.setBounds(167, 217, 264, 62);
        contentPane.add(fun);

        gif = new JLabel("\r\n");
        gif.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/gif.gif")));
        gif.setBounds(38, 22, 386, 251);
        contentPane.add(gif);
    }
}