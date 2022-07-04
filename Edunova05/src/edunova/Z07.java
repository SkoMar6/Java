package edunova;

import javax.swing.JOptionPane;

public class Z07 {

	// Program osigurava unos niza znakova (String)
	// koji ima minimalno 3 znaka ako nema ispisuje korisniku
	// poruku : minimalno 3 znaka

	public static void main(String[] args) {
		String s;
		while (true) {
			 s = JOptionPane.showInputDialog("unos");
			if (s.length() < 3) {
				JOptionPane.showMessageDialog(null, "Minimalno 3 znaka");
				continue;
			}
			break;
		}
		System.out.println(s);

	}

}
