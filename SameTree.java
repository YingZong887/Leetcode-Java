
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null || q == null){
			if (p == q){
				return true;
			}
			else{
				return false;
			}
		}
		if(p.left == null && q.left == null && p.right == null && q.right == null
				&& p.val == q.val){
			return true;
		}


		if(p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)){
			return true;
		}else{
			return false;
		}
	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
