// https://leetcode.com/problems/multiply-strings/description/
public class Multiply_Strings {

	public String multiply(String num1, String num2) {
		return new java.math.BigInteger(num1).multiply(new java.math.BigInteger(num2)).toString();
	}
}
