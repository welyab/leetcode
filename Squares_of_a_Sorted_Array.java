// https://leetcode.com/problems/squares-of-a-sorted-array/
public class Squares_of_a_Sorted_Array {

	public int[] sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		java.util.Arrays.sort(A);
		return A;
	}
}
