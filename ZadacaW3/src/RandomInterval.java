public class RandomInterval {
	/**
	 * Funkcija kreira nasumican broj iz zadanog intervala
	 * 
	 * @param pocetak
	 *            Ovaj broj ukazuja na pocetak intervala
	 * @param kraj
	 *            Ovaj broj ukazuje na kraj intervala
	 * @return Vraca nasumican broj u datom intervalu
	 */
	public static int random(int pocetak, int kraj) {
		int nasumican = (int) (pocetak + (Math.random() * (kraj - pocetak + 1)));
		return nasumican;
	}

	/**
	 * Funkcija ispituje neparnost broja
	 * 
	 * @param broj
	 *            zeljeni broj koji se ispituje
	 * @return true/false u zavisnosti od parnosti broja
	 */
	public static boolean neparan(int broj) {
		if (broj % 2 != 0)
			return true;
		return false;

	}

	public static void main(String[] args) {
		int pocetak = TextIO.getInt();
		int kraj = TextIO.getInt();
		int brojac = 0;
		while (brojac < 5) {
			int nasumican = random(pocetak, kraj);
			if (neparan(nasumican))
				System.out.printf("Generisali smo broj %d, neparan je\n",
						nasumican);
			else
				System.out.printf("Generisali smo broj %d, paran je\n",
						nasumican);
			brojac++;
		}
	}

}
