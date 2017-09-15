import java.util.Arrays;
import java.util.Comparator;

public class PrintMinNumber {
	
	// java 8
//	public String PrintMinNumber(int[] numbers) {
//		if (numbers == null || numbers.length == 0)
//			return "";
//
//		String[] str = new String[numbers.length];
//		for (int i = 0; i < numbers.length; i++) {
//			str[i] = numbers[i] + "";
//		}
//
//		Arrays.sort(str, (o1, o2) -> {
//			String str1 = o1 + o2;
//			String str2 = o2 + o1;
//			return str1.compareTo(str2);
//		});
//
//		return String.join("",str);
//	}
	
	
	// java 7
	public String PrintMinNumber(int[] numbers) {
		if (numbers == null || numbers.length == 0)
			return "";

		String[] str = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			str[i] = numbers[i] + "";
		}

		Arrays.sort(str, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				String str1 = o1 + o2;
				String str2 = o2 + o1;
				return str1.compareTo(str2);
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String s : str){
			sb.append(s);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new PrintMinNumber().PrintMinNumber(new int[]{1,33,445,2321,22}));
	}

}
