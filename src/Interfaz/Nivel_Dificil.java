
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
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Nivel_Dificil extends JFrame {

	private static final long serialVersionUID = 1L;
	JScrollPane scrollpane;
	  public static Double p1,a1,p2,a2,p3,a3,p4,a4,p5,a5,pirata,oso,nina;
	  public static JLabel ay1,ay2,ay3,ay4,ay5,ay6,ay7,ay8;
	  public static JTextField s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
	  private static JButton btncronometro,btnev3,btnrespuestas,btnstop;
	  public static AudioClip music;
	    Icon ayd1=new ImageIcon(getClass().getResource("/imgNA/pitagoras.jpg"));
	    Icon ayd2=new ImageIcon(getClass().getResource("/imgNA/perimetro.jpg"));
	    Icon ayd4=new ImageIcon(getClass().getResource("/imgNA/"));
	    Icon ayd5=new ImageIcon(getClass().getResource("/imgNA/"));
	    Icon ayd6=new ImageIcon(getClass().getResource("/imgNA/"));
	    Icon ayd7=new ImageIcon(getClass().getResource("/imgNA/"));
	    Icon ayd8=new ImageIcon(getClass().getResource("/imgNA/"));
	    Icon ayd9=new ImageIcon(getClass().getResource("/imgNA/"));
		Icon fail=new ImageIcon(getClass().getResource("/imagenes/cerrar.png"));
		
	//PRUEBA 04 09 19
		 Cronometro cr=new Cronometro();
		
	  public static void main(String args[]) {
		  EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Nivel_Dificil frame = new Nivel_Dificil();
						frame.setVisible(true);
						frame.setLocationRelativeTo(null);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	  }
	 
	  public void esay(java.awt.event.KeyEvent evt){
		if(evt.getKeyCode()==KeyEvent.VK_ENTER){
			campos_no_vacios();
			Captura_de_resultados();
			 if((p1!=30.32 & a1!=54)||(p2!=20 & a2!=25)||(p3!=30 & a3!=60)||(p4!=30 & a4!=43.30)||(p5!=24 & a5!=28)||(pirata!=445)||(oso!=3.5)||(nina!=350)){
				s1.setText(""); s2.setText(""); s3.setText(""); s4.setText(""); s5.setText(""); s6.setText(""); s7.setText(""); s8.setText(""); s9.setText("");
				s10.setText(""); s11.setText(""); s12.setText(""); s13.setText("");
			 }
			 s1.setText("30.32"); s2.setText("54"); s3.setText("20"); s4.setText("25"); s5.setText("30"); s6.setText("60"); s7.setText("30"); s8.setText("43.30"); s9.setText("24");
				s10.setText("28"); s11.setText("445"); s12.setText("3.5"); s13.setText("350");
			}
		}  
	  
	  public Nivel_Dificil() {
	  	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	  	setForeground(Color.GRAY);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				alcerrar();
			}
		});
		
	  	setResizable(false);
	  	setAutoRequestFocus(false);
	    setIconImage(Toolkit.getDefaultToolkit().getImage(Nivel_Dificil.class.getResource("/imagenes/2.jpg")));
	    setTitle("Nivel Avanzado");
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
		  s1.setEnabled(true); s2.setEnabled(true); s3.setEnabled(true); s4.setEnabled(true); s5.setEnabled(true); s6.setEnabled(true);
		  s7.setEnabled(true); s8.setEnabled(true); s9.setEnabled(true); s10.setEnabled(true); s11.setEnabled(true); s12.setEnabled(true);
		  s13.setEnabled(true);
	  }
	  
	  public static void desabilitarrespuestas() {
		  s1.setEnabled(false); s2.setEnabled(false); s3.setEnabled(false); s4.setEnabled(false); s5.setEnabled(false); s6.setEnabled(false);
		  s7.setEnabled(false); s8.setEnabled(false); s9.setEnabled(false); s10.setEnabled(false); s11.setEnabled(false); s12.setEnabled(false);
		  s13.setEnabled(false); 
	  }

	  static void campos_no_vacios(){
		    if(s1.getText().isEmpty()==true || s2.getText().isEmpty()==true || s3.getText().isEmpty()==true || s4.getText().isEmpty()==true || s5.getText().isEmpty()==true ||
		    	       s6.getText().isEmpty()==true || s7.getText().isEmpty()==true || s8.getText().isEmpty()==true || s9.getText().isEmpty()==true || s10.getText().isEmpty()==true ||
		    	  	   s11.getText().isEmpty()==true || s12.getText().isEmpty()==true || s13.getText().isEmpty()==true){
	    		  JOptionPane.showMessageDialog(null, "Revisa que ningun campo este vacio.", "Validacion", JOptionPane.INFORMATION_MESSAGE);
		    	}
		    }
		    
	  public  void Captura_de_resultados(){
         p1 = Double.valueOf(s1.getText()); p2 = Double.valueOf(s3.getText()); p3 = Double.valueOf(s5.getText()); p4 = Double.valueOf(s7.getText()); 
         p5 = Double.valueOf(s9.getText()); a1 = Double.valueOf(s2.getText()); a2 = Double.valueOf(s4.getText()); a3 = Double.valueOf(s6.getText()); 
         a4 = Double.valueOf(s8.getText()); a5 = Double.valueOf(s10.getText()); pirata = Double.valueOf(s11.getText()); oso = Double.valueOf(s12.getText()); 
         nina = Double.valueOf(s13.getText());     	
	  }
      
	  public  void validar_respuestas(){
		  if((p1!=30.32 & a1!=54)||(p2!=20 & a2!=25)||(p3!=30 & a3!=60)||(p4!=30 & a4!=43.30)||(p5!=24 & a5!=28)||(pirata!=445)||(oso!=3.5)||(nina!=350)){
	    		JOptionPane.showMessageDialog(null, "Revisa tus respuestas recuerda que tienes ayudas.", "Validacion",
	             		  JOptionPane.INFORMATION_MESSAGE);       
		  }else{
		    		JOptionPane.showMessageDialog(null, "Todo esta correcto.", "Validacion",
		             		  JOptionPane.INFORMATION_MESSAGE);
		    	 btnrespuestas.setEnabled(false);   
		    	 btnev3.setEnabled(true);
		    		Cronometro.inicio=false;
					  Cronometro.m=0; Cronometro.s=0;
		    	}
		  }
	  
  public void all() {
    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setLayout(null);
    
    scrollpane = new JScrollPane(panel);
    
    JLabel label = new JLabel("NIVEL AVANZADO");
    label.setFont(new Font("Stencil", Font.BOLD, 30));
    
    JLabel label_1 = new JLabel("EJERCICIOS DE AREA Y PERIMETRO");
    label_1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
    
    JLabel label_2 = new JLabel("NOTA: PARA CADA EJERCICIOS HALLA EL AREA,PERIMETRO Y DIGITALO EN EL CAMPO CORRESPONDIENTE");
    label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_3 = new JLabel("");
    label_3.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/1.gif")));
    label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_4 = new JLabel("");
    label_4.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/pe.jpg")));
    label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_5 = new JLabel("");
    label_5.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/3.gif")));
    label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_6 = new JLabel("");
    label_6.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/5.jpg")));
    label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_7 = new JLabel("");
    label_7.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/4.gif")));
    label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_8 = new JLabel("INGRESA SOLO EL RESULTADO NUMERICO (NATURAL O DECIMAL), NO LA UNIDAD DE MEDIDA (cm).");
    label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_10 = new JLabel("P:");
    label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s1 = new JTextField();
    s1.setBackground(Color.WHITE);
    s1.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(java.awt.event.KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo numeros enteros o Decimales(.)");
    		}} 
    	});
    s1.setEnabled(false);
    s1.setColumns(10);
    
    JLabel label_11 = new JLabel("cm");
    label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ay1 = new JLabel("");
    ay1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Usa el teorema de pitagoras para hallar el lado diagonal.\n Con  ese valor solo reemplazalo en las formulas.", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayd1);
    	}
    });
    ay1.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/ayuda2.png")));
    ay1.setToolTipText("\u00BFNecesitas ayuda?");
    ay1.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_13 = new JLabel("A:");
    label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s2 = new JTextField();
    s2.setBackground(Color.WHITE);
    s2.addKeyListener(new KeyAdapter() {
    	@Override
    	public void keyTyped(java.awt.event.KeyEvent evt) {
    		char c=evt.getKeyChar(); 	 
    		if(Character.isLetter(c)) {
    			getToolkit().beep();
       			evt.consume();
    			JOptionPane.showMessageDialog(null, "Ingresar solo numeros enteros o Decimales(.)");
    		}} 
    	});
    s2.setEnabled(false);
    s2.setColumns(10);
    
    JLabel label_14 = new JLabel("cm^2");
    label_14.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_15 = new JLabel("P:");
    label_15.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s3 = new JTextField();
    s3.setBackground(Color.WHITE);
    s3.addKeyListener(new KeyAdapter() {
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
    s3.setEnabled(false);
    s3.setColumns(10);
    
    JLabel label_16 = new JLabel("cm");
    label_16.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ay2 = new JLabel("");
    ay2.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Recuerda que un cuadrado tiene sus lados iguales por ende ya tienes 2 catetos falta (h).\n Revisa las formulas utiles del nivel", "Ayuda",
           		  JOptionPane.INFORMATION_MESSAGE,ayd2);
    	}
    });
    ay2.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/ayuda2.png")));
    ay2.setToolTipText("\u00BFNecesitas ayuda?");
    ay2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_18 = new JLabel("A:");
    label_18.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s4 = new JTextField();
    s4.setBackground(Color.WHITE);
    s4.addKeyListener(new KeyAdapter() {
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
    s4.setEnabled(false);
    s4.setColumns(10);
    
    JLabel label_19 = new JLabel("cm^2");
    label_19.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_20 = new JLabel("P:");
    label_20.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s5 = new JTextField();
    s5.setBackground(Color.WHITE);
    s5.addKeyListener(new KeyAdapter() {
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
    s5.setEnabled(false);
    s5.setColumns(10);
    
    JLabel label_21 = new JLabel("cm");
    label_21.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ay3 = new JLabel("");
    ay3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    	}
    });
    ay3.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/ayuda2.png")));
    ay3.setToolTipText("\u00BFNecesitas ayuda?");
    ay3.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_23 = new JLabel("A:");
    label_23.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s6 = new JTextField();
    s6.setBackground(Color.WHITE);
    s6.addKeyListener(new KeyAdapter() {
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
    s6.setEnabled(false);
    s6.setColumns(10);
    
    JLabel label_24 = new JLabel("cm^2");
    label_24.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_25 = new JLabel("P:");
    label_25.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s7 = new JTextField();
    s7.setBackground(Color.WHITE);
    s7.addKeyListener(new KeyAdapter() {
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
    s7.setEnabled(false);
    s7.setColumns(10);
    
    JLabel label_26 = new JLabel("cm");
    label_26.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ay4 = new JLabel("");
    ay4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Este ejercio es muy similar al 2 revisa esa ayuda.", "Ayuda",
           		  JOptionPane.INFORMATION_MESSAGE);
    	}
    });
    ay4.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/ayuda2.png")));
    ay4.setToolTipText("\u00BFNecesitas ayuda?");
    ay4.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_28 = new JLabel("A:");
    label_28.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s8 = new JTextField();
    s8.setBackground(Color.WHITE);
    s8.addKeyListener(new KeyAdapter() {
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
    s8.setEnabled(false);
    s8.setColumns(10);
    
    JLabel label_29 = new JLabel("cm^2");
    label_29.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_30 = new JLabel("A:");
    label_30.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s10 = new JTextField();
    s10.setBackground(Color.WHITE);
    s10.addKeyListener(new KeyAdapter() {
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
    s10.setEnabled(false);
    s10.setColumns(10);
    
    JLabel label_31 = new JLabel("cm^2");
    label_31.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_32 = new JLabel("P:");
    label_32.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s9 = new JTextField();
    s9.setBackground(Color.WHITE);
    s9.addKeyListener(new KeyAdapter() {
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
    s9.setEnabled(false);
    s9.setColumns(10);
    
    JLabel label_33 = new JLabel("cm");
    label_33.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ay5 = new JLabel("");
    ay5.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    	}
    });
    ay5.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/ayuda2.png")));
    ay5.setToolTipText("\u00BFNecesitas ayuda?");
    ay5.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_35 = new JLabel("FORMULAS QUE TE PUEDEN SERVIR");
    label_35.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_36 = new JLabel("CONVERSIONES DE LONGITUD");
    label_36.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_38 = new JLabel("EL PIRATA BARBA PLATA");
    label_38.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_39 = new JLabel("EL OSO PARDO");
    label_39.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_40 = new JLabel("GABRIELITA");
    label_40.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JTextPane txtpnElPirataBarba = new JTextPane();
    txtpnElPirataBarba.setEditable(false);
    txtpnElPirataBarba.setText("El Pirata Barba Plata ha llegado a la isla del Coral para buscar un tesoro. En el mapa pone que, desde la orilla, debe recorrer 3,7 hm a la pata coja hacia el centro de la isla, y despu\u00E9s otros 8,5 dam dando volteretas en la misma direcci\u00F3n. \u00BFCu\u00E1ntos metros recorrer\u00E1 en total desde la orilla hasta el tesoro?.\r\n");
    txtpnElPirataBarba.setFont(new Font("Tahoma", Font.BOLD, 12));
    txtpnElPirataBarba.setBackground(Color.WHITE);
    
    JTextPane textPane_1 = new JTextPane();
    textPane_1.setEditable(false);
    textPane_1.setText("Un oso al que le encanta la miel quiere sacar miel de una colmena que hay en la rama de un \u00E1rbol, pero est\u00E1 demasiado alta. Para alcanzarla, se sube en una roca de 12 dm de alto que hay justo debajo y, con las garras muy estiradas, llega justo a cogerla. Si este oso cuando se estira mide exactamente 2,3 m, \u00BFa qu\u00E9 distancia del suelo estaba exactamente la colmena?");
    textPane_1.setFont(new Font("Tahoma", Font.BOLD, 12));
    textPane_1.setBackground(Color.WHITE);
    
    JTextPane txtpnquPeloMs = new JTextPane();
    txtpnquPeloMs.setEditable(false);
    txtpnquPeloMs.setText("\u00A1Qu\u00E9 pelo m\u00E1s bonito tiene Gabriela! Antes era la chica que m\u00E1s largo ten\u00EDa el pelo de toda la clase: la melena le med\u00EDa 6 dec\u00EDmetros de longitud. Pero ayer se lo cort\u00F3 25 cent\u00EDmetros, as\u00ED que ahora la chica con el pelo m\u00E1s largo de la clase es Mar\u00EDa. \u00BFCu\u00E1ntos cent\u00EDmetros mide la melena de Gabriela ahora?.");
    txtpnquPeloMs.setFont(new Font("Tahoma", Font.BOLD, 12));
    txtpnquPeloMs.setBackground(Color.WHITE);
    
    JLabel label_41 = new JLabel("");
    label_41.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/Q.jpg")));
    
    JLabel label_42 = new JLabel("");
    label_42.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/5.gif")));
    
    JLabel label_43 = new JLabel("");
    label_43.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/6.gif")));
    
    s11 = new JTextField();
    s11.setBackground(Color.WHITE);
    s11.addKeyListener(new KeyAdapter() {
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
    s11.setEnabled(false);
    s11.setColumns(10);
    
    JLabel lblM = new JLabel("m");
    lblM.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ay6 = new JLabel("");
    ay6.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    	}
    });
    ay6.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/ayuda2.png")));
    ay6.setToolTipText("\u00BFNecesitas ayuda?");
    ay6.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_46 = new JLabel("");
    label_46.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/2.jpg")));
    
    btnrespuestas = new JButton("");
    btnrespuestas.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/check.png")));
    btnrespuestas.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
        campos_no_vacios();
        Captura_de_resultados();
        validar_respuestas();
    	}
    });
    btnrespuestas.setToolTipText("Validacion de sus respuestas");
    btnrespuestas.setEnabled(false);
    
    btnev3 = new JButton("");
    btnev3.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/enviar.png")));
    btnev3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    	}
    });
    btnev3.setToolTipText("Envia las repuestas al EV3\r\n");
    btnev3.setEnabled(false);
    
    btncronometro = new JButton("");
    btncronometro.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/cronometro.png")));
    btncronometro.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
	        cr.setVisible(true);
	        btnrespuestas.setEnabled(true);
	        btncronometro.setEnabled(false);
    		
    	}
    });
    btncronometro.setToolTipText("Cronometro del juego\r\n");
    
    btnstop = new JButton("");
    btnstop.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/stop.png")));
    btnstop.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		music= java.applet.Applet.newAudioClip(getClass().getResource("/Musica/ww.wav"));
			music.stop();
    	}
    });
    btnstop.setToolTipText("Detener musica\r\n");
    
    s12 = new JTextField();
    s12.setBackground(Color.WHITE);
    s12.addKeyListener(new KeyAdapter() {
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
    s12.setEnabled(false);
    s12.setColumns(10);
    
    JLabel lblM_2 = new JLabel("m");
    lblM_2.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ay7 = new JLabel("");
    ay7.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    	}
    });
    ay7.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/ayuda2.png")));
    ay7.setToolTipText("\u00BFNecesitas ayuda?");
    ay7.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    s13 = new JTextField();
    s13.setBackground(Color.WHITE);
    s13.addKeyListener(new KeyAdapter() {
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
    s13.setEnabled(false);
    s13.setColumns(10);
    
    JLabel lblM_1 = new JLabel("cm");
    lblM_1.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel ay8 = new JLabel("");
    ay8.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    	}
    });
    ay8.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imagenes/ayuda2.png")));
    ay8.setToolTipText("\u00BFNecesitas ayuda?");
    ay8.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_53 = new JLabel("EJERCICIOS DE CONVERSION DE LONGUTID");
    label_53.setFont(new Font("Tahoma", Font.BOLD, 20));
    
    JLabel label_54 = new JLabel("");
    label_54.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/longitud.jpg")));
    label_54.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_55 = new JLabel("");
    label_55.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/perimetro.jpg")));
    label_55.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_56 = new JLabel("");
    label_56.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/pitagoras.jpg")));
    label_56.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    JLabel label_57 = new JLabel("");
    label_57.setIcon(new ImageIcon(Nivel_Dificil.class.getResource("/imgNA/area.jpg")));
    label_57.setFont(new Font("Tahoma", Font.BOLD, 14));
    
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
    	gl_panel.createParallelGroup(Alignment.TRAILING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addContainerGap(83, Short.MAX_VALUE)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(341)
    					.addComponent(label, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(283)
    					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(92)
    					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
    					.addGap(76)
    					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
    					.addGap(23)
    					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
    					.addGap(23)
    					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
    					.addGap(23)
    					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(s1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    					.addGap(4)
    					.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(ay1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    					.addGap(57)
    					.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(s3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
    					.addGap(4)
    					.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(ay2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    					.addGap(30)
    					.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(s5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
    					.addGap(4)
    					.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(ay3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    					.addGap(30)
    					.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(s7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
    					.addGap(4)
    					.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(ay4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    					.addGap(30)
    					.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(s9, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    					.addGap(4)
    					.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addComponent(ay5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(97)
    					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 735, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(150)
    					.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
    					.addGap(104)
    					.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(10)
    					.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    					.addGap(6)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(206)
    							.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(31)
    							.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
    							.addGap(128)
    							.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
    							.addGap(125)
    							.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(txtpnElPirataBarba, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(txtpnquPeloMs, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(67)
    							.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
    							.addGap(184)
    							.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
    							.addGap(167)
    							.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(39)
    							.addComponent(s11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(lblM, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ay6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(126)
    							.addComponent(s12, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(lblM_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ay7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(109)
    							.addComponent(s13, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(lblM_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(ay8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(label_46, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
    							.addGap(545)
    							.addComponent(btnrespuestas, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(btnev3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(btncronometro, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(btnstop, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(s2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(75)
    							.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(s4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(34)
    							.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(s6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(34)
    							.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(s8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
    							.addGap(42)
    							.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    							.addGap(6)
    							.addComponent(s10, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
    							.addGap(4)
    							.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))))
    			.addGap(54))
    		.addGroup(gl_panel.createSequentialGroup()
    			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(202)
    					.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
    					.addGap(18)
    					.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addContainerGap()
    					.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
    					.addGap(160)))
    			.addComponent(label_54, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
    			.addGap(224))
    );
    gl_panel.setVerticalGroup(
    	gl_panel.createParallelGroup(Alignment.LEADING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addContainerGap()
    			.addComponent(label, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
    			.addGap(6)
    			.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    			.addGap(48)
    			.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    			.addGap(11)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
    			.addGap(6)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ay1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ay2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ay3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ay4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ay5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    			.addGap(6)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
    			.addGap(28)
    			.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    			.addGap(18)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_54, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
    						.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
    			.addGap(17)
    			.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    			.addGap(37)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
    			.addGap(6)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(txtpnElPirataBarba, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
    				.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
    				.addComponent(txtpnquPeloMs, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
    			.addGap(6)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
    				.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
    			.addGap(20)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(s11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblM, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ay6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblM_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ay7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    				.addComponent(s13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblM_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
    				.addComponent(ay8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    			.addGap(29)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(1)
    					.addComponent(label_46, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(50)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(btnrespuestas, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btnev3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btncronometro, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btnstop, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
    			.addContainerGap(85, Short.MAX_VALUE))
    );
    gl_panel.setAutoCreateGaps(true);
    gl_panel.setAutoCreateContainerGaps(true);
    panel.setLayout(gl_panel);
    
    scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    getContentPane().add(scrollpane, BorderLayout.EAST);
  }
}
