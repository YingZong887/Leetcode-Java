
public class SearchA2DMatrix {
	/**
	 * O(logn + logm)
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
		int n = matrix.length;
		int m = matrix[0].length;
		
		int start = 0;
		int end = m*n-1;
		
		while(start + 1 < end) {
			int mid = (end - start) / 2 + start; //Because (low + high) may exceed the range of Integer.
			if(matrix[mid/m][mid%m] == target) {
				return true;
			} else if(matrix[mid/m][mid%m] < target) {
				start = mid;
			} else { 
				end = mid;
			}
		}
		if(matrix[start/m][start%m] == target || matrix[end/m][end%m] == target) {
			return true;
		} else {
			return false;
		}
	}
}
