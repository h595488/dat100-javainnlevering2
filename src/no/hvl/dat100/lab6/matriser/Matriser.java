package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {
			System.out.println();
			for (int x : rad) {
				System.out.print(x + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String str = "";
		for (int[] rad : matrise) {
			for (int x : rad) {
				str += x + " ";
				if (x % 3 == 0) {
					str += "\n";
				}

			}
		}
		return str;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int y = 0; y < matrise.length; y++)
			for (int x = 0; x < matrise[y].length; x++)
				nyMatrise[y][x] = matrise[y][x] * tall;
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
