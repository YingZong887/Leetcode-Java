import java.util.ArrayList;

public class ValidBinarySearchTree {
	/**
	 * Divide and conquer
	 * @param root
	 * @return
	 */
	public boolean isValidBST(TreeNode root) {
		return isValid(root, null, null);
	}
	public boolean isValid(TreeNode root, Integer min, Integer max) {
		if(root == null) {
			return true;
		}
		if((max != null && root.val >= max) || (min != null && root.val <= min)) {
			return false;
		}
		return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
	}
	
	/**
	 * Inorder traverse
	 * @param root
	 * @return
	 */
	public boolean isValidBST_Inorder(TreeNode root) { 
		ArrayList<Integer> result = traverse(root);
		for(int i = 0; i < result.size() - 1; i++) {
			if(result.get(i) >= result.get(i + 1)) {
				return false;
			}
		}
		return true;
	}
	
	private ArrayList<Integer> traverse(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null) {
			return result;
		}	
		result.addAll(traverse(root.left));
		result.add(root.val);
		result.addAll(traverse(root.right));
		return result;
	}
	
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
