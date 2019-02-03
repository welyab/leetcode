// https://leetcode.com/problems/valid-perfect-square/
public class Valid_Perfect_Square {
	public boolean isPerfectSquare(int num) {
		return Double.compare(Math.sqrt(num) % 1.0, 0.0) == 0;
	}
}
