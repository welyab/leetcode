// https://leetcode.com/problems/valid-tic-tac-toe-state/
public class Valid_Tic_Tac_Toe_State {

	public boolean validTicTacToe(String[] board) {
		char b[][] = new char[][] {
			{
				' ', ' ', ' '
			},
			{
				' ', ' ', ' '
			},
			{
				' ', ' ', ' '
			}
		};

		char t[][] = new char[3][3];
		t[0] = board[0].toCharArray();
		t[1] = board[1].toCharArray();
		t[2] = board[2].toCharArray();

		return check(b, 'X', t);
	}

	private boolean checkLine(char[][] b, char c) {
		for (int i = 0; i < 3; i++) {
			if (b[i][0] == c && b[i][1] == c && b[i][2] == c) {
				return true;
			}
			if (b[0][i] == c && b[1][i] == c && b[2][i] == c) {
				return true;
			}
		}

		return b[0][0] == c && b[1][1] == c && b[2][2] == c
			|| b[0][2] == c && b[1][1] == c && b[2][0] == c;
	}

	private boolean check(char[][] b, char c, char[][] t) {
		boolean s = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (b[i][j] != t[i][j]) {
					s = false;
					break;
				}
			}
			if (!s) {
				break;
			}
		}
		if (s) {
			if (!(checkLine(b, 'X') && checkLine(b, 'O'))) {
				return true;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (b[i][j] == ' ') {
					b[i][j] = c;
					boolean r = check(b, c == 'X' ? 'O' : 'X', t);
					if (r) {
						return true;
					}
					b[i][j] = ' ';
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// XXX
		// XOO
		// OO.

		System.out.println(new Valid_Tic_Tac_Toe_State().validTicTacToe(new String[] {
			"XXX", "XOO", "OO "
		}));
	}
}
