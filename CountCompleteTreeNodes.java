
public class CountCompleteTreeNodes {
	public int countNodes(TreeNode root) {
		if(root == null){
			return 0;
		}

		int leftHeight = getLeftHeight(root);
		int rightHeight = getRightHeight(root);

		if(leftHeight == rightHeight){
			return (1 << leftHeight)  - 1;
		}
		else{
			return countNodes(root.left) + countNodes(root.right) + 1;
		}

	}

	private int getLeftHeight(TreeNode leftNode){
		int depth = 0;
		while(leftNode != null){
			leftNode = leftNode.left;
			depth++;
		}
		return depth;
	}
	private int getRightHeight(TreeNode rightNode){
		int depth = 0;
		while(rightNode != null){
			rightNode = rightNode.right;
			depth++;
		}
		return depth;
	}
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
