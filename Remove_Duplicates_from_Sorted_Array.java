// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
		int a = 0;
		for(int i=1; i<nums.length; i++) {
			if(nums[a] != nums[i]) {
				nums[a+1] = nums[i];
				a++;
			}
		}
		return a+1;
	}
}
