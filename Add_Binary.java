// https://leetcode.com/problems/add-binary/
public class Add_Binary {
	public String addBinary(String a, String b) {
		return new java.math.BigInteger(a, 2)
			.add(new java.math.BigInteger(b, 2))
			.toString(2);
	}
}
