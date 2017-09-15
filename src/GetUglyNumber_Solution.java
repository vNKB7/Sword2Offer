public class GetUglyNumber_Solution {
	public int GetUglyNumber_Solution(int index) {
		if(index < 1)
			return 0;
		
		int[] ugly = new int[index];
		ugly[0] = 1;
		int c2 = 0;
		int c3 = 0;
		int c5 = 0;

		for (int i = 1; i < index; i++) {
			ugly[i] = Math.min(ugly[c2] * 2,
					Math.min(ugly[c3] * 3, ugly[c5] * 5));
			if (ugly[i] == ugly[c2] * 2) {
				c2++;
			}
			if (ugly[i] == ugly[c3] * 3) {
				c3++;
			}
			if (ugly[i] == ugly[c5] * 5) {
				c5++;
			}
		}

		return ugly[index - 1];
	}

	public static void main(String[] args) {
		System.out.println(new GetUglyNumber_Solution()
				.GetUglyNumber_Solution(3));
	}

}
