package LinkedList;

public class ReversePairRecursive {
	public static ListNode reversePairRecursive(ListNode head){	
		ListNode temp = null;
		if(head == null || head.getNext() == null){
			return head;
		}else{
			temp = head.getNext();
			
		}
		
		return head.getNext();
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
		ListNode head = reversePairRecursive(node1);
		/*while(head != null){
			System.out.println(head.getData());
			head = head.getNext();
		}*/
		System.out.println(head.getData());
	}
	
}
