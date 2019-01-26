// https://leetcode.com/problems/sort-characters-by-frequency/
public class Sort_Characters_By_Frequency {
	public String frequencySort(String s) {
		char letters[] = s.toCharArray();
		java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
		for (char c : letters) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		StringBuilder builder = new StringBuilder(s.length());
		map.entrySet()
			.stream()
			.sorted((e1, e2) -> e2.getValue() - e1.getValue())
			.flatMap(e -> java.util.stream.IntStream.range(0, e.getValue()).map(i -> e.getKey()).mapToObj(c -> c))
			.forEach(c -> builder.append((char) c.intValue()));
		return builder.toString();
	}
}
