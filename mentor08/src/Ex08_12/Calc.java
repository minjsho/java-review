package Ex08_12;

public class Calc {
	void sum(int[] nums) {
		int result =0;
		for(int i = 0; i<nums.length; i++) {
			result += nums[i];
		}
		System.out.println("숫자들의 합 : " + result);
		
//		int ar = 0;
//		for(int result : nums) {
//			System.out.println(result);
//			ar += result;
//		}
//		System.out.println("숫자들의 합 : " + ar);
	}

}
