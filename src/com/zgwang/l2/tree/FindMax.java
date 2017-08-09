package com.zgwang.l2.tree;

public class FindMax {
	public static int findMax(BinaryTreeNode root){
		int max = 0;
		if(root != null){
			int rootVal = root.getData();
			int leftVal = findMax(root.getLeft());
			int rightVal = findMax(root.getRight());
			max = Math.max(Math.max(rootVal, leftVal), rightVal);
		}
		return max;
	}
	public static boolean findTarget(BinaryTreeNode root, int target){
		if(root == null){
			return false;
		}else{
			if(root.getData() == target){
				return true;
			}else{
				if(findTarget(root.getLeft(), target)){
					return true;
				}else{
					return findTarget(root.getRight(), target);
				}		
			}
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
		BinaryTreeNode n = null;
		n1.setLeft(n2);
		n1.setRight(n3);
		n2.setLeft(n4);
		n2.setRight(n5);
		n3.setLeft(n6);
		n3.setRight(n7);
		System.out.println(findTarget(n1, 8));
	}
}
