// https://leetcode.com/problems/monotonic-array/
public class Monotonic_Array {

	public boolean isMonotonic(int[] A) {
		boolean increase = true;
		boolean decrease = true;
		for (int i = 0; i < A.length; i++) {
			if (increase && i + 1 < A.length && A[i] > A[i + 1]) {
				increase = false;
			}
			if (decrease && A.length - 2 - i >= 0 && A[A.length - 1 - i] > A[A.length - 2 - i]) {
				decrease = false;
			}
			if(!increase && !decrease) {
				return false;
			}
		}
		return increase || decrease;
	}

	public static void main(String[] args) {
		System.out.println(new Monotonic_Array().isMonotonic(new int[] {
				1,3,2
		}));
	}
}
