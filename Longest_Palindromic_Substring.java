// https://leetcode.com/problems/longest-palindromic-substring/
public class Longest_Palindromic_Substring {

	public String longestPalindrome(String s) {
        if(s.isEmpty()) return s;

        char chars[] = s.toCharArray();
        int indexStart = 0;
        int indexEnd = 0;
        for(int i = 0; i < chars.length; i++) {
            for(int j = chars.length - 1; j > i; j--) {
                //System.out.println(Arrays.toString(Arrays.copyOfRange(chars, i, j+1)));
                boolean palin = true;
                for(int k = 0; k < (j - i + 1) / 2; k++) {
                    if(chars[i+k] != chars[j-k]) {
                        palin = false;
                        break;
                    }
                }
                if(palin && (j - i > indexEnd - indexStart)){
                    //System.out.printf("%d %d %d %d", j, i, index)
                    indexStart = i;
                    indexEnd = j;
                    //System.out.println(Arrays.toString(Arrays.copyOfRange(chars, i, j+1)));
                }
            }
        }
        return new String(java.util.Arrays.copyOfRange(chars, indexStart, indexEnd + 1));
    }
}
