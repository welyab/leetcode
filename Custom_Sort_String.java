// https://leetcode.com/problems/custom-sort-string/
public class Custom_Sort_String {
	public String customSortString(String S, String T) {
		java.util.Map<Character, Integer> positions = new java.util.HashMap<>();
		for (int i = 0; i < S.length(); i++) {
			positions.put(S.charAt(i), i);
		}
		StringBuilder builder = new StringBuilder(T.length());
		T.chars()
			.mapToObj(i -> (char) i)
			.sorted((c1, c2) -> positions.getOrDefault(c1, 0) - positions.getOrDefault(c2, 0))
			.forEach(builder::append);
		return builder.toString();
	}
}
