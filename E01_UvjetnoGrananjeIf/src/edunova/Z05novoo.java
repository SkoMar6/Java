package edunova;

import javax.swing.JOptionPane;

public class Z05novoo {

	public static void main(String[] args) {
		// program unosi broj izme�u 1 i 999 u slu�aju da je broj izvan tog raspona
		// ispisati gre�ku i prekinuti program
		// program ispisuje prvu znamenku upisanog broja

		int broj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj izme�u 1 i 999"));

		if (broj < 1 || broj > 999) {
			System.out.println("gre�ka");
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
