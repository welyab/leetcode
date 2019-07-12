// https://leetcode.com/problems/valid-parentheses/
public class Valid_Parentheses {

	public boolean isValid(String s) {
		java.util.LinkedList<Character> stack = new java.util.LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.addLast(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char open = stack.removeLast();
				if (c == ')' && open != '('
						|| c == ']' && open != '['
						|| c == '}' && open != '{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(new Valid_Parentheses().isValid("()"));
	}
}
