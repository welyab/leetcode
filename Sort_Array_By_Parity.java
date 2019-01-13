// https://leetcode.com/problems/sort-array-by-parity/
public class Sort_Array_By_Parity {
	public int[] sortArrayByParity(int[] A) {
		int a[] = new int[A.length];
		 int b[] = new int[A.length];
		 int c = 0;
		 int d = 0;
		 for (int i = 0; i < A.length; i++) {
			 if (A[i] % 2 == 0) {
				 a[c++] = A[i];
			 } else {
				 b[d++] = A[i];
			 }
		 }
		 for (int i = 0; i < d; i++) {
			 a[c++] = b[i];
		 }
		 return a;
	 }
}