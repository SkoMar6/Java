package edunova;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Z02 {
	
	// Program od korisnika unosi cijele brojeve
	//dok korisnik ne unese broj -1
	//program ispisuje sumu svih unesenih brojeva
	//koriste�i while 
	

	public static void main(String[] args) {
	
		
		int i=0, suma=0;
		while (i!=-1) {
			i= Integer.parseInt(JOptionPane.showInputDialog("broj"));
					suma+=i;
		}
		System.out.println(suma+1);
		
		

	}

}
