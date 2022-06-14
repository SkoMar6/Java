package edunova;
import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veæi od 10 
		// inaèe ispisuje Edunova

		
		
		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("prvi broj")
				);
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("drugi broj")
				);
		int zbroj= prviBroj+drugiBroj;
		
		if (zbroj>10) {
			System.out.println("Osijek");
		}else {
			System.out.println("Edunova");
		}
		
		
	}

}
