package edunova;

public class E03MathKlasa {

	public static void main(String[] args) {

		// System.out.println(Math.random());

		int i = 0;
		while (true) {
			i = (int) (Math.random() * 100);

			if (i >= 1 && i <= 10) {
				System.out.println(i);
				break;
			}

		}

	}

}
