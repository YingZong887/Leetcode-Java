
public class ClosestBinarySearchTreeValue {
	/**
	 * recursion
	 * @param root
	 * @param target
	 * @return
	 */
	public int closestValue(TreeNode root, double target) {
		if(target == root.val){
			return root.val;
		}
		TreeNode child = (target < root.val? root.left : root.right);
		if(child == null){
			return root.val;
		}
		int childClosest = closestValue(child, target);
        return Math.abs(root.val - target) < Math.abs(childClosest - target) ? root.val : childClosest;
		
	}
	/**
	 * Iteration
	 * @param root
	 * @param target
	 * @return
	 */
	public int closestValue_Iteration(TreeNode root, double target) {
		int closest = root.val;
		while(root != null) {
			if(target == root.val){
				return root.val;
			}
			if (Math.abs(closest - target) > Math.abs(root.val - target)) {
                closest = root.val;
            }
            root = target < root.val ? root.left : root.right;		
		}
		return closest;
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
