// https://leetcode.com/problems/reordered-power-of-2/
public class Reordered_Power_of_2 {

	public boolean reorderedPowerOf2(int N) {
		char digits[] = Integer.toString(N).toCharArray();
		return permuteAndCheck(digits, digits.length);
	}

	public boolean permuteAndCheck(char[] digits, int n) {
		if (n == 1 && digits[0] == '0') {
			return false;

		} else if (n == 1) {
			return isPowerOfTwo(Integer.parseInt(new String(digits)));
		}

		for (int i = 0; i < n; i++) {
			boolean b = permuteAndCheck(digits, n - 1);
			if (b) {
				return true;
			}
			int a = n % 2 == 0 ? i : 0;
			char c = digits[a];
			digits[a] = digits[n - 1];
			digits[n - 1] = c;
		}
		return false;
	}

	public boolean isPowerOfTwo(int n) {
		while (n > 1 && n % 2 == 0) {
			n /= 2;
		}
		return n == 1;
	}
}
