import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0) {
			return null;
		}
		ListNode dummy = new ListNode(0);
		ListNode lastNode = dummy;

		Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.length, new listNodeComparator());
		for(int i = 0; i < lists.length; i++) {
			if(lists[i] != null) {
				heap.offer(lists[i]);
			}
		}

		while(!heap.isEmpty()) {
			ListNode curNode = heap.poll();
			lastNode.next = curNode;
			lastNode = lastNode.next;
			if(curNode.next != null) {
				heap.offer(curNode.next);
			}
		}
		return dummy.next;

	}

	class listNodeComparator implements Comparator<ListNode>{
		@Override
		public int compare(ListNode l1, ListNode l2) {
			if(l1 == null) {
				return 1;
			}
			if(l2 == null) {
				return -1;
			}
			return l1.val - l2.val;
		}
	}
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
