package Interfaz;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {


	private static final long serialVersionUID = 1L;
	Icon ico=new ImageIcon(getClass().getResource("/imagenes/usuario.png"));
	Icon ico1=new ImageIcon(getClass().getResource("/imagenes/clave.png"));
	Icon check=new ImageIcon(getClass().getResource("/imagenes/check1.png"));
	Icon fail=new ImageIcon(getClass().getResource("/imagenes/cerrar.png"));
	Icon logo=new ImageIcon(getClass().getResource("/imagenes/2.jpg"));
	Icon version=new ImageIcon(getClass().getResource("/imagenes/version.png"));
	static boolean Basico=false, Medio=false, Dificil=false;
	static boolean MedioMod=false, FacilMod=false;
	
	public static void main(String[] args) {
					Principal pp = new Principal();
					pp.setVisible(true);
					pp.setLocationRelativeTo(null);
	}

	 private void alcerrar() {
		 String botones[]= {"Aceptar","Cancelar"};
		  int eleccion =JOptionPane.showOptionDialog(null, "¿Deseas cerrar el programa?", "Exit", 0, JOptionPane.INFORMATION_MESSAGE,fail,botones,"");
		  if(eleccion==JOptionPane.YES_OPTION) {
	    		JOptionPane.showMessageDialog(null, "Gracias por usar Mat6º \n Vuelve pronto.", "Exit",
	             		  JOptionPane.DEFAULT_OPTION,logo);
			  System.exit(0);
			  }}
	 
	 private void version_de_nivel_basico(){
    	 String botones[]= {"PREDETERMINADO","ULTIMA VERSIÓN"};
		  int eleccion =JOptionPane.showOptionDialog(null, "¿Que versión del nivel desea abrir?.", "Versión", 0, JOptionPane.INFORMATION_MESSAGE,version,botones,"");		
    	 //NIVEL BASICO
		  if(eleccion==JOptionPane.YES_OPTION) {
			  Basico=true;
			  FacilMod=false;
				  Nivel_Basico basico=new Nivel_Basico();
				  basico.setVisible(true);
				  
			  }
		  		if(eleccion==JOptionPane.NO_OPTION) {
				  FacilMod=true;
				  Basico=false;
					Nivel_Basico FM=new Nivel_Basico();
					FM.setVisible(true);
	               		  
			  }
		  }
	 
	 private void version_de_nivel_medio(){
    	 String botones[]= {"PREDETERMINADO","ULTIMA VERSIÓN"};
		  int eleccion =JOptionPane.showOptionDialog(null, "¿Que versión del nivel desea abrir?.", "Versión", 0, JOptionPane.INFORMATION_MESSAGE,version,botones,"");		
    	 //NIVEL MEDIO
		  if(eleccion==JOptionPane.YES_OPTION) {
			  Medio=true;
			  MedioMod=false;
			  Nivel_Medio medio=new Nivel_Medio();
				  medio.setVisible(true);
			  } 
		   if(eleccion==JOptionPane.NO_OPTION) {
				  MedioMod=true;
				  Medio=false;
				 // MedioM MM=new MedioM();
				   //MM.setVisible(true);	
				   
				   
					
			  }
		  }
	 
	 private void version_de_nivel_avanzado(){
    	 String botones[]= {"PREDETERMINADO","ULTIMA VERSIÓN"};
		  int eleccion =JOptionPane.showOptionDialog(null, "¿Que versión del nivel desea abrir?.", "Versión", 0, JOptionPane.INFORMATION_MESSAGE,version,botones,"");		
    	 //NIVEL DIFICIL
		  if(eleccion==JOptionPane.YES_OPTION) {
			  
			  Nivel_Dificil original3=new Nivel_Dificil();
				  original3.setVisible(true);
			  }else if(eleccion==JOptionPane.NO_OPTION) {
				  
					//DificilM2 m2=new DificilM2();
					//m2.setVisible(true);
			  }}
		 
	public Principal() {
		setType(Type.POPUP);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				alcerrar();
			}
		});
        
		setUndecorated(true);
		setSize(1280,650);
		setTitle("MAT6\u00BA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/2.jpg")));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1269, 650);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(0, 2, 10, 2));
		menuBar.setFont(new Font("Sitka Banner", Font.PLAIN, 20));
		menuBar.setForeground(Color.WHITE);
		menuBar.setToolTipText("Barra de menú");
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setSelectedIcon(new ImageIcon(Principal.class.getResource("/imagenes/archivo.png")));
		mnArchivo.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/f1.png")));
		menuBar.add(mnArchivo);
		
		JMenuItem mntmInstrucciones = new JMenuItem("Instrucciones");
		mntmInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucciones ins=new Instrucciones();
				ins.setVisible(true);
			}
		});
		mntmInstrucciones.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ins.png")));
		mnArchivo.add(mntmInstrucciones);
		
		JMenuItem mntmConfiguraciones = new JMenuItem("Configuraciones");
		mntmConfiguraciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=JOptionPane.showInputDialog(null, "USUARIO", "Sesión", JOptionPane.INFORMATION_MESSAGE,ico,null,"").toString(),
		                   pass=JOptionPane.showInputDialog(null, "CONTRASEÑA", "Sesión", JOptionPane.INFORMATION_MESSAGE,ico1,null,"").toString();
					if(user.equals("SYSLAC") && pass.equals("JCD")){
						JOptionPane.showMessageDialog(null,"Login OK","Correcto",JOptionPane.INFORMATION_MESSAGE,check);
					      //Configuraciones cf=new Configuraciones();
					      //cf.setVisible(true);
					}else{
					    JOptionPane.showMessageDialog(null,"Login fail","Error",JOptionPane.INFORMATION_MESSAGE,fail);
					}
			}
		});
		mntmConfiguraciones.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/config1.png")));
		mnArchivo.add(mntmConfiguraciones);
		
		JMenu mnNiveles = new JMenu("Niveles");
		mnNiveles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnNiveles.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/level.png")));
		mnArchivo.add(mnNiveles);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Básico");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				version_de_nivel_basico();
				
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/mision.png")));
		mnNiveles.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Medio");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				version_de_nivel_medio();
				
					
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/medio.png")));
		mnNiveles.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Avanzado");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				version_de_nivel_avanzado();
				  Dificil = true;
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/dificil.png")));
		mnNiveles.add(mntmNewMenuItem_4);
		
		JMenu mnInformacion = new JMenu("Información");
		mnInformacion.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/info.png")));
		menuBar.add(mnInformacion);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nosotros");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Informacion qss=new Informacion();
				//qss.setVisible(true);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/nosotros.png")));
		mnInformacion.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ev3");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ev3 ev3=new Ev3();
				//ev3.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ev.png")));
		mnInformacion.add(mntmNewMenuItem_1);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/ayuda.png")));
		menuBar.add(mnAyuda);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Manual de usuario");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Desktop.isDesktopSupported()){
					try {
						File manual=new File(new File("").getAbsolutePath() + "/src/Documentos/m.pdf");
						Desktop.getDesktop().open(manual);
					}catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "Error al abrir el manual de usuario, revisa que tengas instalado word.");
					}}}
		});
		mntmNewMenuItem_5.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/guia.png")));
		mnAyuda.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Guia Mat6\u00BA");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Desktop.isDesktopSupported()){
					try {
						File guia=new File(new File("").getAbsolutePath() + "/src/Documentos/g.pdf");
						Desktop.getDesktop().open(guia);
					}catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "Error al abrir guía, revisa que tengas instalado word.");
					
			}}}
		});
		mntmNewMenuItem_6.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/guia.png")));
		mnAyuda.add(mntmNewMenuItem_6);
		
		JMenu mnCreditos = new JMenu("Créditos");
		mnCreditos.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/creditos.png")));
		menuBar.add(mnCreditos);
		
		JMenuItem submenucreditos = new JMenuItem("Derechos de autor");
		submenucreditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Desktop.isDesktopSupported()){
					try {
						File guia=new File(new File("").getAbsolutePath() + "/src/Documentos/c.pdf");
						Desktop.getDesktop().open(guia);
					}catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "Error al abrir el documento, revisa que tengas instalado word.");
					
			}}}
		});
		submenucreditos.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/guia.png")));
		mnCreditos.add(submenucreditos);
		getContentPane().setLayout(null);
		
		JLabel cerrar = new JLabel("");
		cerrar.setToolTipText("Cerrar programa");
		cerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				alcerrar();
			}
		});
		cerrar.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/cerrar.png")));
		cerrar.setBounds(1219, 11, 32, 32);
		getContentPane().add(cerrar);
		
		JLabel minimizar = new JLabel("");
		minimizar.setToolTipText("Minimizar ventana");
		minimizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(ICONIFIED);
			}
		});
		minimizar.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/mini.png")));
		minimizar.setBounds(1177, 11, 32, 32);
		getContentPane().add(minimizar);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/fondo.JPG")));
		fondo.setBounds(0, 0, 1269, 616);
		getContentPane().add(fondo);
	}
}
