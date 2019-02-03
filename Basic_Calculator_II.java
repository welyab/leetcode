// https://leetcode.com/problems/basic-calculator-ii/
public class Basic_Calculator_II {
	public int calculate(String s) {
		java.util.Deque<Integer> operands = new java.util.ArrayDeque<>();
		java.util.Deque<Character> operators = new java.util.ArrayDeque<>();
		java.util.StringTokenizer tokens = new java.util.StringTokenizer(
			s,
			"[\\+\\-\\*\\/\\d+ ]",
			true);

		while (tokens.hasMoreTokens()) {
			String t = tokens.nextToken().trim();
			if (t.isEmpty()) {
				continue;
			}
			char c = t.charAt(0);
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
					Character op = operators.pop();
					Integer a1 = operands.pop();
					Integer a2 = operands.pop();
					operands.push(operate(a2, a1, op));
				}
				operators.push(c);
			} else {
				operands.push(Integer.parseInt(t));
			}
		}
		while (!operators.isEmpty()) {
			Character op = operators.pop();
			Integer a1 = operands.pop();
			Integer a2 = operands.pop();
			operands.push(operate(a2, a1, op));
		}
		return operands.pop();
	}

	private int operate(int a, int b, char c) {
		if (c == '+') {
			return a + b;
		}
		if (c == '-') {
			return a - b;
		}
		if (c == '/') {
			return a / b;
		}
		return a * b;
	}

	private int precedence(char c) {
		if (c == '+' || c == '-') {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(new Basic_Calculator_II().calculate("3+2*2"));
	}
}
