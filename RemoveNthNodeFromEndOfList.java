
public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null || head.next == null){
			return null;
		}
		ListNode a = head;
		ListNode b = head;
		int count = 0;
		while(b != null){
			b = b.next;
			count++;
		}
		if(count == n){
			return head.next;
		}
		b = head;
		for(int i = 0; i < n; i++){
			b = b.next;
		}
		while(b.next != null){
			b = b.next;
			a = a.next;
		}
		a.next = a.next.next;
		return head;

	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
