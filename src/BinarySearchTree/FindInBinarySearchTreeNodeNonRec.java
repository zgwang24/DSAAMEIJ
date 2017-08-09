package BinarySearchTree;

public class FindInBinarySearchTreeNodeNonRec {
	public static BinarySearchTreeNode find(BinarySearchTreeNode root, int val){
		if(root == null){
			return null;
		}
		while(root != null){
			if(val == root.getData()){
				return root;
			}else if(val < root.getData()){
				root = root.getLeft();
			}else{
				root = root.getRight();
			}
		}
		return null;
	}
	public static void main(String[] args) {
		BinarySearchTreeNode node0 = new BinarySearchTreeNode();
		BinarySearchTreeNode node1 = new BinarySearchTreeNode();
		BinarySearchTreeNode node2 = new BinarySearchTreeNode();
		BinarySearchTreeNode node3 = new BinarySearchTreeNode();
		BinarySearchTreeNode node4 = new BinarySearchTreeNode();
		BinarySearchTreeNode node5 = new BinarySearchTreeNode();
		BinarySearchTreeNode node6 = new BinarySearchTreeNode();
		BinarySearchTreeNode node7 = new BinarySearchTreeNode();
		node0.setData(3);
		node1.setData(1);
		node2.setData(5);
		node3.setData(0);
		node4.setData(2);
		node5.setData(4);
		node6.setData(6);
		node7.setData(7);
		node0.setLeft(node1);
		node0.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node6.setRight(node7);
		System.out.println(find(node0, 12));
	}
}
