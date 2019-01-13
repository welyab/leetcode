// https://leetcode.com/problems/two-sum/
public class Two_Sum {
	public int[] twoSum(int[] nums, int target) {
        for(int i =0; i<nums.length; i++) {
            for(int j =0; j<nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target) {
                    return new int[]{Math.min(i, j), Math.max(i, j)};
                }
            }
        }
        return null;
    }
}