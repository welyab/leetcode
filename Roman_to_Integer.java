// https://leetcode.com/problems/roman-to-integer/description/
public class Roman_to_Integer {

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

	private static java.util.Map<String, Integer> map = null;

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

	private void initMap() {
		map = new java.util.HashMap<>();
		for (int i = 1; i <= 3999; i++) {
			map.put(intToRoman(i),i);
		}
	}

	public int romanToInt(String s) {
		if(map == null) {
			initMap();
		}
		return map.get(s);
	}
}
