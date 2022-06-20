package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		// za unesena 2 cijela broj program ispisuje najveæi

		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));

		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi cijeli broj"));

		if (prviBroj > drugiBroj) {
			System.out.println(prviBroj);
		} else {
			System.out.println(drugiBroj);
		}

	}

}
