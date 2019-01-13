// https://leetcode.com/problems/reverse-integer/
public class Reverse_Integer {
	public int reverse(int x) {
		long r = 0;
		while (true) {
			r = r * 10 + x % 10;
			x /= 10;
			if (x == 0) {
				break;
			}
		}
		return r < Integer.MIN_VALUE || r > Integer.MAX_VALUE ? 0 : (int) r;
	}
}
