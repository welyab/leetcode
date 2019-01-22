// https://leetcode.com/problems/move-zeroes/
public class Move_Zeroes {
	public void moveZeroes(int[] nums) {
		for(int i =0; i<nums.length; i++) {
			if(nums[i] != 0) {
				for(int j=0; j<i; j++) {
					if(nums[j] == 0) {
						nums[j] = nums[i];
						nums[i] = 0;
					}
				}
			}
		}
	}
}
