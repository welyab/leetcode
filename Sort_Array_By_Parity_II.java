// https://leetcode.com/problems/sort-array-by-parity-ii/
public class Sort_Array_By_Parity_II {
	public int[] sortArrayByParityII(int[] A) {
        java.util.Stack<Integer> odd = new java.util.Stack<>();
        java.util.Stack<Integer> even = new java.util.Stack<>();
        for(int i =0; i<A.length; i++) {
            if(A[i] % 2 == 0) {
                even.push(A[i]);
            } else {
                odd.push(A[i]);
            }
        }
        for(int i =0; i<A.length; i++) {
            if(i % 2 == 0) {
                A[i] = even.pop();
            } else {
                A[i] = odd.pop();
            }
        }
        return A;
	}
}