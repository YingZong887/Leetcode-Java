import java.util.*;


public class BinaryTreeVerticalOrderTraversal {
	class LevelValue implements Comparable<LevelValue>{
		int level;
		int value;
		public LevelValue(int level, int value) {
			this.level = level;
			this.value = value;
		}

		@Override
		public int compareTo(LevelValue o) {
			return this.level - o.level;
		}
	}
	/**
	 * BFS
	 * @param root
	 * @return
	 */
	public List<List<Integer>> verticalOrder(TreeNode root) {
		if(root == null) {
			return null;
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		TreeMap<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
		Queue<Integer> keyQueue = new LinkedList<Integer>();
		Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();

		keyQueue.offer(0);
		nodeQueue.offer(root);

		while(!nodeQueue.isEmpty()) {
			TreeNode curNode = nodeQueue.poll();
			int key = keyQueue.poll();
			if(map.containsKey(key)) {
				List<Integer> list = map.get(key);
				list.add(curNode.val);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(curNode.val);
				map.put(key, list);
			}

			if(curNode.left != null) {
				nodeQueue.offer(curNode.left);
				keyQueue.offer(key - 1);
			} 
			if(curNode.right != null) {
				nodeQueue.offer(curNode.right);
				keyQueue.offer(key + 1);
			}
		}
		for(int i : map.keySet()) {
			result.add(map.get(i));
		}
		return result;
	}

	/**
	 * DFS
	 * @param root
	 * @return
	 */
	public List<List<Integer>> verticalOrder_DFS(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null) {
			return result;
		}
		TreeMap<Integer, ArrayList<LevelValue>> map = new TreeMap<Integer, ArrayList<LevelValue>>();
		dfs(root, map, 0, 0);
		for(int i : map.keySet()) {
			ArrayList<LevelValue> lvList = map.get(i);
			ArrayList<Integer> list = new ArrayList<Integer>();
			Collections.sort(lvList);
			for(LevelValue lv : lvList) {
				list.add(lv.value);
			}
			result.add(list);
		}
		return result;
	}

	public void dfs(TreeNode root, TreeMap<Integer, ArrayList<LevelValue>> map, int key, int level) {
		if(root == null) {
			return;
		}
		if(map.containsKey(key)) {
			ArrayList<LevelValue> curList = map.get(key);
			curList.add(new LevelValue(level, root.val));
		} else {
			ArrayList<LevelValue> curList = new ArrayList<LevelValue>();
			curList.add(new LevelValue(level, root.val));
			map.put(key, curList);
		}

		dfs(root.left, map, key - 1, level + 1);
		dfs(root.right, map, key + 1, level + 1);
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

}
