// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
public class N_Repeated_Element_in_Size_2N_Array {
	public int repeatedNTimes(int[] A) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for(int i =0; i<A.length; i++) {
            if(set.contains(A[i])) {
                return A[i];
            }
            set.add(A[i]);
        }
        return 0;
    }
}
