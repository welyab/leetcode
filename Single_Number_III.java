// https://leetcode.com/problems/single-number-iii/
public class Single_Number_III {
	public int[] singleNumber(int[] nums) {
		java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		int resp[] = new int[2];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == 1) {
				resp[index++] = nums[i];
			}
		}
		return resp;
	}
}
