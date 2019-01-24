// https://leetcode.com/problems/longest-common-prefix/description/
public class Longest_Common_Prefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		int max = 0;
		for (int i = 0; i < strs.length; i++) {
			max = Integer.max(max, strs[i].length());
		}
		char prefix[] = new char[max];
		max = strs[0].length();
		for (int i = 0; i < max; i++) {
			prefix[i] = strs[0].charAt(i);
		}
		for (int j = 1; j < strs.length; j++) {
			String s = strs[j];
			max = Integer.min(max, s.length());
			for (int i = 0; i < s.length() && i < max; i++) {
				if (prefix[i] != s.charAt(i)) {
					max = i;
					break;
				}
			}
		}
		return new String(prefix, 0, max);
	}
}
