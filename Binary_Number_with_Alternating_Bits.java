// https://leetcode.com/problems/binary-number-with-alternating-bits/
public class Binary_Number_with_Alternating_Bits {
	public boolean hasAlternatingBits(int n) {
		String bits = Integer.toBinaryString(n);
		char bit = bits.charAt(0);
		for (int i = 1; i < bits.length(); i++) {
			if (bit == bits.charAt(i)) {
				return false;
			}
			bit = bits.charAt(i);
		}
		return true;
	}
}
