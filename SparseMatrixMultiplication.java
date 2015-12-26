public class SparseMatrixMultiplication {
	public int[][] multiply(int[][] A, int[][] B) {
		int m = A.length; //A = m*d, B = d*n
		int d = A[0].length;
		int n = B[0].length;
		int[][] result = new int[m][n];
		
		for(int i = 0; i < d; i++) {
			for(int a = 0; a < m; a++) {
				if(A[a][i] != 0) {
					for(int b = 0; b < n; b++) {
						if(B[i][b] != 0) {
							result[a][b] += A[a][i]*B[i][b];
						}
					}
				}
			}
		}
		return result;
	}
}
