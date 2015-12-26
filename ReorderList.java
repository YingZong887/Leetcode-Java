
public class ReorderList {
	public void reorderList(ListNode head) {
		if(head == null || head.next == null) {
			return;
		}
		ListNode mid = findMid(head);
		ListNode head2 = reverse(mid.next);
		mid.next = null;
		merge(head,head2);
	}

	private void merge(ListNode head1, ListNode head2) {
		int index = 0;
		ListNode dummy = new ListNode(0);
		while (head1 != null && head2 != null) {
			if (index % 2 == 0) {
				dummy.next = head1;
				head1 = head1.next;
			} else {
				dummy.next = head2;
				head2 = head2.next;
			}
			dummy = dummy.next;
			index ++;
		}
		if (head1 != null) {
			dummy.next = head1;
		} else {
			dummy.next = head2;
		}
	}

	private ListNode reverse(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode pre = null;
		while(head != null) {
			ListNode temp = head.next;
			head.next = pre;
			pre = head;
			head = temp;
		}
		return pre;
	}

	private ListNode findMid(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
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
