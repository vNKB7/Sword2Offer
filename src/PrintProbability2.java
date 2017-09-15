public class PrintProbability2 {

	public static void main(String[] args) {
		new PrintProbability2().printProbability(11);
	}

	public void printProbability(int n) {
		int[][] p = new int[2][6 * n + 1];

		int c = 0;
		for (int i = 1; i <= 6; i++) {
			p[c][i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = i; j <= 6 * i; j++) {
				for (int k = 1; k <= 6; k++) {
					if (j - k > 0) {
						p[1 - c][j] += p[c][j - k];
					}
				}
			}
			c = 1 - c;
		}

		double max = Math.pow(6, n);

		for (int i = n; i <= 6 * n; i++) {
			System.out.println(i + " : " + p[c][i] / max);
		}

	}
}
