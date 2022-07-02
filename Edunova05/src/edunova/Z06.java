package edunova;

public class Z06 {
	// Za dani jednodimenzionalni niz cijelih brojeva
	// program ispisuje najveæi

	public static void main(String[] args) {

		int []niz = {5,5,8,6,-6,8,-1,0,9,0};
		//9
		
		int najveci=Integer.MIN_VALUE;
		
		for (int i:niz) {
			if(i>najveci) {
				najveci=i;
			}
			
		}System.out.println(najveci);

	}

}
