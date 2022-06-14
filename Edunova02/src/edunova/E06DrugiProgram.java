package edunova;

import javax.swing.JOptionPane;

public class E06DrugiProgram {
	
	// Za upisana dva cijela broja
	// program ispisuje njihov zbroj

	public static void main(String[] args) {
		
	int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("unesi prvi Broj")
	);
	
	int drugiBroj = Integer.parseInt(
			JOptionPane.showInputDialog("unesi drugi broj")
	);
	
	int rezultat = prviBroj + drugiBroj;
	System.out.println(rezultat);
		

	}

}
