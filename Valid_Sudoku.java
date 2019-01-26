// https://leetcode.com/problems/valid-sudoku/
public class Valid_Sudoku {

	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			if (!isLineValid(board, i)) {
				return false;
			}
			if (!isColumnValid(board, i)) {
				return false;
			}
		}
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				if (!isBlockValid(board, i, j)) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isBlockValid(char board[][], int a, int b) {
		int memory[] = new int[9];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[a + i][b + j] != '.') {
					if (memory[board[a + i][b + j] - '0' - 1] > 0) {
						return false;
					}
					memory[board[a + i][b + j] - '0' - 1]++;
				}
			}
		}
		return true;
	}

	public boolean isLineValid(char board[][], int line) {
		int memory[] = new int[9];
		for (int i = 0; i < 9; i++) {
			if (board[line][i] != '.') {
				if (memory[board[line][i] - '0' - 1] > 0) {
					return false;
				}
				memory[board[line][i] - '0' - 1]++;
			}
		}
		return true;
	}

	public boolean isColumnValid(char board[][], int column) {
		int memory[] = new int[9];
		for (int i = 0; i < 9; i++) {
			if (board[i][column] != '.') {
				if (memory[board[i][column] - '0' - 1] > 0) {
					return false;
				}
				memory[board[i][column] - '0' - 1]++;
			}
		}

		return true;
	}
}
