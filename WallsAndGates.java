
public class WallsAndGates {
	public void wallsAndGates(int[][] rooms) {
		if(rooms == null || rooms.length == 0 || rooms[0] == null || rooms[0].length == 0) {
			return;
		}
		int m = rooms.length;
		int n = rooms[0].length;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(rooms[i][j] == 0) {
					dfs(rooms,i,j, 0);
				}
			}
		}
	}
	
	private void dfs(int[][] rooms, int i, int j, int depth) {
		if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] == -1) {
			return;
		}
		
		if(depth == 0 || depth < rooms[i][j]) {
			rooms[i][j] = depth;
			dfs(rooms, i-1, j, depth+1);
			dfs(rooms, i+1, j, depth+1);
			dfs(rooms, i, j-1, depth+1);
			dfs(rooms, i, j+1, depth+1);
		}
	}
}
