// https://leetcode.com/problems/largest-perimeter-triangle/
public class Largest_Perimeter_Triangle {

	public int largestPerimeter(int[] A) {
		java.util.Arrays.sort(A);
		for (int i = A.length - 1; i >= 0; i--) {
			if (i - 1 < 0 || i - 2 < 0 || A[i] >= A[i - 1] + A[i - 2]) {
				continue;
			}
			return A[i] + A[i - 1] + A[i - 2];
		}
		return 0;
	}
}
