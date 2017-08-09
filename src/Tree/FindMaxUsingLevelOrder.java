package Tree;

import sun.misc.Queue;

public class FindMaxUsingLevelOrder {
	public static int findMaxUsingLevelOrder(BinaryTreeNode root) throws InterruptedException{
		BinaryTreeNode temp;
		int max = 0;
		Queue<BinaryTreeNode> q = new Queue<BinaryTreeNode>();
		q.enqueue(root);
		while(!q.isEmpty()){
			temp = q.dequeue();
			if(temp.getData() > max){
				max = temp.getData();
			}
			if(temp.getLeft() != null){
				q.enqueue(temp.getLeft());
			}
			if(temp.getRight() != null){
				q.enqueue(temp.getRight());
			}
		}
		return max;
	}
}
