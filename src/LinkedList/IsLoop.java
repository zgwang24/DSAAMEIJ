package LinkedList;
/**
 * 1.Floyd环判定算法，判断链表中是否有环。
 * 2.确定环起点
 * 3.确定环的长度
 * 4.有序链表中插入新节点
 * @author zgwang
 * 
 */
public class IsLoop {
	public static boolean DoesLinkedListContainsLoop(ListNode head){
		if(head == null){
			return false;
		}
		ListNode fastPtr = head,slowPtr = head;
		while(fastPtr.getNext() != null && slowPtr.getNext() != null){
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr){
				return true;
			}
		}
		return false;
	}
	public static int FindBeginOfLoop(ListNode head){
		ListNode slowPtr = head, fastPtr = head;
		boolean loopExists = false;
		if(head == null){
			return -1;
		}
		while(slowPtr.getNext() != null && fastPtr.getNext().getNext() != null){
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr){
				loopExists = true;
				break;
			}
		}
		if(loopExists){
			slowPtr = head;
			while(slowPtr != fastPtr){
				slowPtr = slowPtr.getNext();
				fastPtr = fastPtr.getNext();
			}
			return slowPtr.getData();
		}
		return -1;
	}
	public static int FindLoopLength(ListNode head){
		ListNode slowPtr = head, fastPtr = head;
		boolean loopExists = false;
		int count = 0;
		if(head == null){
			return 0;
		}
		while(slowPtr.getNext() != null && fastPtr.getNext() != null){
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
			if(slowPtr == fastPtr){
				loopExists = true;
				break;
			}
		}
		if(loopExists){
			fastPtr = fastPtr.getNext();
			count++;
			while(slowPtr != fastPtr){
				fastPtr = fastPtr.getNext();
				count++;
			}
			return count;
		}
		return 0;
	}
	public static ListNode insertSortedList(ListNode head, ListNode newNode){
		ListNode current = head, temp = null;
		if(head == null){
			return newNode;
		}
		while(current != null && current.getData() < newNode.getData()){
			temp = current;
			current = current.getNext();
		}
		newNode.setNext(current);
		temp.setNext(newNode);
		return head;
	}
	public static ListNode ReverseList(ListNode head){
		ListNode temp = null, nextNode = null;
		while(head != null){
			nextNode = head.getNext();
			head.setNext(temp);
			temp = head;
			head = nextNode;
		}
		return temp;
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
		// node6.setNext(node1);
		// System.out.println(DoesLinkedListContainsLoop(node1));
		// System.out.println(FindBeginOfLoop(node1));
		// System.out.println(FindLoopLength(node1));
		// ListNode newNode = new ListNode(2);
		// ListNode newHead = insertSortedList(node1, newNode);	
		/*while(node1.hasNext()){
			System.out.println(node1.getData() + " ");
			node1 = node1.getNext();
		}*/
		ListNode newNode = ReverseList(node1);
		while(newNode.hasNext()){
			System.out.println(newNode.getData());
			newNode = newNode.getNext();
		}
		System.out.println(newNode.getData());
	}
}
