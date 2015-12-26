import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
	/**
	 * Traverse, recusion.
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal_recursion(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		traverse(root,result);
		return result;

	}
	private void traverse(TreeNode root, List<Integer> result) {
		if(root == null) {
			return;
		}
		result.add(root.val); //other kinds of traverse we can change this order 
		traverse(root.left, result);
		traverse(root.right, result);
	}
	
	/**
	 * non-recursive, stack
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal_iteration(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root == null) {
			return result;
		}
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			result.add(cur.val);
			if(cur.right != null) {
				stack.push(cur.right);
			}
			if(cur.left != null) {
				stack.push(cur.left);
			}
		}
		return result;
	}
	/**
	 * Divide and Conquer
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal_DivideConquer(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		//null or leaf
		if(root == null) {
			return result;
		}
		
		//divide
		List<Integer> left = preorderTraversal_DivideConquer(root.left);
		List<Integer> right = preorderTraversal_DivideConquer(root.right);
		
		//conquer
		result.add(root.val);
		result.addAll(left);
		result.addAll(right);
		return result;
	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
