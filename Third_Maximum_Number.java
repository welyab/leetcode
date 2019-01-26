// https://leetcode.com/problems/third-maximum-number/
public class Third_Maximum_Number {
	public int thirdMax(int[] nums) {
		long max[] = new long[3];
		java.util.Arrays.fill(max, Long.MIN_VALUE);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < max.length; j++) {
				if (max[j] == nums[i]) {
					break;
				}
				if (max[j] < nums[i]) {
					for (int k = 0; k < max.length - j - 1; k++) {
						max[max.length - 1 - k] = max[max.length - 2 - k];
					}
					max[j] = nums[i];
					break;
				}
			}
		}
		if (max[max.length - 1] == Long.MIN_VALUE) {
			return (int) max[0];
		}
		return (int) max[max.length - 1];
	}
}
