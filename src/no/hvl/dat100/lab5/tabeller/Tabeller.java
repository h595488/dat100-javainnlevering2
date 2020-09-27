package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println("SkrivUt tabell");
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i == tabell.length - 1) {
				streng += tabell[i];
			} else {
				streng += (tabell[i] + ",");
			}
		}
		streng += "]";
		return streng;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		// For løkke
		
		// for (int i = 0; i < tabell.length; i++) {
		// int total = tabell[i];
		// sum += total;
		// }
		// System.out.println("Sum : " + sum);
		// return sum;
		// }
		// Utvidet for løkke
		
		// for (int num : tabell) {
		// sum = sum+num;
		// }
		// System.out.println("Sum av tabell: " + sum);
		// return sum;
		// }
		int i = 0;
		while (i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		System.out.println("Sum av tabell: " + sum);
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int n : tabell) {
			if (n == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// finne hvilken posisjon et tall er i tabellen, returnere -1 hvis det ikke er i
		// tabellen.
		for (int n = 0; n < tabell.length; n++) {
			if (tabell[n] == tall) {
				return n;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] ny = new int[tabell.length];
		int j = tabell.length;
		for (int i = 0; i < tabell.length; i++) {
			ny[j - 1] = tabell[i];
			j = j - 1;

		}
		return ny;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammen = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			sammen[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			sammen[tabell1.length + i] = tabell2[i];
		}
		return sammen;
	}
}
