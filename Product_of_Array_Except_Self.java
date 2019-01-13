// https://leetcode.com/problems/product-of-array-except-self/
public class Product_of_Array_Except_Self  {
	public int[] productExceptSelf(int[] nums) {
        int r[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            r[i] = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    r[i] = r[i] * nums[j];
                }
            }
        }
        return r;
	}
}
