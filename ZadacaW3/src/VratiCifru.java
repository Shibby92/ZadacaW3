public class VratiCifru {
	/**
	 * Funkcija vraca odredeni redni broj cifre unesenog broja
	 * 
	 * @param broj
	 *            broj koji se obradjuje
	 * @param redniBroj
	 *            redni broj cifre koju trazimo sa desna na lijevo
	 * @return korisnikovu zeljenu cifru
	 */
	public static int vratiCifru(int broj, int redniBroj) {
		int brojac = 0;
		int trazeniBroj = 0;
		while (brojac != redniBroj) {
			trazeniBroj = broj % 10;
			broj /= 10;
			brojac++;
		}
		return trazeniBroj;
	}

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		int redniBroj = TextIO.getInt();
		System.out.println(vratiCifru(broj, redniBroj));

	}

}
