package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		//Deklarirajte niz od 4 cijela broja, u niz u�itajte vrijednosti od korisnika
		// ispi�ite sumu svih upisanih vrijednosti
		
		int niz []= {
				Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi tre�i broj")),
				Integer.parseInt(JOptionPane.showInputDialog("Unesi �etvrti broj"))
		};
		
		int zbroj=0;
		
		zbroj = niz[0]+niz[1]+niz[2]+niz[3];
		System.out.println(zbroj);
		
		
		
		
	}

}