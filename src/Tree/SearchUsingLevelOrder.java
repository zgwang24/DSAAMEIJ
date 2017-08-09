package Tree;

import sun.misc.Queue;

public class SearchUsingLevelOrder {
	public static boolean searchUsingLevelOrder(BinaryTreeNode root, int val) throws InterruptedException{
		BinaryTreeNode temp;
		Queue<BinaryTreeNode> q = new Queue<BinaryTreeNode>();
		if(root == null){
			return false;
		}
		q.enqueue(root);
		while(!q.isEmpty()){
			temp = q.dequeue();
			if(val == temp.getData()){
				return true;
			}
			if(temp.getLeft() != null){
				q.enqueue(temp.getLeft());
			}
			if(temp.getRight() != null){
				q.enqueue(temp.getRight());
			}
		}
		return false;
	}
	public static void main(String[] args) throws InterruptedException {
		BinaryTreeNode node0 = new BinaryTreeNode();
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		BinaryTreeNode node4 = new BinaryTreeNode();
		BinaryTreeNode node5 = new BinaryTreeNode();
		BinaryTreeNode node6 = new BinaryTreeNode();
		BinaryTreeNode node7 = new BinaryTreeNode();
		node0.setData(0);
		node1.setData(1);
		node2.setData(2);
		node3.setData(3);
		node4.setData(4);
		node5.setData(5);
		node6.setData(6);
		node7.setData(7);
		node0.setLeft(node1);
		node0.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node3.setLeft(node7);
		System.out.println(searchUsingLevelOrder(node0, 9));
	}
}
