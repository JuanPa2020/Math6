package Interfaz;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Nivel_Medio extends JFrame {

	private static final long serialVersionUID = 1L;
	JScrollPane scrollpane;
	  public static Double p1,p2,p3,p4,p5,p51,p6,p7,p8,p81;
	  public static JLabel lblayudan1,lblayudan2,lblayudan3,lblayudan4,lblayudan5,lblayudan6,lblayudan7,lblayudan8;
	  public static JTextField txtresultadon1,txtresultadon2,txtresultadon3,txtresultadon4,txtresultadon5,txtresultado51,
	  txtresultadon6,txtresultadon7,txtresultadon8,txtresultadon81;
	  public static JButton btnenviarrespuestas,btnvalidarrespuestas,btnpararmusica,btncronometro;
	  public static AudioClip music;
	  
	    Icon ayd=new ImageIcon(getClass().getResource("/imagenes/ayuda.png"));
		Icon fail=new ImageIcon(getClass().getResource("/imagenes/cerrar.png"));
		Icon ayuda1=new ImageIcon(getClass().getResource("/imgNM/frmixay.jpg"));
		Icon ayuda2=new ImageIcon(getClass().getResource("/imgNM/aymcmfr.jpg"));
		Icon ayuda3=new ImageIcon(getClass().getResource("/imgNM/mulfrayuda.png"));
		Icon ayuda4=new ImageIcon(getClass().getResource("/imgNM/divayuda.png"));
		Icon ayuda5=new ImageIcon(getClass().getResource("/imgNM/ayfrcraflz.jpg"));
		Icon ayuda6=new ImageIcon(getClass().getResource("/imgNM/ayproporcion1.jpg"));
		Icon ayuda7=new ImageIcon(getClass().getResource("/imgNM/ayraz.jpg"));
		 
		

		 static Cronometro cr=new Cronometro();

		 public static void main(String args[]) {
			  EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Nivel_Medio frame = new Nivel_Medio();
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
		  }
		 
		 public Nivel_Medio() {
			  	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			  	setForeground(Color.GRAY);
				this.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						alcerrar();
					}
				});
				
			  	setResizable(false);
			  	setAutoRequestFocus(false);
			    setIconImage(Toolkit.getDefaultToolkit().getImage(Nivel_Medio.class.getResource("/imagenes/2.jpg")));
			    setTitle("Nivel Medio");
			    setSize(1102,600);
			    setLocationRelativeTo(null);
			    all();
			    setVisible(true);
			  }
			    
			public void alcerrar() {
				  String botones[]= {"Aceptar","Cancelar"};
				  int eleccion =JOptionPane.showOptionDialog(null, "¿Deseas salir del nivel?", "Exit", 0, JOptionPane.INFORMATION_MESSAGE,fail,botones,"");
				  if(eleccion==JOptionPane.YES_OPTION) {
					  dispose();	
					  cr.dispose();
					  Cronometro.inicio=false;
					  Cronometro.m=0; Cronometro.s=0;
					  music.stop();
					  }}
			 
	  public static void habilitarrespuestas() {
		  txtresultadon1.setEnabled(true); txtresultadon2.setEnabled(true); txtresultadon3.setEnabled(true); txtresultadon4.setEnabled(true); txtresultadon5.setEnabled(true); txtresultado51.setEnabled(true);
		  txtresultadon6.setEnabled(true); txtresultadon7.setEnabled(true); txtresultadon8.setEnabled(true); txtresultadon81.setEnabled(true); 
	  }
	  
	  public static void desabilitarrespuestas() {
		  txtresultadon1.setEnabled(false); txtresultadon2.setEnabled(false); txtresultadon3.setEnabled(false); txtresultadon4.setEnabled(false); txtresultadon5.setEnabled(false); txtresultado51.setEnabled(false);
		  txtresultadon6.setEnabled(false); txtresultadon7.setEnabled(false); txtresultadon8.setEnabled(false); txtresultadon81.setEnabled(false); 
	  }
	  
	  public static void respuestas(){
		p1 = Double.valueOf(txtresultadon1.getText());
  		p2 = Double.valueOf(txtresultadon2.getText());
  		p3 = Double.valueOf(txtresultadon3.getText());
  		p4 = Double.valueOf(txtresultadon4.getText());
  		p5 = Double.valueOf(txtresultadon5.getText());
  		p51 = Double.valueOf(txtresultado51.getText());
  		p6 = Double.valueOf(txtresultadon6.getText());
  		p7 = Double.valueOf(txtresultadon7.getText());
  		p8 = Double.valueOf(txtresultadon8.getText());
  		p81 = Double.valueOf(txtresultadon81.getText());
  		
    		 if(p1==73 && p2==44 && p3==0.25 && p4==15 && p5==6||p5==9 && p51==9||p51==6 && p6==5 && p7==6 && p8==15||p8==10 && p81==10||p81==15){
                  	JOptionPane.showMessageDialog(null, "Sus respuestas estan buenas", "Validando Datos", JOptionPane.INFORMATION_MESSAGE);
                  	btnenviarrespuestas.setEnabled(true);
                  	cr.dispose();
					  desabilitarrespuestas();
					 
                  	
             }else{
            	 JOptionPane.showMessageDialog(null, "Incorrecto. Revise que las respuestas sean las adecuadas", "Validando Datos", JOptionPane.INFORMATION_MESSAGE);
           	          
             }
    		 
	  }
	  
	  
	  
	  public static void campos_no_vacios(){
         if(txtresultadon1.getText().isEmpty()==true | txtresultadon2.getText().isEmpty()==true | txtresultadon3.getText().isEmpty()==true | txtresultadon4.getText().isEmpty()==true |
			txtresultadon5.getText().isEmpty()==true | txtresultado51.getText().isEmpty()==true | txtresultadon6.getText().isEmpty()==true | txtresultadon7.getText().isEmpty()==true | 
			txtresultadon8.getText().isEmpty()==true | txtresultadon81.getText().isEmpty()==true){
        	 JOptionPane.showMessageDialog(null, "Revise que ningun campo este vacio.", "Validando Datos", JOptionPane.INFORMATION_MESSAGE);  
		  } 
			 
	  }

  public void all() {
    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setLayout(null);
    
    scrollpane = new JScrollPane(panel);
    
    JLabel lbltitulo = new JLabel("NIVEL MEDIO");
    lbltitulo.setFont(new Font("Snap ITC", Font.BOLD, 30));
    
    JLabel lblEjerciciosDeFracciones = new JLabel("EJERCICIOS DE FRACCIONES");
    lblEjerciciosDeFracciones.setFont(new Font("Segoe Print", Font.BOLD, 20));
    
    JLabel lblRealiceElSiguiente = new JLabel("Realice el siguiente ejercicio");
    lblRealiceElSiguiente.setFont(new Font("Segoe Print", Font.BOLD, 20));
    
    JLabel lbleje1 = new JLabel("");
    lbleje1.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/eje1fracciones.png")));
    lbleje1.setFont(new Font("Snap ITC", Font.BOLD, 30));
    
    JLabel lbln2 = new JLabel("2)");
    lbln2.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    
    JLabel lblen2 = new JLabel("Resuelva la siguiente fraccionario");
    lblen2.setFont(new Font("Segoe Print", Font.BOLD, 20));
    
    JLabel lblrn1 = new JLabel("R//");
    lblrn1.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    txtresultadon1 = new JTextField();
    txtresultadon1.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon1.setEnabled(false);
    txtresultadon1.setColumns(10);
    
    JLabel lblayudan1 = new JLabel("");
    lblayudan1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "AYUDA 1: Pasar un número mixto a fracción (ver la imagen). \n \n AYUDA 2: Para realizar la suma de fracciones\n en este caso se realiza hallando el m.c.m y se procede a resolver.\n Si no recuerdas como resolver fracciones heterogénas puedes mirar la ayuda de la pregunta 2", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayuda1);
    	}
    });
    lblayudan1.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/ayuda2.png")));
    lblayudan1.setToolTipText("\u00BFNecesitas ayuda?");
    lblayudan1.setFont(new Font("Tahoma", Font.BOLD, 14));

    
    JLabel lbleje2 = new JLabel("");
    lbleje2.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/operacion 2.JPG")));
    
    JLabel lblrn2 = new JLabel("R//");
    lblrn2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    txtresultadon2 = new JTextField();
    txtresultadon2.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon2.setEnabled(false);
    txtresultadon2.setColumns(10);
    
    JLabel lblayudan2 = new JLabel("");
    lblayudan2.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Este es un ejemplo de como se resulve una suma de fracciones heterogénea\n 1) Se procede a hallar el m.c.m\n 2) Luego el resultado del m.c.m Lo dividimos por cada denominador\n y lo multiplicamos por el numerador de cada fracción.\n Recuerda que el resultado del m.c.m sera el denominador común para todas la fracciones", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayuda2);
    	}
    });
    lblayudan2.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/ayuda2.png")));
    lblayudan2.setToolTipText("\u00BFNecesitas ayuda?");
    lblayudan2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel lbln3 = new JLabel("3)");
    lbln3.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    
    JLabel Lblen3 = new JLabel("Resuelva la siguiente fraccionario");
    Lblen3.setFont(new Font("Segoe Print", Font.BOLD, 20));
    
    JLabel lbleje31 = new JLabel("");
    lbleje31.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/ope3.1.JPG")));
    
    JLabel lbleje32 = new JLabel("");
    lbleje32.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/ope3.2.JPG")));
    
    JLabel lbl33 = new JLabel("X");
    lbl33.setFont(new Font("Tahoma", Font.BOLD, 26));
    
    JLabel lblrn3 = new JLabel("R//");
    lblrn3.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    txtresultadon3 = new JTextField();
    txtresultadon3.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon3.setEnabled(false);
    txtresultadon3.setColumns(10);
    
    JLabel lblayuda3 = new JLabel("");
    lblayuda3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Recuerda la multiplicación de fracciones (ver la imagen).", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayuda3);
    	}
    });
    lblayuda3.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/ayuda2.png")));
    lblayuda3.setToolTipText("\u00BFNecesitas ayuda?");
    lblayuda3.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label = new JLabel("4)");
    label.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    
    JPanel panel_1 = new JPanel();
    panel_1.setLayout(null);
    panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
    panel_1.setBackground(Color.WHITE);
    
    JLabel lblen4 = new JLabel("Resuelva el siguiente fraccionario");
    lblen4.setFont(new Font("Segoe Print", Font.BOLD, 20));
    lblen4.setBounds(0, 11, 346, 17);
    panel_1.add(lblen4);
    
    JTextPane txtpnten4 = new JTextPane();
    txtpnten4.setEditable(false);
    txtpnten4.setText("Un jardinero gasta dos tercios de litro de agua por cada planta que riega, \u00BFcu\u00E1ntas plantas puede regar si tiene diez litros?");
    txtpnten4.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
    txtpnten4.setBackground(Color.WHITE);
    txtpnten4.setBounds(10, 60, 323, 69);
    panel_1.add(txtpnten4);
    
    JLabel lblimgn4 = new JLabel("");
    lblimgn4.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/ope4.JPG")));
    lblimgn4.setBounds(38, 140, 181, 188);
    panel_1.add(lblimgn4);
    
    JLabel lblrn4 = new JLabel("R//");
    lblrn4.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblrn4.setBounds(42, 349, 28, 17);
    panel_1.add(lblrn4);
    
    txtresultadon4 = new JTextField();
    txtresultadon4.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon4.setEnabled(false);
    txtresultadon4.setColumns(10);
    txtresultadon4.setBounds(80, 349, 92, 20);
    panel_1.add(txtresultadon4);
    
    JLabel lblayudan4 = new JLabel("");
    lblayudan4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Recuerda la división de fracciones(ver la imagen).", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayuda4);
    	}
    });
    lblayudan4.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/ayuda2.png")));
    lblayudan4.setToolTipText("\u00BFNecesitas ayuda?");
    lblayudan4.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblayudan4.setBounds(190, 349, 24, 24);
    panel_1.add(lblayudan4);
    
    
    
    JLabel lbln5 = new JLabel("5)");
    lbln5.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    lbln5.setBounds(436, 16, 14, 14);
    panel_1.add(lbln5);
    
    JLabel lblen5 = new JLabel("Resuelva la siguiente fraccionario");
    lblen5.setFont(new Font("Segoe Print", Font.BOLD, 20));
    lblen5.setBounds(468, 11, 346, 17);
    panel_1.add(lblen5);
    
    JTextPane txtpn5 = new JTextPane();
    txtpn5.setEditable(false);
    txtpn5.setText("Las edades de dos amigos suman 15 a\u00F1os. La edad del menor es dos terceras partes de la edad del mayor. \u00BFCu\u00E1ntos a\u00F1os tiene cada amigo?");
    txtpn5.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
    txtpn5.setBackground(Color.WHITE);
    txtpn5.setBounds(468, 60, 395, 69);
    panel_1.add(txtpn5);
    
    JLabel lblrn5 = new JLabel("R//");
    lblrn5.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblrn5.setBounds(468, 342, 28, 17);
    panel_1.add(lblrn5);
    
    txtresultadon5 = new JTextField();
    txtresultadon5.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon5.setEnabled(false);
    txtresultadon5.setColumns(10);
    txtresultadon5.setBounds(506, 342, 64, 20);
    panel_1.add(txtresultadon5);
    
    JLabel lblayudan5 = new JLabel("");
    lblayudan5.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, " .", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayuda5);
    	}
    });
    lblayudan5.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/ayuda2.png")));
    lblayudan5.setToolTipText("\u00BFNecesitas ayuda?");
    lblayudan5.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblayudan5.setBounds(700, 342, 24, 24);
    panel_1.add(lblayudan5);
    
    JLabel lblimg5 = new JLabel("");
    lblimg5.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/ope5.1.PNG")));
    lblimg5.setBounds(585, 141, 92, 158);
    panel_1.add(lblimg5);
    
    txtresultado51 = new JTextField();
    txtresultado51.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultado51.setEnabled(false);
    txtresultado51.setColumns(10);
    txtresultado51.setBounds(612, 342, 64, 20);
    panel_1.add(txtresultado51);
    
    JLabel label_1 = new JLabel("4)");
    label_1.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    
    JLabel lbln1 = new JLabel("1)");
    lbln1.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    
    JPanel panel_2 = new JPanel();
    panel_2.setLayout(null);
    panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
    panel_2.setBackground(Color.WHITE);
    
    JLabel lblsubtituloRyP = new JLabel("EJERCICIOS DE RAZ\u00D3N Y PROPORCI\u00D3N");
    lblsubtituloRyP.setFont(new Font("Segoe Print", Font.BOLD, 18));
    lblsubtituloRyP.setBounds(253, 11, 375, 17);
    panel_2.add(lblsubtituloRyP);
    
    JLabel lbln6 = new JLabel("6)");
    lbln6.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    lbln6.setBounds(10, 54, 25, 14);
    panel_2.add(lbln6);
    
    JLabel lblen6 = new JLabel("Resuelva \r\n");
    lblen6.setFont(new Font("Segoe Print", Font.BOLD, 20));
    lblen6.setBounds(42, 49, 235, 17);
    panel_2.add(lblen6);
    
    JTextPane txtpnten6 = new JTextPane();
    txtpnten6.setEditable(false);
    txtpnten6.setText("En el campamento al que asistieron Mario y Liliana reparten un litro de leche entre cinco ni\u00F1os.\u00BFCu\u00E1ntos litros de leche se necesitaran para el desayuno de 25 ni\u00F1os?");
    txtpnten6.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
    txtpnten6.setBackground(Color.WHITE);
    txtpnten6.setBounds(42, 77, 235, 138);
    panel_2.add(txtpnten6);
    
    JLabel lbln7 = new JLabel("7)");
    lbln7.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    lbln7.setBounds(305, 54, 19, 14);
    panel_2.add(lbln7);
    
    JLabel lblen7 = new JLabel("Resuelva \r\n");
    lblen7.setFont(new Font("Segoe Print", Font.BOLD, 20));
    lblen7.setBounds(341, 49, 235, 17);
    panel_2.add(lblen7);
    
    JLabel lblimgn6 = new JLabel("");
    lblimgn6.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/ope6.PNG")));
    lblimgn6.setBounds(42, 226, 225, 128);
    panel_2.add(lblimgn6);
    
    JTextPane txtpnten7 = new JTextPane();
    txtpnten7.setEditable(false);
    txtpnten7.setText("Una receta para preparar arroz dice que la cantidad de agua y arroz deben estar en raz\u00F3n 2 a 1(2:1) esto quiere decir que:");
    txtpnten7.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
    txtpnten7.setBackground(Color.WHITE);
    txtpnten7.setBounds(341, 77, 255, 94);
    panel_2.add(txtpnten7);
    
    JLabel lblimgn7 = new JLabel("");
    lblimgn7.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/ope71.PNG")));
    lblimgn7.setBounds(354, 200, 198, 41);
    panel_2.add(lblimgn7);
    
    JTextPane txtpnten71 = new JTextPane();
    txtpnten71.setEditable(false);
    txtpnten71.setText("Si se quieren preparar 3 tasas de arroz, \u00BFcu\u00E1nta agua se debe utilizar?");
    txtpnten71.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
    txtpnten71.setBackground(Color.WHITE);
    txtpnten71.setBounds(341, 263, 255, 72);
    panel_2.add(txtpnten71);
    
    JLabel lbln8 = new JLabel("8)");
    lbln8.setFont(new Font("Bodoni MT Black", Font.BOLD, 12));
    lbln8.setBounds(637, 54, 25, 14);
    panel_2.add(lbln8);
    
    JLabel lblen8 = new JLabel("Resuelva \r\n");
    lblen8.setFont(new Font("Segoe Print", Font.BOLD, 20));
    lblen8.setBounds(669, 49, 235, 17);
    panel_2.add(lblen8);
    
    JTextPane txtpnten8 = new JTextPane();
    txtpnten8.setEditable(false);
    txtpnten8.setText("Andrea  y Mart\u00EDn aportan 300  y 200  respectivamente, reuniendo los 500 que cuesta un paquete de  golosinas.  \u00BFC\u00F3mo deben repartirse las golosinas para que cada uno tenga en proporci\u00F3n a lo que pag\u00F3?");
    txtpnten8.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 18));
    txtpnten8.setBackground(Color.WHITE);
    txtpnten8.setBounds(679, 77, 255, 187);
    panel_2.add(txtpnten8);
    
    JLabel lblrn6 = new JLabel("R//");
    lblrn6.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblrn6.setBounds(42, 389, 28, 17);
    panel_2.add(lblrn6);
    
    txtresultadon6 = new JTextField();
    txtresultadon6.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon6.setEnabled(false);
    txtresultadon6.setColumns(10);
    txtresultadon6.setBounds(80, 389, 92, 20);
    panel_2.add(txtresultadon6);
    
    JLabel lblayudan6 = new JLabel("");
    lblayudan6.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		 
    		JOptionPane.showMessageDialog(null, "", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayuda6);
    	}
    });
    lblayudan6.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/ayuda2.png")));
    lblayudan6.setToolTipText("\u00BFNecesitas ayuda?");
    lblayudan6.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblayudan6.setBounds(190, 389, 24, 24);
    panel_2.add(lblayudan6);
    
    
    
    
    JLabel lblrn7 = new JLabel("R//");
    lblrn7.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblrn7.setBounds(354, 389, 28, 17);
    panel_2.add(lblrn7);
    
    txtresultadon7 = new JTextField();
    txtresultadon7.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon7.setEnabled(false);
    txtresultadon7.setColumns(10);
    txtresultadon7.setBounds(392, 389, 92, 20);
    panel_2.add(txtresultadon7);
    
    JLabel lblayudan7 = new JLabel("");
    lblayudan7.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Recuerda que también puedes acudir a la ayuda de la pregunta 6.", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayuda7);
    	}
    });
    lblayudan7.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/ayuda2.png")));
    lblayudan7.setToolTipText("\u00BFNecesitas ayuda?");
    lblayudan7.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblayudan7.setBounds(502, 389, 24, 24);
    panel_2.add(lblayudan7);
    
    JLabel lblrn8 = new JLabel("R//");
    lblrn8.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblrn8.setBounds(651, 389, 28, 17);
    panel_2.add(lblrn8);
    
    txtresultadon8 = new JTextField();
    txtresultadon8.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon8.setEnabled(false);
    txtresultadon8.setColumns(10);
    txtresultadon8.setBounds(689, 389, 64, 20);
    panel_2.add(txtresultadon8);
    
    txtresultadon81 = new JTextField();
    txtresultadon81.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo números enteros o Decimales(.)");
    		}
    	}
    });
    txtresultadon81.setEnabled(false);
    txtresultadon81.setColumns(10);
    txtresultadon81.setBounds(784, 389, 64, 20);
    panel_2.add(txtresultadon81);
    
    JLabel lblayudan8 = new JLabel("");
    lblayudan8.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Puedes acudir a las ayuda de la pregunta 6 y 7.", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayd);
    	}
    });
    lblayudan8.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/ayuda2.png")));
    lblayudan8.setToolTipText("\u00BFNecesitas ayuda?");
    lblayudan8.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblayudan8.setBounds(858, 389, 24, 24);
    panel_2.add(lblayudan8);
    
    JLabel lbltxt8 = new JLabel("Y");
    lbltxt8.setFont(new Font("Tahoma", Font.BOLD, 12));
    lbltxt8.setBounds(766, 390, 19, 17);
    panel_2.add(lbltxt8);
    
    JLabel lblimgn8 = new JLabel("");
    lblimgn8.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imgNM/ope8.PNG")));
    lblimgn8.setBounds(668, 263, 198, 115);
    panel_2.add(lblimgn8);
    
    btnvalidarrespuestas = new JButton("");
    btnvalidarrespuestas.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/check.png")));
    btnvalidarrespuestas.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		campos_no_vacios();
    		respuestas();
    	}
    });
    btnvalidarrespuestas.setToolTipText("Validación de sus respuestas");
    btnvalidarrespuestas.setEnabled(false);
    btnvalidarrespuestas.setBounds(10, 561, 61, 41);
    panel_2.add(btnvalidarrespuestas);

    
    btnenviarrespuestas = new JButton("");
    btnenviarrespuestas.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/enviar.png")));
    btnenviarrespuestas.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    	}
    });
    btnenviarrespuestas.setToolTipText("Envia las repuestas al EV3\r\n");
    btnenviarrespuestas.setEnabled(false);
    btnenviarrespuestas.setBounds(77, 561, 61, 41);
    panel_2.add(btnenviarrespuestas);
    
    
    btncronometro = new JButton("");
    btncronometro.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/cronometro.png")));
    btncronometro.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		music= java.applet.Applet.newAudioClip(getClass().getResource("/Musica/ww.wav"));
    		music.loop();
	        cr.setVisible(true);
	        btnvalidarrespuestas.setEnabled(true);
	        btncronometro.setEnabled(false);
    		
    	}
    });
    btncronometro.setToolTipText("Cronómetro del juego\r\n");
    btncronometro.setBounds(144, 561, 61, 41);
    
    panel_2.add(btncronometro);
    
    btnpararmusica = new JButton("");
    btnpararmusica.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/stop.png")));
    btnpararmusica.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
			music.stop();
    	}
    });
    btnpararmusica.setToolTipText("Detener música\r\n");
    btnpararmusica.setBounds(211, 561, 61, 41);
    panel_2.add(btnpararmusica);
    
    
    
    
    
    JLabel lblimgsyslac = new JLabel("");
    lblimgsyslac.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/2.jpg")));
    lblimgsyslac.setBounds(580, 520, 82, 123);
    panel_2.add(lblimgsyslac);
	
    
    
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
    	gl_panel.createParallelGroup(Alignment.TRAILING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addContainerGap(140, Short.MAX_VALUE)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    					.addGroup(gl_panel.createSequentialGroup()
    						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    							.addGroup(gl_panel.createSequentialGroup()
    								.addComponent(label)
    								.addGap(1172))
    							.addGroup(gl_panel.createSequentialGroup()
    								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    									.addComponent(lbln1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
    									.addComponent(label_1))
    								.addGap(18)))
    						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    							.addGroup(gl_panel.createSequentialGroup()
    								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
    										.addGroup(gl_panel.createSequentialGroup()
    											.addComponent(lblRealiceElSiguiente, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
    											.addGap(100)
    											.addComponent(lbln2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
    										.addGroup(gl_panel.createSequentialGroup()
    											.addComponent(lbleje1)
    											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    											.addComponent(lbln3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
    									.addGroup(gl_panel.createSequentialGroup()
    										.addComponent(lblrn1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    										.addGap(10)
    										.addComponent(txtresultadon1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
    										.addGap(18)
    										.addComponent(lblayudan1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
    								.addGap(18)
    								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    									.addGroup(gl_panel.createSequentialGroup()
    										.addComponent(lblrn3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    										.addPreferredGap(ComponentPlacement.RELATED)
    										.addComponent(txtresultadon3, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
    										.addGap(18)
    										.addComponent(lblayuda3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    									.addComponent(Lblen3, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
    									.addGroup(gl_panel.createSequentialGroup()
    										.addPreferredGap(ComponentPlacement.RELATED)
    										.addComponent(lbleje31)
    										.addGap(18)
    										.addComponent(lbl33)
    										.addGap(18)
    										.addComponent(lbleje32))
    									.addGroup(gl_panel.createSequentialGroup()
    										.addComponent(lblrn2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    										.addGap(10)
    										.addComponent(txtresultadon2, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
    										.addGap(18)
    										.addComponent(lblayudan2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    									.addComponent(lbleje2)
    									.addComponent(lblen2, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)))
    							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 941, GroupLayout.PREFERRED_SIZE))
    						.addContainerGap())
    					.addGroup(gl_panel.createSequentialGroup()
    						.addComponent(lbltitulo, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
    						.addGap(415))
    					.addGroup(gl_panel.createSequentialGroup()
    						.addComponent(lblEjerciciosDeFracciones, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
    						.addGap(375)))
    				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
    					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 1014, GroupLayout.PREFERRED_SIZE)
    					.addContainerGap())))
    );
    gl_panel.setVerticalGroup(
    	gl_panel.createParallelGroup(Alignment.LEADING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addContainerGap()
    			.addComponent(lbltitulo, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addComponent(lblEjerciciosDeFracciones, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    			.addGap(38)
    			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    					.addComponent(lblRealiceElSiguiente, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    					.addComponent(lbln1))
    				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    					.addComponent(lblen2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    					.addComponent(lbln2)))
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(28)
    							.addComponent(lbleje1))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(40)
    							.addComponent(lbleje2)
    							.addGap(18)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(lblrn2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtresultadon2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    								.addComponent(lblayudan2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(50)
    							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    								.addComponent(Lblen3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    								.addComponent(lbln3))
    							.addPreferredGap(ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
    							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    										.addComponent(lblayudan1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    											.addComponent(lblrn1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    											.addComponent(txtresultadon1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
    									.addGap(36))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    										.addComponent(lbleje32)
    										.addComponent(lbleje31))
    									.addGap(26))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(lbl33)
    									.addGap(50)))))
    					.addGap(15)
    					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    						.addComponent(lblrn3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtresultadon3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    						.addComponent(lblayuda3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.UNRELATED)
    					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(397)
    					.addComponent(label)
    					.addGap(9)
    					.addComponent(label_1)
    					.addGap(415)))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 646, GroupLayout.PREFERRED_SIZE)
    			.addGap(58))
    		    
    );
    
    JLabel lbltxt8_1 = new JLabel("Y");
    lbltxt8_1.setFont(new Font("Tahoma", Font.BOLD, 12));
    lbltxt8_1.setBounds(585, 343, 19, 17);
    panel_1.add(lbltxt8_1);
    
    JLabel lblimgfunlam = new JLabel("");
    lblimgfunlam.setIcon(new ImageIcon(Nivel_Medio.class.getResource("/imagenes/amigo.png")));
    lblimgfunlam.setBounds(669, 571, 263, 94);
    panel_2.add(lblimgfunlam);
    gl_panel.setAutoCreateGaps(true);
    gl_panel.setAutoCreateContainerGaps(true);
    panel.setLayout(gl_panel);
    
    scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    getContentPane().add(scrollpane, BorderLayout.EAST);
  }
}
