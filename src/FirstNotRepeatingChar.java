import java.util.Arrays;

public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static public char firstNotRepeatingChar(String str) {
		if (str == null || str.length() == 0) {
			return '\0';
		}

		char[] array = str.toCharArray();
		int[] index = new int[26];

		Arrays.fill(index, -1);

		char isChar = '字';

		return 'a';
	}

}
