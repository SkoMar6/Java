package edunova;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		// program prima 2 cijela broja
		// ispisuje sve prim brojeve izmeðu da primljena broja

		int b1 = Integer.parseInt(JOptionPane.showInputDialog("broj 1"));
		int b2 = Integer.parseInt(JOptionPane.showInputDialog("broj 2"));

		int min = b1 < b2 ? b1 : b2;
		int max = b1 > b2 ? b1 : b2;
		boolean prim;
		for (int i = min; i <= max; i++) {
			prim = true;
			for (int b = 2; b < i; b++) {
				if (i % b == 0) {
					prim = false;
					break;
				}

			}
			if (prim) {
				System.out.println(i);
			}
		}
	}

}
