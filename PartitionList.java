
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode p1 = l1;
		ListNode p2 = l2;
		
		p1.next = head;
		while(p1.next != null) {
			if(p1.next.val < x) {
				p1 = p1.next;
			} else {
				p2.next = p1.next;
				p2 = p2.next;
				p1.next = p1.next.next;
			}
		}
		p2.next = null;
		p1.next = l2.next;
		return l1.next;
	}

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

}
