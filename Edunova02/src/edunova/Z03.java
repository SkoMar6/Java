package edunova;
import javax.swing.JOptionPane;

//Za unesena dva cijela broja
	// ispišite rezutat djeljenja
public class Z03 {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("unesi prvi broj")
				);
		int j = Integer.parseInt(
				JOptionPane.showInputDialog("unesi drugi broj")
				);
		
		double rezultat = (double) i/j;
		System.out.println(rezultat);

	}

}
