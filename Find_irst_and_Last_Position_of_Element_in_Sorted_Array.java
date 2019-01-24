// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Find_irst_and_Last_Position_of_Element_in_Sorted_Array {

	public int[] searchRange(int[] nums, int target) {
		int index = java.util.Arrays.binarySearch(nums, target);
		if (index < 0) {
			return new int[] {
					-1, -1
			};
		}
		int a = 0;
		int b = 0;
		while (true) {
			int ta = a;
			int tb = b;
			if (index - a - 1 >= 0 && nums[index - a - 1] == nums[index]) {
				a++;
			}
			if (index + b + 1 < nums.length && nums[index + b + 1] == nums[index]) {
				b++;
			}
			if (ta == a && tb == b) {
				break;
			}
		}
		return new int[] {
				index - a, index + b
		};
	}
}
