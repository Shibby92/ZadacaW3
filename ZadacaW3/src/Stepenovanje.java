public class Stepenovanje {
	/**
	 * Funkcija simulira racunanje stepena broja
	 * 
	 * @param baza
	 *            Broj koji se koristi za bazu stepenovanja
	 * @param exponent
	 *            Broj koji se koristi za eksponenet stepenovanja
	 * @return Stepenovani broj
	 */
	public static int pow(int baza, int exponent) {
		int brojac = 0;
		int temp = 1;
		while (brojac < exponent) {
			temp *= baza;
			brojac++;
		}
		return temp;
	}

	public static void main(String[] args) {
		int broj1 = TextIO.getInt();
		int broj2 = TextIO.getInt();
		System.out.println(pow(broj1, broj2));
	}

}
