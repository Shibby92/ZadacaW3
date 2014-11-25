public class ParneNeparneCifre {
	/**
	 * Funkcija pravi 2 nova broja odparnih/neparnih cifri unesenog
	 * 
	 * @param broj
	 *            Uneseni broj od kojeg se prave nova dva
	 * @param paran
	 *            Da li korisnik zeli broj sastavljen od parnih/neparnih cifri,
	 *            zavisi od ovog parametra
	 * @return Vraca broj od parnih/neparnih cifri ovisno od "paran" parametra
	 */
	public static int pnCifre(int broj, boolean paran) {
		int temp = broj;
		int parni = 0;
		int neparni = 0;
		int brojacp = 0;
		int brojacn = 0;
		for (int i = String.valueOf(broj).length(); i > 0; i--) {
			if ((temp % 10) % 2 == 0) {
				parni += (temp % 10) * Math.pow(10, brojacp);
				brojacp++;
			} else {
				neparni += (temp % 10) * Math.pow(10, brojacn);
				brojacn++;
			}
			temp = temp / 10;
		}
		if (paran == true) {
			return parni;
		} else {
			return neparni;
		}
	}

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		while (broj != 0) {
			System.out.println(pnCifre(broj, true));
			System.out.println(pnCifre(broj, false));
			broj = TextIO.getInt();
		}
	}

}
