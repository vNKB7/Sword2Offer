import java.util.Arrays;

public class Print1ToMaxOfNDigits {

	public static void main(String[] args) {
		new Print1ToMaxOfNDigits().print1ToMaxOfNDigits(2);
	}

	public void print1ToMaxOfNDigits(int n) {
		char[] nums = new char[n];
		Arrays.fill(nums, '0');
		while (increaseOne(nums)) {
			print(nums);
		}
	}

	public boolean increaseOne(char[] nums) {
		int overflow = 1;
		for (int i = nums.length - 1; i >= 0 && overflow != 0; i--) {
			int add = (nums[i] - '0') + overflow;
			nums[i] = (char) ('0' + (add % 10));
			overflow = add / 10;
		}

		return overflow == 0;
	}
	
	public void print(char[] nums){
		boolean zero = true;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != '0'){
				zero = false;
				for(int j = i; j < nums.length; j++){
					System.out.print(nums[j]);
				}
				break;
			}
		}
		
		if(zero)
			System.out.print("0");
		
		System.out.println();
	}

}
