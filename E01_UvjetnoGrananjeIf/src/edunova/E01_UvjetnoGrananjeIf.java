package edunova;

public class E01_UvjetnoGrananjeIf {

	public static void main(String[] args) {
		// obavezni dio if naredbe

		boolean uvjet = true;
		// if radi s boolean tipom podataka

		if (uvjet) {
			System.out.println("1");
		}

		int i = 7;

		if (i > 0) {

			System.out.println("2");
		}

		uvjet = i > 0;
		if (uvjet) {
			System.out.println("3");
		}

		// provjeravanje vrijednosti

		if (i == 7) {
			System.out.println("4");
		}

		// razlièito

		if (i != 0) {
			System.out.println("5");
		}

		// logièko and
		// & provjerava UVIJEK oba uvjeta
		// && u sluèaju da prvi uvjet nije zadovoljen drugi se ne provjerava
		
		
		i = 2;
		
		if (i>0 & i<10) {
			System.out.println("6");
		}
		
		if (i>0 && i<10) {
			System.out.println("7");
		}
		
		
		// logièko or
		// | provjerava UVIJEK oba uvjeta
		// || u sluèaju da je prvi uvjet zadovoljen drugi se ne provjerava
		
		
		if (i == 0 | i ==7) {
			System.out.println("8");
		}
		
		if (!(i==0 || i==7)) {
			System.out.println("9");
		}
		
		// neobavezni djelovi if naredbe
		
		i=1;
		
		if (i==0) {
			System.out.println("10");
		}else {
			System.out.println("11");
		}
		
		
		// ugnježðivanje
		
		int j=9;
		
		if (i==1) {
			if (j==9) {
				System.out.println("12");
			}else {
				System.out.println("13");
			}
		}
		
		i=1;
		j=2;
		
		if(i==1 && j==2) {
			System.out.println("14");
		}else if (i==2 && j==1) {
			System.out.println("15");
		}else {
			System.out.println("16");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
