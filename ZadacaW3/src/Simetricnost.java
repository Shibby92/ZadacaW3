public class Simetricnost {
	/**
	 * Ispituje simetricnost broja
	 * 
	 * @param br
	 *            broj koji se ispituje
	 * @return true/false o tome da li je broj simetrican ili ne
	 */
	public static boolean simetrican(int br) {
		int temp = br;
		int sim = 0;
		while (temp != 0) {
			sim = sim * 10 + temp % 10;
			temp = temp / 10;
		}
		if (sim == br)
			return true;
		return false;

	}

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		while (broj != 0) {
			if (simetrican(broj))
				System.out.println("Broj je simetrican");
			else
				System.out.println("Broj nije simetrican");
			broj = TextIO.getInt();
		}
	}

}
