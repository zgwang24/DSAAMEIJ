package LinkedList;

public class MergeList {
	public static ListNode mergeList(ListNode a, ListNode b){
		ListNode result = null;
		if(a == null){
			return b;
		}
		if(b == null){
			return a;
		}
		if(a.getData() <= b.getData()){
			result = a;
			result.setNext(mergeList(a.getNext(), b));
		}else{
			result = b;
			result.setNext(mergeList(a, b.getNext()));
		}
		return result;
	}
	public static void main(String[] args){
		ListNode a1= new ListNode(1);
		ListNode a2= new ListNode(2);
		ListNode a3= new ListNode(3);
		ListNode a4= new ListNode(4);
		ListNode a5= new ListNode(5);
		ListNode a6= new ListNode(6);
		a1.setNext(a2);
		a2.setNext(a3);
		a3.setNext(a4);
		a4.setNext(a5);
		a5.setNext(a6);
		ListNode b1= new ListNode(1);
		ListNode b2= new ListNode(2);
		ListNode b3= new ListNode(3);
		ListNode b4= new ListNode(4);
		ListNode b5= new ListNode(5);
		ListNode b6= new ListNode(6);
		b1.setNext(b2);
		b2.setNext(b3);
		b3.setNext(b4);
		b4.setNext(b5);
		b5.setNext(b6);
		ListNode head = mergeList(a1, b1);
		while(head != null){
			System.out.println(head.getData());
			head = head.getNext();
		}
	}
}
