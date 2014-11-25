public class TestiranjeStringa {
	/**
	 * Ispituje da li ima istih znakova u unesenom stringu
	 * 
	 * @param str
	 *            String koji se proslijedjuje i ispituje
	 * @return true/false na osnovu ispitane tvrdnje
	 */
	public static boolean istiZnak(String str) {
		boolean isti = false;
		for (int i = 0; i < str.length(); i++) {
			int brojac = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					brojac++;
				}
			}
			if (brojac > 1) {
				isti = true;
			}
		}
		return isti;
	}

	public static void main(String[] args) {
		String str = TextIO.getln();
		if (istiZnak(str))
			System.out.println("U stringu ima istih znakova!");
		else
			System.out.println("U stringu nema istih znakova");

	}

}
