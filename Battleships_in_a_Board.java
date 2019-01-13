// https://leetcode.com/problems/battleships-in-a-board/
public class Battleships_in_a_Board {
	public int countBattleships(char[][] board) {
        int x = board.length;
        int y = board[0].length;
        int count = 0;
        for(int i =0; i<x; i++) {
            for(int j =0; j<y; j++) {
				if(    board[i][j] == 'X'
					&& (i-1 < 0 || board[i-1][j] != 'X')
					&& (j-1 < 0 || board[i][j-1] != 'X')) {
					count++;
				}
            }
        }
        return count;
    }
}