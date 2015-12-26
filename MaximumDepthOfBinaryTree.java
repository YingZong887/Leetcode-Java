import java.util.Stack;

public class MaximumDepthOfBinaryTree {
	/**
	 * recursion, divide and conquer
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	public int maxDepth_DFS(TreeNode root){
		if(root == null){
			return 0;
		}
		Stack<TreeNode> node = new Stack<TreeNode>();
		node.add(root);
		int result = 0;
		while(!node.isEmpty()){
			
			
		}
		return 0;
	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
