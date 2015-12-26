
public class SearchA2DMatrixII {
	/**
	 * search from left-down corner,if cur < target, delete c, else delete r. O(m+n)
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0) {
			return false;
		}
		if(matrix[0] == null || matrix[0].length == 0) {
			return false;
		}
		
		int row = matrix.length;
		int column = matrix[0].length;
		int curR = row-1; 
		int curC = 0;
		while(curR >= 0 && curR <= row-1 && curC >= 0 && curC <= column-1) {
			if(matrix[curR][curC] == target) {
				return true;
			}
			if(matrix[curR][curC] > target) {
				curR--;
			} else {
				curC++;
			}
		}
		return false;
	}
}
