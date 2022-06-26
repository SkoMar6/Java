package edunova;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class E04ForPetlja {

	public static void main(String[] args) {
		// Petlje nam slu�e za ponavljanje koda
		for(int i=0;i<10;i++) {
			System.out.println("Osijek");
		}
		
		
		//for petlja obavezno ima varijablu koja mjenja vrijednost
		
		for (int i=0;i<10;i++) {
			System.out.println(i+1);
		}
		
		//primjeri
		
		for (int i=10;i>0;i=i-1) {
			System.out.println(i);
		}
		
		for (int i=0;i<100;i=i+10) {
			System.out.println(i);
		}
		
		
		//koristiti �emo i++ za inkrement
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		int [] niz = {2,3,4,5,6,7,2,3,6};
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
		String ime= "Edunova";
		for (int i=0;i<ime.length();i++) {
			System.out.println(ime.charAt(i));
		}
		
		
		
		int d=10;
		//ugnje��ivanje petlji
		int [][] tablica =new int [d][d];
		for(int i=0;i<d;i++) {
			for (int j=0;j<d;j++) {
				tablica [i][j] = (i+1)*(j+1);
			}
		}
		
		for (int i=0;i<d;i++) {
			System.out.println(Arrays.toString(tablica[i]));
		}
		
		
		// for petlja se mo�e presko�iti
		
		for (int i=0;i<10;i++) {
			if (i==3 || i==5) {
				continue; // short circuting
			}
			System.out.println(i);
		}
		
		
		for (int i=0;i<10;i++) {
			if (i!=3 && i!=5) {
				System.out.println(i);
			}
		}
		
		// nasilno prekidanje petlje
		for (int i=0;i<10;i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
		
		int brojac =0;
		int b=25683;
		boolean prim=true;
		for (int i=2;i<b;i++) {
			brojac ++;
			if(b%i==0) {
				// sada ve� na broju 2 znam da ne moram tra�iti dalje
				prim=false;
				break;
			}
		}
		
		if (prim) {
			System.out.println(b+ "je prim," + brojac);
		}else {
			System.out.println(b+ "nije prim," + brojac);
		}
		
		
		
		vanjska:
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (j==1) {
					break;
				}
			}
		}
		
		
		System.out.println((100+1)*50);
		int suma=0;
		for (int i=1;i<=100;i++) {
			suma+=1;
		}
		System.out.println(suma);
	}

}
