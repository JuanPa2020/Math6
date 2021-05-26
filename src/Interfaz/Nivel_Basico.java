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

public class Nivel_Basico extends JFrame {

	private static final long serialVersionUID = 1L;
	JScrollPane scrollpane;
	
	private static JTextField txtp1a1, txtp1a2, txtp1a3, txtp1a4, txtp2b, txtp2abase, txtp2aexpo, txtp2dbase, txtp2dexpo, txtp2cbase, 
	txtp2cexpo, txtp3a, txtp3b, txtp5c, txtp5dbase, txtp5dexpo, txtp5b, txtp5a, txtp4expo, txtp4base, txtp6a, txtp6b, txtp6c, txtp6d, txtp6e,
	txtp7c, txtp7b, txtp7a;
	private static JTextPane txtpregunta2b, txtpregunta2a, txtpregunta2c, txtpregunta2d, txt2expo, txt3expo, txt4expo;
	private static JLabel lblayuda2, lblayuda3, lblayuda5;
	private static double  p1a1, p1a2, p1a3, p1a4, p2b, p3a, p3b, p5a, p5b, p5c, p6a, p6b, p6c, p6d, p6e, p7a, p7b, p7c, p2abase, p2aexpo, p2cbase, p2cexpo, p2dbase, p2dexpo, p4base, p4expo, p5dbase, p5dexpo;
	private static JButton btncronometro, btnrespuestas, btnpararmusica, btnenviarrespuestas;
	static AudioClip music;
	
	Icon ayuda=new ImageIcon(getClass().getResource("/imgBS/ayuda-nivelB.jpg"));
	Icon fail=new ImageIcon(getClass().getResource("/imagenes/cerrar.png"));

		 Cronometro cr=new Cronometro();
		 
		 public static void main(String args[]) {
			  EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Nivel_Basico frame = new Nivel_Basico();
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
		  }
		 
		 public Nivel_Basico() {
			  	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			  	setForeground(Color.GRAY);
				this.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent we) {
						alcerrar();
					}
				});
				
			  	setResizable(false);
			  	setAutoRequestFocus(false);
			    setIconImage(Toolkit.getDefaultToolkit().getImage(Nivel_Basico.class.getResource("/imagenes/2.jpg")));
			    setTitle("Nivel Basico");
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
			 
	  public static void habilitarrespuestas(){
		  txtp1a1.setEnabled(true); txtp1a2.setEnabled(true); txtp1a3.setEnabled(true); txtp1a4.setEnabled(true); txtp2b.setEnabled(true); txtp3a.setEnabled(true);txtp3b.setEnabled(true); txtp5a.setEnabled(true); txtp5b.setEnabled(true); txtp5c.setEnabled(true); txtp6a.setEnabled(true); txtp6b.setEnabled(true); txtp6c.setEnabled(true); txtp6d.setEnabled(true); txtp6e.setEnabled(true); txtp7a.setEnabled(true); txtp7b.setEnabled(true); txtp7c.setEnabled(true);
		  txtp2abase.setEnabled(true); txtp2aexpo.setEnabled(true); txtp2cbase.setEnabled(true); txtp2cexpo.setEnabled(true); txtp2dbase.setEnabled(true); txtp2dexpo.setEnabled(true); txtp4base.setEnabled(true); txtp4expo.setEnabled(true); txtp5dbase.setEnabled(true); txtp5dexpo.setEnabled(true);
	  }
	  
	  public static void desabilitarrespuestas() {
		  txtp1a1.setEnabled(false); txtp1a2.setEnabled(false); txtp1a3.setEnabled(false); txtp1a4.setEnabled(false); txtp2b.setEnabled(false); txtp3a.setEnabled(false);txtp3b.setEnabled(false); txtp5a.setEnabled(false); txtp5b.setEnabled(false); txtp5c.setEnabled(false); txtp6a.setEnabled(false); txtp6b.setEnabled(false); txtp6c.setEnabled(false); txtp6d.setEnabled(false); txtp6e.setEnabled(false); txtp7a.setEnabled(false); txtp7b.setEnabled(false); txtp7c.setEnabled(false);
		  txtp2abase.setEnabled(false); txtp2aexpo.setEnabled(false); txtp2cbase.setEnabled(false); txtp2cexpo.setEnabled(false); txtp2dbase.setEnabled(false); txtp2dexpo.setEnabled(false); txtp4base.setEnabled(false); txtp4expo.setEnabled(false); txtp5dbase.setEnabled(false); txtp5dexpo.setEnabled(false);
	  }
	  
	  public static void captura_respuestas(){
		  
  p1a1 = Double.valueOf(txtp1a1.getText()); p1a2 = Double.valueOf(txtp1a2.getText()); p1a3 = Double.valueOf(txtp1a3.getText()); p1a4 = Double.valueOf(txtp1a4.getText());
  p2b = Double.valueOf(txtp2b.getText()); p3a = Double.valueOf(txtp3a.getText()); p3b = Double.valueOf(txtp3b.getText()); p5a = Double.valueOf(txtp5a.getText());
  p5b = Double.valueOf(txtp5b.getText()); p5c = Double.valueOf(txtp5c.getText()); p6a = Double.valueOf(txtp6a.getText()); p6b = Double.valueOf(txtp6b.getText());
  p6c = Double.valueOf(txtp6c.getText()); p6d = Double.valueOf(txtp6d.getText()); p6e = Double.valueOf(txtp6e.getText()); p7a = Double.valueOf(txtp7a.getText());
  p7b = Double.valueOf(txtp7b.getText()); p7c = Double.valueOf(txtp7c.getText());	
  p2abase = Double.valueOf(txtp2abase.getText()); p2aexpo = Double.valueOf(txtp2aexpo.getText()); p2cbase = Double.valueOf(txtp2cbase.getText()); p2cexpo = Double.valueOf(txtp2cexpo.getText());
  p2dbase = Double.valueOf(txtp2dbase.getText()); p2dexpo = Double.valueOf(txtp2dexpo.getText()); p4base = Double.valueOf(txtp4base.getText()); p4expo = Double.valueOf(txtp4expo.getText());
  p5dbase = Double.valueOf(txtp5dbase.getText()); p5dexpo = Double.valueOf(txtp5dexpo.getText());
	  }
	  
	  public static void validar_respuestas(){
	  		 if(p1a1==16 && p1a2==32 && p1a3==64 && p1a4==128 && p2b==1000 && p3a==64 && p3b==256 && p5a==1 && p5b==-3 && p5c==16 && p6a==2 && p6b==2 && p6c==3 && p6d==2 && p6e==5 && p7a==81 && p7b==125 && p7c==1296 && p2abase==1 && p2aexpo==20 && p2cbase==4 && p2cexpo==4 && p2dbase==1.75 && p2dexpo==5 && p4base==4 && p4expo==3 && p5dbase==216 && p5dexpo==9){
	  			JOptionPane.showMessageDialog(null, "Todo esta correcto.", "Validacion",
	             		  JOptionPane.INFORMATION_MESSAGE);
	    	 btnrespuestas.setEnabled(false);   
	    	 btnenviarrespuestas.setEnabled(true);
	    	 Cronometro.inicio=false;
			  Cronometro.m=0; Cronometro.s=0;
			  desabilitarrespuestas();
	    	 
		  }else{ JOptionPane.showMessageDialog(null, "Incorrecto. Revisa tus respuestas recuerda que tienes ayudas.", "Validacion",
         		  JOptionPane.INFORMATION_MESSAGE);   		    		
		    	}
	  }
	  
	  public static void campos_no_vacios(){
	         if(txtp1a1.getText().isEmpty()==true | txtp1a2.getText().isEmpty()==true | txtp1a3.getText().isEmpty()==true | txtp1a4.getText().isEmpty()==true | txtp2b.getText().isEmpty()==true | txtp3a.getText().isEmpty()==true | txtp3b.getText().isEmpty()==true | txtp5a.getText().isEmpty()==true | 
	        	txtp5b.getText().isEmpty()==true | txtp5c.getText().isEmpty()==true | txtp6a.getText().isEmpty()==true | txtp6b.getText().isEmpty()==true | txtp6c.getText().isEmpty()==true | txtp6d.getText().isEmpty()==true | txtp6e.getText().isEmpty()==true | txtp7a.getText().isEmpty()==true | txtp7b.getText().isEmpty()==true |
	        	txtp7c.getText().isEmpty()==true | txtp2abase.getText().isEmpty()==true | txtp2aexpo.getText().isEmpty()==true | txtp2cbase.getText().isEmpty()==true | txtp2cexpo.getText().isEmpty()==true | txtp2dbase.getText().isEmpty()==true |
	        	txtp2dexpo.getText().isEmpty()==true | txtp4base.getText().isEmpty()==true | txtp4expo.getText().isEmpty()==true | txtp5dbase.getText().isEmpty()==true | txtp5dexpo.getText().isEmpty()==true){
	        	 JOptionPane.showMessageDialog(null, "Revise que ningun campo este vacio.", "Validando Datos", JOptionPane.INFORMATION_MESSAGE);  
			  } 
				 
		  }
	  		

  public void all() {
    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setLayout(null);
    
    scrollpane = new JScrollPane(panel);
    
    JLabel lblNivelMedio = new JLabel("NIVEL B\u00C1SICO");
    lblNivelMedio.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 30));
    
    JTextPane txtpregunta1a = new JTextPane();
    txtpregunta1a.setEditable(false);
    txtpregunta1a.setBackground(Color.WHITE);
    txtpregunta1a.setForeground(Color.BLACK);
    txtpregunta1a.setText("1.  El ajedrez, considerado como el juego de los reyes, ha sido interesante desde su misma creaci\u00F3n.\r\nCuenta la historia que el rey ofreci\u00F3 una gratificaci\u00F3n a su inventor, quien despu\u00E9s de ense\u00F1arle a jugar hizo la siguiente petici\u00F3n:\r\nUn grano de trigo por el primer cuadrado del tablero de ajedrez, 2 por el segundo, 4 por el tercero, 8 granos por el cuarto y as\u00ED sucesivamente hasta llenar el tablero, que en total tiene 64 cuadros.\r\n\r\n\u00BFPodr\u00EDas indicar cu\u00E1ntos granos de trigo recibi\u00F3 el inventor por el quinto, sexto, s\u00E9ptimo y octavo cuadros?");
    txtpregunta1a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp1a1 = new JTextField();
    txtp1a1.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1a1.setEnabled(false);
    txtp1a1.setColumns(10);
    
    txtp1a2 = new JTextField();
    txtp1a2.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1a2.setEnabled(false);
    txtp1a2.setColumns(10);
    
    txtp1a3 = new JTextField();
    txtp1a3.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1a3.setEnabled(false);
    txtp1a3.setColumns(10);
    
    txtp1a4 = new JTextField();
    txtp1a4.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp1a4.setEnabled(false);
    txtp1a4.setColumns(10);
    
    txtpregunta2a = new JTextPane();
    txtpregunta2a.setEditable(false);
    txtpregunta2a.setText("2.  Transforma de notaci\u00F3n cient\u00EDfica a expresi\u00F3n normal o de expresi\u00F3n normal a notaci\u00F3n cient\u00EDfica:\r\n\r\n(BASE *10^ EXPONENTE)\r\n\r\na.  N\u00FAmero de neuronas aproximado de neuronas en el cerebro humano es 100000000000000000000");
    txtpregunta2a.setForeground(Color.BLACK);
    txtpregunta2a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta2a.setBackground(Color.WHITE);
    
    txtpregunta2b = new JTextPane();
    txtpregunta2b.setEditable(false);
    txtpregunta2b.setText("b.  El a\u00F1o en que se encontraba en auge el feudalismo en Europa es 1*10^3");
    txtpregunta2b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp2b = new JTextField();
    txtp2b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2b.setEnabled(false);
    txtp2b.setColumns(10);
    
    txtpregunta2c = new JTextPane();
    txtpregunta2c.setEditable(false);
    txtpregunta2c.setText("c.  40000 km/h es la velocidad que debe alcanzar un cohete para vencer la atracci\u00F3n de la tierra.");
    txtpregunta2c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtpregunta2d = new JTextPane();
    txtpregunta2d.setEditable(false);
    txtpregunta2d.setText("d.  Una sola pila puede contaminar 175000 litros de agua.");
    txtpregunta2d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp2abase = new JTextField();
    txtp2abase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2abase.setEnabled(false);
    txtp2abase.setColumns(10);
    
    txt2expo = new JTextPane();
    txt2expo.setEditable(false);
    txt2expo.setText("* 10^");
    txt2expo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
    
    txtp2aexpo = new JTextField();
    txtp2aexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2aexpo.setEnabled(false);
    txtp2aexpo.setColumns(10);
    
    txtp2dbase = new JTextField();
    txtp2dbase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2dbase.setEnabled(false);
    txtp2dbase.setColumns(10);
    
    txt3expo = new JTextPane();
    txt3expo.setEditable(false);
    txt3expo.setText("* 10^");
    txt3expo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
    
    txtp2dexpo = new JTextField();
    txtp2dexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2dexpo.setEnabled(false);
    txtp2dexpo.setColumns(10);
    
    txtp2cbase = new JTextField();
    txtp2cbase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2cbase.setEnabled(false);
    txtp2cbase.setColumns(10);
    
    txt4expo = new JTextPane();
    txt4expo.setEditable(false);
    txt4expo.setText("* 10^");
    txt4expo.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
    
    txtp2cexpo = new JTextField();
    txtp2cexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp2cexpo.setEnabled(false);
    txtp2cexpo.setColumns(10);
    
    lblayuda2 = new JLabel("");
    lblayuda2.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    		JOptionPane.showMessageDialog(null, "Un uso importante de la potenciacion es la notacion cientifica que permite expresar cantidades muy grandes o muy pequenas, como potencias de 10.\n\n 10^0 = 1 \n\n 10^2=100 \n\n 10^3=1000");
    	}
    });
    lblayuda2.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/ayuda2.png")));
    
    JLabel lblayuda1 = new JLabel("");
    lblayuda1.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Ejemplo:", "Ayuda",
             		  JOptionPane.INFORMATION_MESSAGE,ayuda);
    	}
    });
    lblayuda1.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/ayuda2.png")));
    
    JTextPane txtpregunta3 = new JTextPane();
    txtpregunta3.setEditable(false);
    txtpregunta3.setText("3.  Si cada persona tuvo 2 padres, 4 abuelos, 8 bisabuelos, etc\u2026\r\nEs decir, tiene 2 antepasados de hace una generaci\u00F3n, 4 de hace dos generaciones, 8 de hace tres generaciones y as\u00ED sucesivamente.");
    txtpregunta3.setForeground(Color.BLACK);
    txtpregunta3.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta3.setBackground(Color.WHITE);
    
    JTextPane txtpregunta3a = new JTextPane();
    txtpregunta3a.setEditable(false);
    txtpregunta3a.setText("a.  \u00BFCu\u00E1ntos antepasados de hace 6 generaciones tiene cada persona? ");
    txtpregunta3a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp3a = new JTextField();
    txtp3a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp3a.setEnabled(false);
    txtp3a.setColumns(10);
    
    JTextPane txtpregunta3b = new JTextPane();
    txtpregunta3b.setEditable(false);
    txtpregunta3b.setText("b.  \u00BFCu\u00E1ntos antepasados de hace 8 generaciones tiene cada persona? ");
    txtpregunta3b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp3b = new JTextField();
    txtp3b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp3b.setEnabled(false);
    txtp3b.setColumns(10);
    
    JTextPane txtpregunta5c = new JTextPane();
    txtpregunta5c.setEditable(false);
    txtpregunta5c.setText("c.  [4^(5) / 4] / 42 = ");
    txtpregunta5c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5c = new JTextField();
    txtp5c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5c.setEnabled(false);
    txtp5c.setColumns(10);
    
    JTextPane txtpregunta5d = new JTextPane();
    txtpregunta5d.setEditable(false);
    txtpregunta5d.setText("d.  [6 a^(3)]^3 =");
    txtpregunta5d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5dbase = new JTextField();
    txtp5dbase.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5dbase.setEnabled(false);
    txtp5dbase.setColumns(10);
    
    JTextPane txt6expo = new JTextPane();
    txt6expo.setEditable(false);
    txt6expo.setText("a^");
    txt6expo.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
    
    txtp5dexpo = new JTextField();
    txtp5dexpo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5dexpo.setEnabled(false);
    txtp5dexpo.setColumns(10);
    
    txtp5b = new JTextField();
    txtp5b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5b.setEnabled(false);
    txtp5b.setColumns(10);
    
    JTextPane txtpregunta5b = new JTextPane();
    txtpregunta5b.setEditable(false);
    txtpregunta5b.setText("b.  [ 8^(3) * (-3)^(4) * ((-3)^2)^(6) ]  /  [ ((-3)^3)^(2) * (-3)^(9) * 83 ] =");
    txtpregunta5b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    JTextPane txtpregunta5a = new JTextPane();
    txtpregunta5a.setEditable(false);
    txtpregunta5a.setText("a.  [ a^(-2) * b^(-2) ] / [ a^(-1) * b^(-1) ]^2  =");
    txtpregunta5a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp5a = new JTextField();
    txtp5a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp5a.setEnabled(false);
    txtp5a.setColumns(10);
    
    JTextPane txtpregunta5 = new JTextPane();
    txtpregunta5.setText("5.  Soluciona las siguiente operaciones usando las propiedades:");
    txtpregunta5.setForeground(Color.BLACK);
    txtpregunta5.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta5.setBackground(Color.WHITE);
    
    txtp4expo = new JTextField();
    txtp4expo.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp4expo.setEnabled(false);
    txtp4expo.setColumns(10);
    
    JTextPane txt5expo = new JTextPane();
    txt5expo.setText("^");
    txt5expo.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
    
    txtp4base = new JTextField();
    txtp4base.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp4base.setEnabled(false);
    txtp4base.setColumns(10);
    
    JTextPane txtpregunta4 = new JTextPane();
    txtpregunta4.setEditable(false);
    txtpregunta4.setText("4.  Un profesor tiene 4 paquetes con 4 cajas en cada paquete. En cada caja hay 4 l\u00E1pices. \u00BFCu\u00E1ntos l\u00E1pices tiene el profesor? Escribe la respuesta en forma de potencia.\r\n\r\n(BASE ^ EXPONENTE)");
    txtpregunta4.setForeground(Color.BLACK);
    txtpregunta4.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta4.setBackground(Color.WHITE);
    
    lblayuda3 = new JLabel("");
    lblayuda3.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent arg0) {
    		JOptionPane.showMessageDialog(null, "Ejemplo:", "Ayuda",
           		  JOptionPane.INFORMATION_MESSAGE,ayuda);
    	}
    });
    lblayuda3.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/ayuda2.png")));
    
    lblayuda5 = new JLabel("");
    lblayuda5.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "Producto de potencias de igual base\n a^(n) x a^(m) = a^(n+m)\n\nPotencia de una potencia\n [a^(n)]^m = a^(nxm)\n\nDistributiva de la potenciacion respecto a la multiplicacion\n (a x b)^n = a^(n) x b^(n)\n\nDistributiva de la potenciacion respecto a la division\n (a/b)^n = a^(n)/b^(n)\n\nCociente entre potencias de igual base\n a^(n)/a^(m) = a^(n-m)");
    	}
    });
    lblayuda5.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/ayuda2.png")));
    
    JLabel lblimgmat6 = new JLabel("");
    lblimgmat6.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/2.jpg")));
    
    JLabel lblimgluisa = new JLabel("");
    lblimgluisa.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/amigo.png")));
    
    JTextPane txtpregunta6 = new JTextPane();
    txtpregunta6.setEditable(false);
    txtpregunta6.setText("RA\u00CDZ C\u00DABICA: n^(1/3)\r\nRA\u00CDZ CUARTA: n^(1/4)\r\nRA\u00CDZ QUINTA: n^(1/5)\r\n\r\n6.  Calcula las siguientes ra\u00EDces exactas:");
    txtpregunta6.setForeground(Color.BLACK);
    txtpregunta6.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta6.setBackground(Color.WHITE);
    
    txtp6a = new JTextField();
    txtp6a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6a.setEnabled(false);
    txtp6a.setColumns(10);
    
    JTextPane txtpregunta6a = new JTextPane();
    txtpregunta6a.setEditable(false);
    txtpregunta6a.setText("a.  (32)^(1/5) = ");
    txtpregunta6a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    JTextPane txtpregunta6b = new JTextPane();
    txtpregunta6b.setEditable(false);
    txtpregunta6b.setText("b.  (64/8)^(1/3) = ");
    txtpregunta6b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    JTextPane txtpregunta6c = new JTextPane();
    txtpregunta6c.setEditable(false);
    txtpregunta6c.setText("c.  (243)/(1/5) = ");
    txtpregunta6c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp6b = new JTextField();
    txtp6b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6b.setEnabled(false);
    txtp6b.setColumns(10);
    
    txtp6c = new JTextField();
    txtp6c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6c.setEnabled(false);
    txtp6c.setColumns(10);
    
    txtp6d = new JTextField();
    txtp6d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6d.setEnabled(false);
    txtp6d.setColumns(10);
    
    txtp6e = new JTextField();
    txtp6e.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp6e.setEnabled(false);
    txtp6e.setColumns(10);
    
    JTextPane txtpregunta6d = new JTextPane();
    txtpregunta6d.setEditable(false);
    txtpregunta6d.setText("d.  (128)/(1/7) = ");
    txtpregunta6d.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    JTextPane txtpregunta6e = new JTextPane();
    txtpregunta6e.setEditable(false);
    txtpregunta6e.setText("e.  (125)^(1/3) = ");
    txtpregunta6e.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    JTextPane txtpregunta7 = new JTextPane();
    txtpregunta7.setEditable(false);
    txtpregunta7.setText("7.  Calcula el valor de x:");
    txtpregunta7.setForeground(Color.BLACK);
    txtpregunta7.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtpregunta7.setBackground(Color.WHITE);
    
    JTextPane txtpregunta7a = new JTextPane();
    txtpregunta7a.setEditable(false);
    txtpregunta7a.setText("a.  x^(1/4) = 3  ;  x =");
    txtpregunta7a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    JTextPane txtpregunta7b = new JTextPane();
    txtpregunta7b.setEditable(false);
    txtpregunta7b.setText("b.  x^(1/3) = 5  ;  x =");
    txtpregunta7b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    JTextPane txtpregunta7c = new JTextPane();
    txtpregunta7c.setEditable(false);
    txtpregunta7c.setText("c.  x^(1/4) = 6  ;  x =");
    txtpregunta7c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    
    txtp7c = new JTextField();
    txtp7c.setEnabled(false);
    txtp7c.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp7c.setColumns(10);
    
    txtp7b = new JTextField();
    txtp7b.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp7b.setEnabled(false);
    txtp7b.setColumns(10);
    
    txtp7a = new JTextField();
    txtp7a.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));
    txtp7a.setEnabled(false);
    txtp7a.setColumns(10);
    
    btnrespuestas = new JButton("");
    btnrespuestas.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/check.png")));
    btnrespuestas.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		campos_no_vacios();
    		captura_respuestas();
    		validar_respuestas();
    	}
    });
    btnrespuestas.setToolTipText("Validacion de sus respuestas");
    btnrespuestas.setEnabled(false);
    
    btnenviarrespuestas = new JButton("");
    btnenviarrespuestas.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/enviar.png")));
    btnenviarrespuestas.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    	}
    });
    btnenviarrespuestas.setToolTipText("Envia las repuestas al EV3\r\n");
    btnenviarrespuestas.setEnabled(false);
     

   
    btncronometro = new JButton("");
    btncronometro.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/cronometro.png")));
    btncronometro.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		music= java.applet.Applet.newAudioClip(getClass().getResource("/Musica/ww.wav"));
    		music.loop();
	        cr.setVisible(true);
	        btnrespuestas.setEnabled(true);
	        btncronometro.setEnabled(false);
    		
    	}
    });

    btncronometro.setToolTipText("Cronometro del juego\r\n");
      

    btnpararmusica = new JButton("");
    btnpararmusica.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/stop.png")));
    btnpararmusica.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		music.stop();
    	}
    });
    btnpararmusica.setToolTipText("Detener musica\r\n");
    
    JLabel lblayuda4 = new JLabel("");
    lblayuda4.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseClicked(MouseEvent e) {
    		JOptionPane.showMessageDialog(null, "AYUDA 1:\n (1)^(1/4) = 1 \nPorque \n 1^4 = 1*1*1*1 = 1 \n\n\nAYUDA 2: \n (x)^(1/2) = 7 \nSe elevan ambos lados al cuadrado para eliminar la raiz \n x = 49");
    	}
    });
    lblayuda4.setIcon(new ImageIcon(Nivel_Basico.class.getResource("/imagenes/ayuda2.png")));
   
    
    GroupLayout gl_panel = new GroupLayout(panel);
    gl_panel.setHorizontalGroup(
    	gl_panel.createParallelGroup(Alignment.LEADING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addGap(3038)
    			.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
    					.addComponent(btnrespuestas, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(btnenviarrespuestas, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(btncronometro, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(btnpararmusica, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
    					.addGap(213)
    					.addComponent(lblimgmat6, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
    					.addGap(7)
    					.addComponent(lblimgluisa, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
    					.addGap(117))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(lblNivelMedio, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
    					.addGap(349))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(txtpregunta1a, GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
    							.addGap(46))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(txtpregunta3, GroupLayout.PREFERRED_SIZE, 497, GroupLayout.PREFERRED_SIZE)
    							.addPreferredGap(ComponentPlacement.RELATED)))
    					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(txtp2dbase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    							.addGap(10)
    							.addComponent(txt3expo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    							.addGap(10)
    							.addComponent(txtp2dexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    							.addGap(133))
    						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    							.addGroup(gl_panel.createSequentialGroup()
    								.addGap(160)
    								.addComponent(txtp2b, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
    							.addGroup(gl_panel.createSequentialGroup()
    								.addPreferredGap(ComponentPlacement.RELATED)
    								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    									.addComponent(txtpregunta2d, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    									.addComponent(txtpregunta2b, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    									.addComponent(txtpregunta2a, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    									.addComponent(txtpregunta2c, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)))
    							.addGroup(gl_panel.createSequentialGroup()
    								.addGap(120)
    								.addComponent(txtp2abase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    								.addPreferredGap(ComponentPlacement.UNRELATED)
    								.addComponent(txt2expo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    								.addGap(10)
    								.addComponent(txtp2aexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
    							.addGroup(gl_panel.createSequentialGroup()
    								.addGap(128)
    								.addComponent(txtp2cbase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    								.addGap(10)
    								.addComponent(txt4expo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    								.addGap(10)
    								.addComponent(txtp2cexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    									.addGroup(gl_panel.createSequentialGroup()
    										.addComponent(txtpregunta3a, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
    										.addGap(7)
    										.addComponent(txtp3a, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    									.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
    										.addComponent(txtpregunta3b, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
    										.addGap(7)
    										.addComponent(txtp3b, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    										.addGap(26)
    										.addComponent(lblayuda3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(88)
    									.addComponent(txtp1a1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
    									.addPreferredGap(ComponentPlacement.UNRELATED)
    									.addComponent(txtp1a2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
    									.addPreferredGap(ComponentPlacement.UNRELATED)
    									.addComponent(txtp1a3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    									.addPreferredGap(ComponentPlacement.UNRELATED)
    									.addComponent(txtp1a4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    									.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
    									.addComponent(lblayuda1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
    							.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta6a, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addComponent(txtp6a, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta6b, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addComponent(txtp6b, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta6c, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
    									.addGap(8)
    									.addComponent(txtp6c, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta6d, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addComponent(txtp6d, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta6e, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addComponent(txtp6e, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta6, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
    									.addGap(74)
    									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    										.addComponent(txtpregunta7, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
    										.addGroup(gl_panel.createSequentialGroup()
    											.addComponent(txtpregunta7a, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
    											.addGap(7)
    											.addComponent(txtp7a, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    										.addGroup(gl_panel.createSequentialGroup()
    											.addComponent(txtpregunta7b, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
    											.addGap(7)
    											.addComponent(txtp7b, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    											.addComponent(lblayuda4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    											.addGroup(gl_panel.createSequentialGroup()
    												.addComponent(txtpregunta7c, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
    												.addGap(7)
    												.addComponent(txtp7c, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))))))
    							.addGap(5)))
    					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(281)
    									.addComponent(txtp4expo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(178)
    									.addComponent(txtp4base, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(257)
    									.addComponent(txt5expo, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
    								.addComponent(txtpregunta4, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtpregunta5, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta5a, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addComponent(txtp5a, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addComponent(txtpregunta5b, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(26)
    									.addComponent(txtp5b, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta5c, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addComponent(txtp5c, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta5d, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addComponent(txtp5dbase, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
    									.addGap(10)
    									.addComponent(txt6expo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addComponent(txtp5dexpo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
    									.addGap(59)
    									.addComponent(lblayuda5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
    							.addGap(24))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addComponent(lblayuda2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(86))))))
    );
    gl_panel.setVerticalGroup(
    	gl_panel.createParallelGroup(Alignment.LEADING)
    		.addGroup(gl_panel.createSequentialGroup()
    			.addContainerGap()
    			.addComponent(lblNivelMedio, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
    			.addPreferredGap(ComponentPlacement.UNRELATED)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(txtpregunta1a, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    					.addGap(59)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    							.addComponent(txtp1a4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    							.addComponent(txtp1a3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    							.addComponent(txtp1a2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    							.addComponent(txtp1a1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    						.addComponent(lblayuda1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(txtpregunta2a, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp2aexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp2abase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txt2expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtpregunta2b, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtp2b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtpregunta2c, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp2cbase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txt4expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp2cexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(txtpregunta2d, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtp2dbase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txt3expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp2dexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    					.addGap(60)
    					.addComponent(lblayuda2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addComponent(txtpregunta3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(txtpregunta3a, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    						.addComponent(txtp3a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addComponent(txtpregunta3b, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(18)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(88)
    									.addComponent(txtp4expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(88)
    									.addComponent(txtp4base, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    								.addGroup(gl_panel.createSequentialGroup()
    									.addGap(88)
    									.addComponent(txt5expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    								.addComponent(txtpregunta4, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
    							.addGap(7)
    							.addComponent(txtpregunta5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(11)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta5a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtp5a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(7)
    							.addComponent(txtpregunta5b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(7)
    							.addComponent(txtp5b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    							.addGap(7)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta5c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtp5c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(7)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta5d, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtp5dbase, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txt6expo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    									.addComponent(txtp5dexpo, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    									.addComponent(lblayuda5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    								.addComponent(txtp3b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(lblayuda3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(38)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta6, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
    								.addGroup(gl_panel.createSequentialGroup()
    									.addComponent(txtpregunta7, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    									.addGap(7)
    									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    										.addComponent(txtpregunta7a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    										.addComponent(txtp7a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    									.addGap(7)
    									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    										.addComponent(txtpregunta7b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    										.addComponent(txtp7b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    									.addGap(7)
    									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    										.addComponent(txtpregunta7c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    										.addComponent(txtp7c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))))
    							.addGap(4)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta6a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtp6a, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(7)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta6b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtp6b, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(7)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta6c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtp6c, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(7)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta6d, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addComponent(txtp6d, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
    							.addGap(7)
    							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    								.addComponent(txtpregunta6e, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
    									.addComponent(txtp6e, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
    									.addComponent(lblayuda4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))))))
    			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    				.addGroup(gl_panel.createSequentialGroup()
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(lblimgmat6, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
    						.addGroup(gl_panel.createSequentialGroup()
    							.addGap(51)
    							.addComponent(lblimgluisa, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))))
    				.addGroup(gl_panel.createSequentialGroup()
    					.addGap(42)
    					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
    						.addComponent(btnpararmusica, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btncronometro, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btnenviarrespuestas, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    						.addComponent(btnrespuestas, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
    			.addGap(60))
    );
    gl_panel.setAutoCreateGaps(true);
    gl_panel.setAutoCreateContainerGaps(true);
    panel.setLayout(gl_panel);
    
    scrollpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    getContentPane().add(scrollpane, BorderLayout.EAST);
  }
}