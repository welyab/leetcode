// https://leetcode.com/problems/integer-to-roman/description/
public class Integer_to_Roman {

	private static final String table[][] = {
			{
					"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
			},
			{
					"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"
			},
			{
					"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"
			},
			{
					"M", "MM", "MMM"
			}
	};

	public String intToRoman(int num) {
		char digits[] = Integer.toString(num).toCharArray();
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < digits.length; i++) {
			int d = digits[digits.length - i - 1] - '0';
			if (d != 0) {
				roman.insert(0, table[i][d - 1]);
			}
		}
		return roman.toString();
	}

	public static void main(String[] args) {
		Integer_to_Roman r = new Integer_to_Roman();
		for (int i = 1; i <= 3999; i++) {
			System.out.println(i + " " + r.intToRoman(i));
		}
	}
}
