package Interfaz;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tiempo extends Thread{

	JLabel tiempo;
	Icon fin=new ImageIcon(getClass().getResource("/imagenes/iniciar.png"));
	
	public Tiempo(JLabel cronometro) {
		this.tiempo=cronometro;
	}
	public void run() {
		try {
			int x=0;
			while(Cronometro.inicio) {
				Thread.sleep(1000);
				ejetime(x);
				x++;
			}
		}catch (Exception e) {
			System.out.println("Exception de hilo" + e.getMessage());
		}
	}
	private void ejetime(int x) {
		System.out.println(x+"-"+Thread.currentThread().getName());
		Cronometro.s++;
		
		if(Cronometro.s>59) {
			Cronometro.s=0;
			Cronometro.m++;
			
		}
		String textS="", textM="";
		
		if(Cronometro.s<=59) {
			textS=" "+Cronometro.s;
			textM=" "+Cronometro.m;
		}if(Cronometro.m==2 && Cronometro.s==01) {
			JOptionPane.showMessageDialog(null, "Tiempo fuera. Gracias por participar", "Fin del tiempo",
	           		  JOptionPane.INFORMATION_MESSAGE,fin);
		    Cronometro.btnplay.setEnabled(true);
		    if(Principal.Dificil==true)
				Nivel_Dificil.desabilitarrespuestas();
				if(Principal.Medio==true)
				Nivel_Medio.desabilitarrespuestas();
				if(Principal.Basico==true)
				Nivel_Basico.desabilitarrespuestas();
				if(Principal.MedioMod==true)
				//MedioM.desabilitarrespuestas();
				if(Principal.FacilMod==true)
				//FacilM.desabilitarrespuestas();
				
		   	Cronometro.btniniciar.setEnabled(false);
		   	Cronometro.s=0;
			Cronometro.m=0;
			Cronometro.lbldado.setIcon(new ImageIcon(Cronometro.class.getResource("/imagenes/dadoazul.gif")));
			Cronometro.inicio=false;
			Cronometro.corriendo=false;
		}
			
		String cro=textM+":"+textS;

		tiempo.setText(cro);
	}
	}


