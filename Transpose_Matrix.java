// https://leetcode.com/problems/transpose-matrix/
public class Transpose_Matrix {
	public int[][] transpose(int[][] A) {
        int t[][] = new int[A[0].length][A.length];
        for(int i =0; i<A.length; i++) {
            for(int j=0; j<A[0].length; j++) {
                t[j][i]=A[i][j];
            }
        }
        return t;
    }
}