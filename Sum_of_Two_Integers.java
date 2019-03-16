// https://leetcode.com/problems/sum-of-two-integers/
public class Sum_of_Two_Integers {
	public int getSum(int a, int b) {
		return new java.math.BigDecimal(a).add(new java.math.BigDecimal(b)).intValue();
	}
}
