public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(head == null) {
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;
		for(int i = 0; i < m-1; i++) {
			head = head.next;
		}
		ListNode premNode = head;
		ListNode mNode = head.next;
		ListNode nNode = mNode;
		ListNode postnNode = nNode.next;
		
		for(int i = m; i < n; i++) {
			ListNode temp = postnNode.next;
			postnNode.next = nNode;
            nNode = postnNode;
            postnNode = temp;
		}
		mNode.next = postnNode;
        premNode.next = nNode;
		return dummy.next;
	}
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
