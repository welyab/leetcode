// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class Find_All_Numbers_Disappeared_in_an_Array {
	public java.util.List<Integer> findDisappearedNumbers(int[] nums) {
		java.util.Arrays.sort(nums);
		java.util.List<Integer> list = new java.util.ArrayList<>();
		for (int i = 1; i <= nums.length; i++) {
			if (java.util.Arrays.binarySearch(nums, i) < 0) {
				list.add(i);
			}
		}
		return list;
	}
}
