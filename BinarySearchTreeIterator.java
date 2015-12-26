import java.util.Stack;

public class BinarySearchTreeIterator {
	private TreeNode curt;
	private Stack<TreeNode> stack = new Stack<TreeNode>();
	
	public BinarySearchTreeIterator(TreeNode root) {
		curt = root;
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return (curt != null) || (!stack.isEmpty());

	}

	/** @return the next smallest number */
	public int next() {
		while(curt != null) {
			stack.push(curt);
			curt = curt.left;
		}
		
		curt = stack.pop();
		TreeNode node = curt;
		curt = curt.right;
		return node.val;

	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */