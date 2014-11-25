public class TrocifreniDjeljivi {
	public static void djeljiviSaTro(int broj) {
		for (int i = 100; i <= 999; i++) {
			if (i % broj == 0)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		while (broj <= 0) {
			System.out.println("Uneseni broj nije prirodan, unesite ponovo: ");
			broj = TextIO.getInt();
		}
		djeljiviSaTro(broj);
	}

}
