// https://leetcode.com/problems/first-unique-character-in-a-string/
public class First_Unique_Character_in_a_String {
	public int firstUniqChar(String s) {
		java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
