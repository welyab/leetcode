// https://leetcode.com/problems/word-search-ii/
public class Word_Search_II {
	public java.util.List<String> findWords(char[][] board, String[] words) {
		int width = board[0].length;
		int height = board.length;
		java.util.List<String> list = new java.util.ArrayList<>();
		for(String w : words) {
			for(int i=0; i<height; i++) {
				int s = list.size();
				for(int j=0; j<width; j++) {
					if(find(board, new boolean[height][height], j, i, width, height, w.toCharArray(), 0)) {
						list.add(w);
						break;
					}
				}
				if(s != list.size()) break;
			}
		}
        return list;
	}
	
	public boolean find(char board[][], boolean [][] memory, int x, int y, int width, int height, char word[], int index) {
		//System.out.printf("%d %d%n", x, y);
		if(index >= word.length || x < 0 || x >= width || y < 0 || y >= height) return false;
		if(memory[y][x]) return false;
		if(board[y][x] != word[index]) return false;
		memory[x][y] = true;
		boolean r = index == word.length - 1
				|| find(board, memory, x+1, y, width, height, word, index+1)
				|| find(board, memory, x-1, y, width, height, word, index+1)
				|| find(board, memory, x, y+1, width, height, word, index+1)
				|| find(board, memory, x, y-1, width, height, word, index+1);
		memory[x][y] = false;
		return r;
	}

	public static void main(String args[]) {
			new Word_Search_II().findWords(
				new char[][]{
					{'o','a','a','n'},
					{'e','t','a','e'},
					{'i','h','k','r'},
					{'i','f','l','v'}
				},
				new String[]{"oath","pea","eat","rain"}
			).forEach(System.out::println);
	}
	
}