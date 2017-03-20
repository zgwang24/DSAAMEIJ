package LinkedList;
/**
 * 链表中倒数第N个节点？
 * @author zgwang
 * 1.蛮力法：时间复杂度O(n*n)，空间复杂度O(1)
 * 2.创建散列表：key为节点的位置，value为节点的地址
 * 3.先遍历一次确定链表的长度m，再次遍历找第m+1-n个节点
 * 4.仅用一次遍历，两个指针
 */
public class ReciprocalNNode {
	private static ListNode NthNodeFromEnd(ListNode head, int NthNode){
		ListNode pTemp = head, pNthNode = null;
		for(int i = 1; i < NthNode; i++){
			if(pTemp != null){
				pTemp = pTemp.getNext();
			}
		}
		while(pTemp != null){
			if(pNthNode == null){
				pNthNode = head;
			}else{
				pNthNode = pNthNode.getNext();
			}
			pTemp = pTemp.getNext();
		}
		if(pNthNode != null){
			return pNthNode;
		}
		return null;
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
		int res = NthNodeFromEnd(node1, 1).getData();
		System.out.println(res);
	}
}
