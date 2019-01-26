// https://leetcode.com/problems/kth-largest-element-in-an-array/
public class Kth_Largest_Element_in_an_Array {
	public int findKthLargest(int[] nums, int k) {
		java.util.Arrays.sort(nums);
		return nums[nums.length - k];
	}
}
