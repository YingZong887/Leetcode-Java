import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null) {
			return result;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			List<Integer> level = new ArrayList<Integer>();
			for(int i = 0; i < size; i++) {
				TreeNode curNode = queue.poll();
				level.add(curNode.val);
				if(curNode.left != null) {
					queue.offer(curNode.left);
				}
				if(curNode.right != null) {
					queue.offer(curNode.right);
				}
			}
			result.add(0, level);
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
