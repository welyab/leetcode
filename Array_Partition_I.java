// https://leetcode.com/problems/array-partition-i/
public class Array_Partition_I  {
	public int arrayPairSum(int[] nums) {
        java.util.Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
