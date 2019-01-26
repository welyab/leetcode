// https://leetcode.com/problems/plus-one/
public class Plus_One {
	public int[] plusOne(int[] digits) {
		int r = 1;
		for (int i = 0; i < digits.length; i++) {
			digits[digits.length - 1 - i] = digits[digits.length - 1 - i] + r;
			if (digits[digits.length - 1 - i] > 9) {
				r = 1;
				digits[digits.length - 1 - i] = 0;
			} else {
				r = 0;
			}
		}
		if (r == 0) {
			return digits;
		}
		int a[] = new int[digits.length + 1];
		a[0] = r;
		for (int i = 0; i < digits.length; i++) {
			a[i + 1] = digits[i];
		}
		return a;
	}
}
