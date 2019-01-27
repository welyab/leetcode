// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class Find_All_Duplicates_in_an_Array {
	public java.util.List<Integer> findDuplicates(int[] nums) {
		java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		return map
			.entrySet()
			.stream()
			.filter(e -> e.getValue() == 2)
			.map(e -> e.getKey())
			.collect(java.util.stream.Collectors.toList());
	}
}
