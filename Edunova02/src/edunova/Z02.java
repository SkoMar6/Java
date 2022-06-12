package edunova;

import javax.swing.JOptionPane;

		//Za uneseni dvoznamenkasti broj
		// ispišite jediniènu vrijednost
public class Z02 {

	public static void main(String[] args) {
		int i = Integer.parseInt(JOptionPane.showInputDialog("unesi dvoznamenkasti broj")
	);
		
	i%=10;
	System.out.println(i);
	
	int j = Integer.parseInt(JOptionPane.showInputDialog("unesi dvoznamenkasti broj"));
		j/=10;
		System.out.println(j);
		
	}

}
