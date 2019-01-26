// https://leetcode.com/problems/shortest-distance-to-a-character/
public class Shortest_Distance_to_a_Character {
	public int[] shortestToChar(String S, char C) {
		java.util.List<Integer> indexes = new java.util.ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == C) {
				indexes.add(i);
			}
		}
		int distances[] = new int[S.length()];
		for (int i = 0; i < S.length(); i++) {
			distances[i] = Integer.MAX_VALUE;
			for (int j = 0; j < indexes.size(); j++) {
				distances[i] = Integer.min(distances[i], Math.abs(i - indexes.get(j)));
			}
		}
		return distances;
	}
}
