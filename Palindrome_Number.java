// https://leetcode.com/problems/palindrome-number/
public class Palindrome_Number {
	public boolean isPalindrome(int x) {
        if(x < 0) {
			return false;
		}
        char[] digits = Integer.toString(x).toCharArray();
        for(int i = 0; i < digits.length / 2; i++) {
            if(digits[i] != digits[digits.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
