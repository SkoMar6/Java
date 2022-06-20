package edunova;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {
		// program unosi 2 broja, ako su parni ispisuje njihov broj inaèe ispisuje njihovu razliku
		
		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
		
		int zbroj = prviBroj+drugiBroj;
		int razlika =prviBroj-drugiBroj;
		
		if (prviBroj%2==0 && drugiBroj%2==0) {
		System.out.println(zbroj);
		}else  {
			System.out.println(razlika);
		}

	}

}
