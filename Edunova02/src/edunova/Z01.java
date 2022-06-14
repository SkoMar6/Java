package edunova;
import javax.swing.JOptionPane;
public class Z01 {

	public static void main(String[] args) {
		// Napisati program koji unosi
		// tri decimalna broja
		// i ispisuje umnožak prvog i treæeg
		// umanjeno za drugi broj
		
		double  prviBroj = Double.parseDouble(
				JOptionPane.showInputDialog("unesi prvi broj")
		);
		
		double drugiBroj = Double.parseDouble(
				JOptionPane.showInputDialog("unesi drugi broj")
		);
		
		double treciBroj = Double.parseDouble(
				JOptionPane.showInputDialog("unesi treæi broj")
		);
		
		double produkt = prviBroj*treciBroj;
		double rezultat = produkt - drugiBroj;
		System.out.println(rezultat);
	}
	
	

}
