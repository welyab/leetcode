import java.util.Arrays;

// https://leetcode.com/problems/find-the-difference/
public class Find_the_Difference {
	public char findTheDifference(String s, String t) {
		char sChars[] = s.toCharArray();
		char tChars[] = t.toCharArray();

		Arrays.sort(sChars);
		Arrays.sort(tChars);

		for (int i = 0; i < sChars.length; i++) {
			if (sChars[i] != tChars[i]) {
				return tChars[i];
			}
		}
		return tChars[tChars.length - 1];
	}
}
