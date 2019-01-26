// https://leetcode.com/problems/number-complement/
public class Number_Complement {
	public int findComplement(int num) {
		char bits[] = Integer.toBinaryString(num).toCharArray();
		for (int i = 0; i < bits.length; i++) {
			bits[i] = bits[i] == '0' ? '1' : '0';
		}
		return Integer.parseInt(new String(bits), 2);
	}
}
