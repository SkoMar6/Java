package edunova;

import java.util.Arrays;

public class E01JednodimenzionalniNizovi {

	public static void main(String[] args) {
		// sinonimi
		// Array na eng.
		// nizovi ili polja na hr.
		// mi æemo koristiti nizovi
		
		
		int t1=2;
		int t2=-1;
		//...
		int t12=6;
		
		//ovo nije dobar naèin za pohranu više vrijednosti istog tipa
		
		//deklaracija niza
		int [] temp;
		
		
		//niz je je objekt pa ga je potrebno konstruirati
		
		
		temp = new int [12];
		
		// nizovi poèinju s indexom 0
		temp [0]=2;
		temp [1]=-1;
		//..
		//zadnji element temp[temp.lenght-1]
		
		temp[temp.length-1]=6;
		
		System.out.println(Arrays.toString(temp));		
		
		
		//skraæena sintaksa
		int boje[]=new int [4];
		
		
		// na 2. mjesto u nizu staviti broj 7
		boje [1]=7;
		
		//ispisati samo vrijednost drugog mjesta u nizu
		System.out.println(boje[1]);
		
		
		//još kraæa sintaksa
		
		int[] vrijednosti= {2,3,4,2,3,4,6,7,8};
		
		//ispisati prvi i zadnji element niza 
		//jedan pored drugoga odvojeno zarezom
		
		System.out.println(vrijednosti[0]+ ","+ vrijednosti[vrijednosti.length-1]);
		
		// ili
		
		System.out.println(vrijednosti[0]);
		System.out.println(",");
		System.out.println(vrijednosti[vrijednosti.length-1]);
		System.out.println();
		
		// nizovi mogu biti bilo koji tip podatka
		
		double [] brojevi = new double [5];
		
	}

}
