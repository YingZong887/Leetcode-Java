public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		return maxDepth(root) != -1;
	}
	
	private int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		if(left == -1 || right == -1 || Math.abs(right-left) > 1) {
			return -1;
		}
		return 1 + Math.max(left, right);
	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
