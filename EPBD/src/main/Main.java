package main;

import javax.swing.UIManager;

import view.TelaPrincipal;

public class Main {
	public static void main(String[] args) {
		try { 
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
	    } 
		catch(Exception ex){
			ex.printStackTrace();
	    }
		
		TelaPrincipal tela = new TelaPrincipal();
		tela.setVisible(true);
		
		
		System.out.println("salve marin");
	}
}
