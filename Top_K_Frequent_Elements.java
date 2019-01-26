// https://leetcode.com/problems/top-k-frequent-elements/
public class Top_K_Frequent_Elements {
	public java.util.List<Integer> topKFrequent(int[] nums, int k) {
		java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		return map
			.entrySet()
			.stream()
			.sorted((e1, e2) -> e2.getValue() - e1.getValue())
			.limit(k)
			.map(e -> e.getKey())
			.collect(java.util.stream.Collectors.toList());
	}
}
