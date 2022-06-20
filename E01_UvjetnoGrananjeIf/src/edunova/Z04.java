package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		// za unesena 3 cijela broja program ispisuje najveæi

		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));
		int treciBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));

		if ((prviBroj > drugiBroj) && (prviBroj > treciBroj)) {
			System.out.println(prviBroj);
		} else if ((drugiBroj > prviBroj) && (drugiBroj > treciBroj)) {
			System.out.println(drugiBroj);
		} else {
			System.out.println(treciBroj);
		}

	}

}
