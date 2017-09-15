import java.util.ArrayList;
import java.util.Collections;

public class FindContinuousSequence {

	public static void main(String[] args) {
		System.out.println(new FindContinuousSequence()
				.FindContinuousSequence(100));
	}

	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (sum < 3)
			return result;
		double max = Math.sqrt(2 * sum + 0.25) + 0.5;
		for (int i = 2; i < max; i++) {
			if ((2 * sum % i == 0) && ((2 * sum / i) - i + 1) % 2 == 0) {
				int a = ((2 * sum / i) - i + 1) / 2;
				ArrayList<Integer> sq = new ArrayList<Integer>();
				for (int j = 0; j < i; j++) {
					sq.add(j + a);
				}
				result.add(sq);
			}
		}

		Collections.reverse(result);
		return result;
	}
}
