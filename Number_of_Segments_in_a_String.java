// https://leetcode.com/problems/number-of-segments-in-a-string/
public class Number_of_Segments_in_a_String {
	public int countSegments(String s) {
		int count = 0;
		boolean increment = true;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isWhitespace(c)) {
				increment = true;
			} else if (increment) {
				increment = false;
				count++;
			}
		}
		return count;
	}
}
