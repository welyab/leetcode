// https://leetcode.com/problems/n-queens-ii/
public class N_Queens_II {

	public int totalNQueens(int n) {
		java.util.List<java.util.List<String>> result = new java.util.ArrayList<>();
		java.util.List<Integer> positions = new java.util.ArrayList<>();
		return solve(n, positions, result);
	}

	private int solve(int n, java.util.List<Integer> positions, java.util.List<java.util.List<String>> result) {
		if (positions.size() == n) {
			return 1;
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!colision(positions, i)) {
				positions.add(i);
				count += solve(n, positions, result);
				positions.remove(positions.size() - 1);
			}
		}
		return count;
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
}
