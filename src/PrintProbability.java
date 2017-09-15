public class PrintProbability {

	public static void main(String[] args) {
		new PrintProbability().printProbability(50);
	}

	double[] factorial = new double[100];

	public void printProbability(int n) {
		factorial[0] = 1;
		for (int i = 1; i < n; i++) {
			factorial[i] = factorial[i - 1] * (i + 1);
		}

		double[] count = new double[6 * n + 1];
		int[] array = new int[n];
		backtrack(count, array, 0, 1, 0);
		double max = Math.pow(6, n);
		for (int i = n; i <= 6 * n; i++) {
			System.out.println(i + " : " + (count[i] / max));
		}
	}

	public void backtrack(double[] count, int[] array, int index, int start,
			int sum) {
		if (array.length == index) {
			double c = factorial[array.length - 1];
			int ct = 1;
			for (int i = 1; i < array.length; i++) {
				if (array[i] == array[i - 1]) {
					ct++;
				} else {
					c /= factorial[ct - 1];
					ct = 1;
				}
			}
			c /= factorial[ct - 1];
			count[sum] += c;
			return;
		}

		for (int i = start; i <= 6; i++) {
			array[index] = i;
			backtrack(count, array, index + 1, i, sum + i);
		}
	}
}
