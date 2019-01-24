// https://leetcode.com/problems/most-common-word/
public class Most_Common_Word {

	public String mostCommonWord(String paragraph, String[] banned) {
		java.util.HashSet<String> ban = new java.util.HashSet<>();
		for (String s : banned) {
			ban.add(s);
		}
		java.util.HashMap<String, Integer> frequency = new java.util.HashMap<>();
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < paragraph.length(); i++) {
			char c = paragraph.charAt(i);
			c = Character.toLowerCase(c);
			if (c >= 'a' && c <= 'z') {
				b.append(c);
			} else if (b.length() > 0) {
				String w = b.toString();
				b = new StringBuilder();
				frequency.put(w, frequency.getOrDefault(w, 0) + 1);
			}
		}
		if (b.length() > 0) {
			String w = b.toString();
			frequency.put(w, frequency.getOrDefault(w, 0) + 1);
		}

		return frequency
			.entrySet()
			.stream()
			.sorted((v1, v2) -> v2.getValue() - v1.getValue())
			.filter(v -> !ban.contains(v.getKey()))
			.findFirst()
			.map(v -> v.getKey())
			.orElse("");
	}
}
