import java.util.ArrayList;
import java.util.List;


public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<String>();
		if(root == null) {
			return result;
		}
		String s = "" + root.val;
		dfs(root, s, result);
		return result;
	}

	private void dfs(TreeNode root, String s, List<String> result) {
		if(root == null) {
			return;
		}
		if(root.right == null && root.left == null) {
			result.add(s);
			return;
		}
		if(root.left != null) {
			dfs(root.left, s + "->" + root.left.val, result);
		}
		if(root.right != null) {
			dfs(root.right, s + "->" + root.right.val, result);
		}
	}	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
