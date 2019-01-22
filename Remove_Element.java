// https://leetcode.com/problems/remove-element/
public class Remove_Element {
	public int removeElement(int[] nums, int val) {
		int removed = 0;
        for(int i=0; i<nums.length - removed; i++) {
			if(nums[i] == val) {
				removed++;
				for(int j=i+1; j<nums.length; j++) {
					nums[j-1] = nums[j];
				}
				i--;
			}
		}
		return nums.length - removed;
	}
}
