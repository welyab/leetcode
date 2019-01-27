// https://leetcode.com/problems/missing-number/
public class Missing_Number {
	public int missingNumber(int[] nums) {
		int a = nums.length * (nums.length + 1) / 2;
		int b = 0;
		for (int n : nums) {
			b += n;
		}
		return a - b;
	}
}
