// https://leetcode.com/problems/jewels-and-stones/
public class Jewels_and_Stones {
	public int numJewelsInStones(String J, String S) {
        char[] j = J.toCharArray();
		char[] s = S.toCharArray();
		int c = 0;
		for (int i = 0; i < j.length; i++) {
			for (int k = 0; k < s.length; k++) {
				if (j[i] == s[k]) {
					c++;
				}
			}
		}
		return c;
    }
}
