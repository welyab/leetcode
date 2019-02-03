import java.util.Arrays;

// https://leetcode.com/problems/keyboard-row/
public class Keyboard_Row {

	private static java.util.List<java.util.HashSet<Character>> rows;
	static {
		rows = new java.util.ArrayList<>();
		java.util.HashSet<Character> list = null;

		list = new java.util.HashSet<>();
		list.add('q');
		list.add('w');
		list.add('e');
		list.add('r');
		list.add('t');
		list.add('y');
		list.add('u');
		list.add('i');
		list.add('o');
		list.add('p');
		rows.add(list);

		list = new java.util.HashSet<>();
		list.add('a');
		list.add('s');
		list.add('d');
		list.add('f');
		list.add('g');
		list.add('h');
		list.add('j');
		list.add('k');
		list.add('l');
		rows.add(list);

		list = new java.util.HashSet<>();
		list.add('z');
		list.add('x');
		list.add('c');
		list.add('v');
		list.add('b');
		list.add('n');
		list.add('m');
		rows.add(list);
	}

	public String[] findWords(String[] words) {
		java.util.List<String> list = new java.util.ArrayList<>();
		for (String w : words) {
			char[] chars = w.toLowerCase().toCharArray();
			for (java.util.HashSet<Character> row : rows) {
				boolean found = true;
				for (int i = 0; i < chars.length; i++) {
					if (!row.contains(chars[i])) {
						found = false;
						break;
					}
				}
				if (found) {
					list.add(w);
					break;
				}
			}
		}
		String resp[] = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			resp[i] = list.get(i);
		}
		return resp;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Keyboard_Row().findWords(
			new String[] {
				"Hello", "Alaska", "Dad", "Peace"
			}
		)));
	}
}
