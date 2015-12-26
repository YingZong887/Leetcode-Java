
public class SortList {
	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode mid = findMid(head);
		ListNode right = sortList(mid.next);
		mid.next = null;
		ListNode left = sortList(head);
		return merge(left,right);
		
	}
	private ListNode merge(ListNode left, ListNode right) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while(left != null & right != null) {
			if(left.val > right.val) {
				tail.next = right;
				right = right.next;
			} else {
				tail.next = left;
				left = left.next;
			}
			tail = tail.next;
		}
		if(right != null) {
			tail.next = right;
		} else {
			tail.next = left;
		}
		return dummy.next;
	}
	
	private ListNode findMid(ListNode root) {
		ListNode slow = root;
		ListNode fast = root.next;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
