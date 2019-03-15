// https://leetcode.com/problems/n-queens/
public class N_Queens {

	public java.util.List<java.util.List<String>> solveNQueens(int n) {
		java.util.List<java.util.List<String>> result = new java.util.ArrayList<>();
		java.util.List<Integer> positions = new java.util.ArrayList<>();
		solve(n, positions, result);
		return result;
	}

	private void solve(int n, java.util.List<Integer> positions, java.util.List<java.util.List<String>> result) {
		if (positions.size() == n) {
			result.add(createBoard(n, positions));
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!colision(positions, i)) {
				positions.add(i);
				solve(n, positions, result);
				positions.remove(positions.size() - 1);
			}
		}
	}

	private boolean colision(java.util.List<Integer> positions, int column) {
		int s = positions.size();
		for (int i = 0; i < s; i++) {
			int row = i;
			int col = positions.get(i);
			if (col == column) {
				return true;
			}
			if (Math.abs(row - s) == Math.abs(col - column)) {
				return true;
			}
		}
		return false;
	}

	private static java.util.List<String> createBoard(int n, java.util.List<Integer> positions) {
		java.util.List<String> board = new java.util.ArrayList<>();
		StringBuilder line = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (positions.get(i) == j) {
					line.append("Q");
				} else {
					line.append(".");
				}
			}
			board.add(line.toString());
			line.setLength(0);
		}
		return board;
	}
}
