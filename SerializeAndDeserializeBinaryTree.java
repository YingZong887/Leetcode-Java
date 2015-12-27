import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if(root == null) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode curNode = queue.poll();
			if(curNode == null) {
				sb.append("null,");
				continue;
			} else {
				sb.append(curNode.val + ",");
			}
			queue.offer(curNode.left);
			queue.offer(curNode.right);
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.insert(0,"[");
		sb.append("]");
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		data = data.substring(1, data.length() - 1);
		if(data.equals("")) {
			return null;
		}
		String[] values = data.split(",");
		TreeNode root = new TreeNode(Integer.parseInt(values[0]));
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		for(int i = 1; i < values.length; i++) {
			TreeNode parent = queue.poll();
			if(!values[i].equals("null")) {
				TreeNode left = new TreeNode(Integer.parseInt(values[i]));
				parent.left = left;
				queue.offer(left);
			}
			if(!values[++i].equals("null")) {
				TreeNode right = new TreeNode(Integer.parseInt(values[i]));
				parent.right = right;
				queue.offer(right);
			}
		}
		return root;

	}
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}

//Your Codec object will be instantiated and called as such:
//Codec codec = new Codec();
//codec.deserialize(codec.serialize(root));
