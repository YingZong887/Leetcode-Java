
public class MinimumDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		if(root == null){
			return 0;
		}   
		int left = minDepth(root.left); 
		int right = minDepth(root.right); 

		if(root.left == null){
			return right + 1;
		}else if(root.right == null){
			return left + 1;
		}

		return Math.min(left,right) + 1;
	}
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
