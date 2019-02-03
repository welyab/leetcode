// https://leetcode.com/problems/expression-add-operators/
// incomplete solution
public class Expression_Add_Operators {

	public java.util.List<String> addOperators(String num, int target) {
		if (num.isEmpty()) {
			return new java.util.ArrayList<>();
		}
		int digits[] = new int[num.length()];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = num.charAt(i) - '0';
		}
		java.util.List<String> list = new java.util.ArrayList<>();
		char operators[] = new char[digits.length - 1];
		int operandsStack[] = new int[num.length()];
		char operatorsStack[] = new char[digits.length - 1];
		solve(digits, operators, 0, digits.length - 1, target, operandsStack, operatorsStack, list);
		return list;
	}

	public void solve(
		int digits[],
		char operators[],
		int index,
		int total,
		int target,
		int operandsStack[],
		char operatorsStack[],
		java.util.List<String> list
	) {
		if (index == total) {
			int operandsStackIndex = -1;
			int operatorsStackIndex = -1;
			for (int i = 0; i < digits.length; i++) {
				operandsStackIndex++;
				operandsStack[operandsStackIndex] = digits[i];
				if (i < operators.length) {
					while (
						operatorsStackIndex >= 0
							&& precedence(operatorsStack[operatorsStackIndex]) >= precedence(operators[i])
					) {
						char op = operatorsStack[operatorsStackIndex];
						operatorsStackIndex--;
						int a1 = operandsStack[operandsStackIndex];
						operandsStackIndex--;
						int a2 = operandsStack[operandsStackIndex];
						operandsStackIndex--;
						operandsStackIndex++;
						operandsStack[operandsStackIndex] = operate(a2, a1, op);
					}
					operatorsStackIndex++;
					operatorsStack[operatorsStackIndex] = operators[i];
				}
			}
			while (operatorsStackIndex >= 0) {
				char op = operatorsStack[operatorsStackIndex];
				operatorsStackIndex--;
				int a1 = operandsStack[operandsStackIndex];
				operandsStackIndex--;
				int a2 = operandsStack[operandsStackIndex];
				operandsStackIndex--;
				operandsStackIndex++;
				operandsStack[operandsStackIndex] = operate(a2, a1, op);
			}
			if (operandsStack[0] == target) {
				StringBuilder builder = new StringBuilder(digits.length + operators.length);
				for (int i = 0; i < digits.length; i++) {
					builder.append(digits[i]);
					if (i < operators.length) {
						builder.append(operators[i]);
					}
				}
				list.add(builder.toString());
			}
			return;
		}

		operators[index] = '+';
		solve(digits, operators, index + 1, total, target, operandsStack, operatorsStack, list);
		operators[index] = '-';
		solve(digits, operators, index + 1, total, target, operandsStack, operatorsStack, list);
		operators[index] = '*';
		solve(digits, operators, index + 1, total, target, operandsStack, operatorsStack, list);
	}

	private int operate(int a1, int a2, char c) {
		if (c == '-') {
			return a1 - a2;
		}
		if (c == '+') {
			return a1 + a2;
		}
		return a1 * a2;
	}

	private int precedence(char c) {
		return c == '+' || c == '-' ? 0 : 1;
	}

	public static void main(String[] args) {
		new Expression_Add_Operators().addOperators("105", 5).forEach(System.out::println);
	}
}
