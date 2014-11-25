public class Sa5Ili7Ili11 {

	/**
	 * Funkcija ispituje da li je dati broj djeljiv sa 5,7 ili 11
	 * 
	 * @param broj
	 *            Unos koji se provjerava
	 * @param djelilac
	 *            Broj sa kojim se dijeli
	 * @return true/false zavisno od toga da li je taj broj djeljiv sa djeliocem
	 */

	public static boolean djeljivost(int broj, int djelilac) {
		boolean djeljiv = false;
		if (broj % djelilac == 0) {
			djeljiv = true;
		}
		return djeljiv;
	}

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		for (int i = broj; i > 0; i--) {
			if ((djeljivost(i, 5) == true) || (djeljivost(i, 7) == true)
					|| (djeljivost(i, 11) == true)) {
				System.out.println(i);
			}
		}
	}
}