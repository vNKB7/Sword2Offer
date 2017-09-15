public class NumberOf1Between1AndN_Solution {

	public static void main(String[] args) {
		System.out.println(new NumberOf1Between1AndN_Solution().NumberOf1Between1AndN_Solution(100));
	}

	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		int b = 10;

		while (b <= n * 10) {
			count += n / b * (b / 10);
			int r = n % b;
			count += Math.min(Math.max(0, r - b / 10 + 1), b / 10);
			b *= 10;
		}
		
		return count;
	}
}
