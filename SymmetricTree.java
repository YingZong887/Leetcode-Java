
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if(root == null){
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	public boolean isSymmetric(TreeNode l, TreeNode r) {
		if(l == null && r == null){
			return true;
		}
		if(l == null || r == null){
			return false;
		}
		if(l.val != r.val){
			return false;
		}

		return isSymmetric(l.right, r.left) && isSymmetric(l.left, r.right);
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
