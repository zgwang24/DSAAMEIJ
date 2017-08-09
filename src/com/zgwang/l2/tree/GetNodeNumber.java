package com.zgwang.l2.tree;

public class GetNodeNumber {
	public static int getNodeNumber(BinaryTreeNode root){
		if(root == null){
			return 0;
		}else{
			return (getNodeNumber(root.getLeft()) + 1 + getNodeNumber(root.getRight()));
		}
	}
	public static void main(String[] args) {
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n7 = new BinaryTreeNode(7);
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
		System.out.println(getNodeNumber(n1));
	}
}
