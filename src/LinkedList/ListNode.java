/**
 * @author zgwang
 *
 */
package LinkedList;

public class ListNode{
	private int data;
	private ListNode next;
	
	public ListNode(int data){
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public boolean hasNext(){
		if(next != null){
			return true;
		}else{
			return false;
		}
	}
}