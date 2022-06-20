package edunova;

import javax.swing.JOptionPane;

public class Z05novoo {

	public static void main(String[] args) {
		// program unosi broj izmeðu 1 i 999 u sluèaju da je broj izvan tog raspona
		// ispisati grešku i prekinuti program
		// program ispisuje prvu znamenku upisanog broja

		int broj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj izmeðu 1 i 999"));

		if (broj < 1 || broj > 999) {
			System.out.println("greška");
		}

		if (broj < 10) {
			System.out.println(broj);
		} else if (broj > 10 && broj < 100) {
			System.out.println(broj / 10);
		} else {
			System.out.println(broj / 100);
		}

	}

}
