package com.zgwang.l2.tree;

import sun.misc.Queue;

public class Traverse {
	public static void preOrder(BinaryTreeNode root){
		if(root != null){
			System.out.print(root.getData() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	public static void midOrder(BinaryTreeNode root){
		if(root != null){
			midOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			midOrder(root.getRight());
		}
	}
	public static void postOrder(BinaryTreeNode root){
		if(root != null){
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
		}
	}
	public static void levelOrder(BinaryTreeNode root) throws Exception{
		Queue<BinaryTreeNode> q = new Queue<BinaryTreeNode>();
		q.enqueue(root);
		while(!q.isEmpty()){
			BinaryTreeNode temp = q.dequeue();
			System.out.print(temp.getData() + " ");
			if(temp.getLeft() != null){
				q.enqueue(temp.getLeft());
			}
			if(temp.getRight() != null){
				q.enqueue(temp.getRight());
			}
			
		}
	}
	public static void main(String[] args) throws Exception {
		BinaryTreeNode n1 = new BinaryTreeNode(1);
		BinaryTreeNode n2 = new BinaryTreeNode(2);
		BinaryTreeNode n3 = new BinaryTreeNode(3);
		BinaryTreeNode n4 = new BinaryTreeNode(4);
		BinaryTreeNode n5 = new BinaryTreeNode(5);
		BinaryTreeNode n6 = new BinaryTreeNode(6);
		BinaryTreeNode n7 = new BinaryTreeNode(7);
		BinaryTreeNode n = null;
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
		// preOrder(n1);
		// midOrder(n1);
		// postOrder(n);
		levelOrder(n1);
 	}
}
