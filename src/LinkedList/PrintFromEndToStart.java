package LinkedList;

public class PrintFromEndToStart {
	public static void printFromEndToStart(ListNode head){
		if(head == null){
			return ;
		}
		printFromEndToStart(head.getNext());
		System.out.println(head.getData());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		printFromEndToStart(node1);
	}

}
