package edunova;
import javax.swing.JOptionPane;
public class Z02 {

	public static void main(String[] args) {
		// za upisani cijeli broj
		// program ispisuje da li je parni ili ne
		
	int broj= Integer.parseInt(
			JOptionPane.showInputDialog("unesi cijeli broj")
			);	
		
		
		if (broj%2==0) {
			System.out.println("parni broj");
		}else {
			System.out.println("neparni broj");
		}
		

	}

}
