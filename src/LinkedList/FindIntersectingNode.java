package LinkedList;

public class FindIntersectingNode {
	public static ListNode findIntersectingNode(ListNode list1, ListNode list2){
		int l1 = 0, l2 = 0, diff = 0;
		ListNode head1 = list1, head2 = list2;
		while(head1 != null){
			l1++;
			head1 = head1.getNext();
		}
		while(head2 != null){
			l2++;
			head2 = head2.getNext();
		}
		if(l1 < l2){
			diff = l2 - l1;
			head1 = list2;
			head2 = list1;
		}else{
			diff = l1 - l2;
			head1 = list1;
			head2 = list2;
		}
		for(int i = 0; i < diff; i++){
			head1 = head1.getNext();
		}
		while(head1 != null && head2 != null){
			if(head1 == head2){
				return head1;
			}
			head1 = head1.getNext();
			head2 = head2.getNext();
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		ListNode node8 = new ListNode(8);
		node1.setNext(node2);
		node3.setNext(node4);
		node2.setNext(node5);
		node4.setNext(node5);
		node5.setNext(node6);
		System.out.println(findIntersectingNode(node2, node3).getData());
	}
}
