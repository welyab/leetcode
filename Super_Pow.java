// https://leetcode.com/problems/super-pow/
public class Super_Pow {
	public int superPow(int a, int[] b) {
		StringBuilder builder = new StringBuilder();
		for (int i : b) {
			builder.append(i);
		}
		java.math.BigInteger bigA = new java.math.BigInteger(Integer.toString(a));
		return bigA.modPow(new java.math.BigInteger(builder.toString()), new java.math.BigInteger("1337")).intValue();
	}
}
