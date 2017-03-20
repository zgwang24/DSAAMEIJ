package LinkedList;

public class FindMiddle {
	
	public static ListNode findMiddle(ListNode head){
		ListNode ptr1x = head, ptr2x = head;
		int i = 0;
		while(ptr1x.getNext() != null){
			if(i == 0){
				ptr1x = ptr1x.getNext();
				i = 1;
			}else if(i == 1){
				ptr1x = ptr1x.getNext();
				ptr2x = ptr2x.getNext();
				i = 0;
			}
		}
		return ptr2x;
	}
	
	public static void main(String[] args) {
		ListNode node1= new ListNode(1);
		ListNode node2= new ListNode(2);
		ListNode node3= new ListNode(3);
		ListNode node4= new ListNode(4);
		ListNode node5= new ListNode(5);
		ListNode node6= new ListNode(6);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		System.out.println(findMiddle(node1).getData());
	}

}
