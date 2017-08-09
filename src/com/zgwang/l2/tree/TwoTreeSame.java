package com.zgwang.l2.tree;

public class TwoTreeSame {
	public static boolean same(BinaryTreeNode root1, BinaryTreeNode root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1 == null || root2 == null){
			return false;
		}
		if(root1.getData() == root2.getData() && same(root1.getLeft(), root2.getLeft())
				&& same(root1.getRight(), root2.getRight())){
			return true;
		}else{
			return false;
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
		System.out.print(same(n1, n3));
	}
}
