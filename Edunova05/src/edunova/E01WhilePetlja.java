package edunova;

public class E01WhilePetlja {

	public static void main(String[] args) {
		// while radi s boolean tipom podatka
		// beskonaèna petlja
		
		while (true) {
			break;
		}
		
		// ispisati brojevi od 1 do 10
		
		int i=0;
		while (i<10) {
			if (i+1==2) {
				i++;
				continue;
			}
			System.out.println(++i);
		}

	}

}
