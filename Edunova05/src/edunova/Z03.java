package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Z03 {
	
	
	// korisnik unosi dimenzije matrice (x i y)
			//program puni matricu sluèajnim vrijednostima
			//izmeðu 5 i 9
			// program ispisuje izgraðenu matricu

	public static void main(String[] args) {
		
		int [][]matrica = new int [Integer.parseInt(JOptionPane.showInputDialog("x"))]
				
				[Integer.parseInt(JOptionPane.showInputDialog("y"))];
		
		for (int i=0;i<matrica.length;i++) {
			for (int j=0;j<matrica[i].length;j++) {
				matrica [i][j]= (int) ((Math.random() * (9 - 5)) + 5);
			}
				
		}
				
		for (int i=0;i<matrica.length;i++) {
			System.out.println(Arrays.toString(matrica[i]));
		}

	}

}
