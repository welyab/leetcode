// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Peak_Index_in_a_Mountain_Array {
	public int peakIndexInMountainArray(int[] A) {
        int x = A[0];
        for(int i =1; i<A.length; i++) {
            if(A[i-1] < A[i]) {
                x = A[i];
            }else  {
                return i-1;
            }
        }
        return 0;
    }
}