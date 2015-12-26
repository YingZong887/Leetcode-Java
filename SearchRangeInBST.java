import java.util.ArrayList;

public class SearchRangeInBST {
	/**
	 * k1<=k2
	 * @param root
	 * @param k1
	 * @param k2
	 * @return
	 */
	public ArrayList<Integer> range(TreeNode root, int k1, int k2) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null) {
			return result;
		}
		
		if(k1 <= root.val && k2 >= root.val) {
			result.add(root.val);
			range(root.left, k1, k2);
			range(root.right, k1, k2);
		}
		if(k1 > root.val) {
			range(root.right, k1, k2);
		}
		else {
			range(root.left, k1, k2);
		}
		return result;
	}
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
