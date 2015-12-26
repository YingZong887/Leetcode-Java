import java.util.ArrayList;
import java.util.List;


public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<String>();
		if(root == null) {
			return result;
		}
		String s = "";
		dfs(root, s, result);
		return result;
	}

	private void dfs(TreeNode root, String s, List<String> result) {
		if(root == null) {
			result.add(s);
			return;
		}
		if(s.length() == 0) {
			s = s + root.val;
		} else {
			s = s + "->" + root.val;
		}
		dfs(root.left, s, result);
		dfs(root.right, s, result);
	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
