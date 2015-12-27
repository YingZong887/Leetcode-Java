
public class WordSearch {
	public boolean exist(char[][] board, String word) {
		if(board == null || board.length == 0 || board[0] == null || board[0].length == 0) {
			return false;
		}
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(existBT(board, word, i, j, 0)) return true;
			}
		}
		return false;
	}

	public boolean existBT(char[][] board, String word, int i, int j, int start) {
		if(start >= word.length()) {
			return true;
		}
		if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
			return false;
		}
		if(board[i][j] == word.charAt(start++)) {
			char c = board[i][j];
			board[i][j] = '#';
			boolean result = existBT(board, word, i - 1, j, start) ||
					existBT(board, word, i + 1, j, start) ||
					existBT(board, word, i, j - 1, start) ||
					existBT(board, word, i, j + 1, start);
			board[i][j] = c;
			return result;
		}
		return false;
	}
}
