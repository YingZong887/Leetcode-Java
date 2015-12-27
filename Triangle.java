import java.util.*;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int h = triangle.size();
		int[][] path = new int[h][h];
		//initial
		for(int i = 0; i < h; i++){
			path[h - 1][i] = triangle.get(h - 1).get(i);
		}

		//function
		for(int i = h - 2; i >= 0; i--){
			for(int j = 0; j <= i; j++){
				path[i][j] = Math.min(path[i + 1][j],path[i + 1][j + 1]) + triangle.get(i).get(j);
			}
		}

		//answer
		return path[0][0];

	}
}
