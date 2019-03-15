// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
public class Maximum_XOR_of_Two_Numbers_in_an_Array {
	public int findMaximumXOR(int[] nums) {
		long max = Long.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				long xor = (long) nums[i] ^ (long) nums[j];
				if (max < xor) {
					max = xor;
				}
			}
		}
		return (int) max;
	}
}
