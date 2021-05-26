package Interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Cronometro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    static public JLabel lbldado, btniniciar, lbltime, lblTiempo;
    static public JButton btnplay;
    public static int m=0,s=0;
    public static boolean inicio=true, corriendo=false;
    
    public static void main(String[] args) {
					Cronometro cc = new Cronometro();
					cc.setVisible(true);
	}
	
	private void inciocro() {
		if(inicio==true) {
			Tiempo tm=new Tiempo(lbltime);
			tm.start();
		}
	}
	  
	public Cronometro() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){ 
			}
		});
		setUndecorated(true);
		setTitle("CRONOMETRO");
		setLocation(1000,500);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cronometro.class.getResource("/imagenes/2.jpg")));
		setBounds(100, 100, 463, 187);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), null, null, null));
		setContentPane(contentPane);
		
		JLabel lblimg = new JLabel("");
		lblimg.setBounds(21, 11, 125, 176);
		lblimg.setIcon(new ImageIcon(Cronometro.class.getResource("/imagenes/reloj.png")));
		
		lbltime = new JLabel();
		lbltime.setBounds(173, 61, 164, 67);
		lbltime.setText("00:00");
		lbltime.setFont(new Font("Sylfaen", Font.PLAIN, 70));
		lbltime.setBackground(SystemColor.menu);
		
		lbldado = new JLabel("");
		lbldado.setBounds(361, 61, 75, 68);
		lbldado.setIcon(new ImageIcon(Cronometro.class.getResource("/imagenes/dadoazul.gif")));
		
		btnplay = new JButton("");
		btnplay.setSelectedIcon(new ImageIcon(Cronometro.class.getResource("/imagenes/lanzar.png")));
		btnplay.setToolTipText("Lanzar dado");
		btnplay.setIcon(new ImageIcon(Cronometro.class.getResource("/imagenes/lanzar.png")));
		btnplay.setBounds(401, 140, 52, 36);
		btnplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnplay.setEnabled(false);
				btniniciar.setVisible(true);
				btniniciar.setEnabled(true);
				Random rr=new Random();
				int dado=0;
				dado=((int)(rr.nextDouble()*4));
				if(dado==0) {
					ImageIcon img1=new ImageIcon(getClass().getResource("/imagenes/1.png"));
					Icon i1=new ImageIcon(img1.getImage().getScaledInstance(lbldado.getWidth(), lbldado.getHeight(), Image.SCALE_DEFAULT));
					lbldado.setIcon(i1);
				}else if(dado==1) {
					ImageIcon img2=new ImageIcon(getClass().getResource("/imagenes/2.png"));
					Icon i2=new ImageIcon(img2.getImage().getScaledInstance(lbldado.getWidth(), lbldado.getHeight(), Image.SCALE_DEFAULT));
					lbldado.setIcon(i2);	
				}else if(dado==2) {
					ImageIcon img3=new ImageIcon(getClass().getResource("/imagenes/3.png"));
					Icon i3=new ImageIcon(img3.getImage().getScaledInstance(lbldado.getWidth(), lbldado.getHeight(), Image.SCALE_DEFAULT));
					lbldado.setIcon(i3);	
				}else if(dado==3) {
					ImageIcon img4=new ImageIcon(getClass().getResource("/imagenes/4.png"));
					Icon i4=new ImageIcon(img4.getImage().getScaledInstance(lbldado.getWidth(), lbldado.getHeight(), Image.SCALE_DEFAULT));
					lbldado.setIcon(i4);
				}
			}
		});
		
		lblTiempo = new JLabel("TIEMPO");
		lblTiempo.setFont(new Font("Snap ITC", Font.ITALIC, 20));
		lblTiempo.setBounds(197, 23, 106, 27);
		contentPane.setLayout(null);
		contentPane.add(lblimg);
		contentPane.add(lbltime);
		contentPane.add(btnplay);
		contentPane.add(lbldado);
		contentPane.add(lblTiempo);
		
		JLabel minimizar = new JLabel("");
		minimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setExtendedState(ICONIFIED);
			}
		});
		minimizar.setToolTipText("Minimizar");
		minimizar.setIcon(new ImageIcon(Cronometro.class.getResource("/imagenes/mini.png")));
		minimizar.setBounds(412, 11, 41, 37);
		contentPane.add(minimizar);
		
		btniniciar = new JLabel("");
		btniniciar.setVisible(false);
		btniniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 btniniciar.setVisible(false);
					if(corriendo==false) {
						inicio=true;
						corriendo=true;
						inciocro();
						if(Principal.Dificil==true){
						Nivel_Dificil.habilitarrespuestas();
						}
						if(Principal.Medio==true){
						Nivel_Medio.habilitarrespuestas();
						}
						if(Principal.MedioMod==true){
						//MedioM.habilitarrespuesta();
						}
						if(Principal.Basico==true){
						Nivel_Basico.habilitarrespuestas();
						}
						if(Principal.FacilMod==true){
						//FacilM.habilitarrespuestas();
						}
						
			}}
		});
		btniniciar.setIcon(new ImageIcon(Cronometro.class.getResource("/imagenes/iniciar.png")));
		btniniciar.setToolTipText("Iniciar tiempo");
		btniniciar.setBounds(229, 121, 52, 43);
		contentPane.add(btniniciar);
		
	}
	
}
