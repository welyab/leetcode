// https://leetcode.com/problems/top-k-frequent-words/
public class Top_K_Frequent_Words {

	public java.util.List<String> topKFrequent(String[] words, int k) {
		java.util.Map<String, Integer> map = new java.util.HashMap<>(k);
		for(String w : words) {
			map.put(w, map.getOrDefault(w, 0) + 1);
		}
		return map
			.entrySet()
			.stream()
			.sorted((v1, v2) -> v2.getValue() != v1.getValue() ? v2.getValue() - v1.getValue() : v1.getKey().compareTo(v2.getKey()))
            .limit(k)
			.map(v -> v.getKey())
			.collect(java.util.stream.Collectors.toList());
    }
}
