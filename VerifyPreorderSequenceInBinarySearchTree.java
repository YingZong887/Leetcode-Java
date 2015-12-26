import java.util.Stack;

public class VerifyPreorderSequenceInBinarySearchTree {
	/**
	 * Kinda simulate the traversal, keeping a stack of nodes (just their values) of
	 *  which we're still in the left subtree. If the next number is smaller than the 
	 *  last stack value, then we're still in the left subtree of all stack nodes, so 
	 *  just push the new one onto the stack. But before that, pop all smaller ancestor 
	 *  values, as we must now be in their right subtrees (or even further, in the right 
	 *  subtree of an ancestor). Also, use the popped values as a lower bound, since 
	 *  being in their right subtree means we must never come across a smaller number 
	 *  anymore.
	 * @param preorder
	 * @return
	 */
	public boolean verifyPreorder(int[] preorder) {
		Stack<Integer> stack = new Stack<Integer>();
		int low = Integer.MIN_VALUE;
		for(int i : preorder) {
			if(i < low) {
				return false;
			}
			while(!stack.isEmpty() && i > stack.peek()) {
				low = stack.pop();
			}
			stack.push(i);
		}
		return true;
	}
}
