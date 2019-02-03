// https://leetcode.com/problems/basic-calculator/description/
public class Basic_Calculator {

	public int calculate(String s) {
		java.util.Deque<Integer> operands = new java.util.ArrayDeque<>();
		java.util.Deque<String> operators = new java.util.ArrayDeque<>();
		java.util.StringTokenizer tokens = new java.util.StringTokenizer(s, "\\(\\)\\+\\-\\d+ ", true);

		while (tokens.hasMoreTokens()) {
			String t = tokens.nextToken().trim();
			if (t.isEmpty()) {
				continue;
			}
			if (t.equals("(")) {
				operators.push(t);
			} else if (t.equals("+") || t.equals("-")) {
				while (!operators.isEmpty() && !operators.peek().equals("(")) {
					String op = operators.pop();
					Integer a1 = operands.pop();
					Integer a2 = operands.pop();
					if (op.equals("+")) {
						operands.push(a1 + a2);
					} else {
						operands.push(a2 - a1);
					}
				}
				operators.push(t);
			} else if (t.equals(")")) {
				String op = null;
				while (!(op = operators.pop()).equals("(")) {
					Integer a1 = operands.pop();
					Integer a2 = operands.pop();
					if (op.equals("+")) {
						operands.push(a1 + a2);
					} else {
						operands.push(a2 - a1);
					}
				}
			} else {
				operands.push(Integer.parseInt(t));
			}
		}
		while (!operators.isEmpty()) {
			String op = operators.pop();
			Integer a1 = operands.pop();
			Integer a2 = operands.pop();
			if (op.equals("+")) {
				operands.push(a1 + a2);
			} else {
				operands.push(a2 - a1);
			}
		}
		return operands.pop();
	}

	public static void main(String[] args) {
		System.out.println(new Basic_Calculator().calculate("(1+(4+5+2)-3)+(6+8)"));
	}
}
