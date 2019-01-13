// https://leetcode.com/problems/single-number/
public class Single_Number {
	public int singleNumber(int[] nums) {
        java.util.Arrays.sort(nums);
        if(nums.length >= 2 && nums[0] != nums[1]) {
            return nums[0];
        }
        for(int i =1; i<nums.length - 1; i++) {
            if(nums[i-1] != nums[i] && nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}