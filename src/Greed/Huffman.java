package Greed;

import java.util.PriorityQueue;

import Tree.BinaryTreeNode;

public class Huffman {
	public static BinaryTreeNode huffmanCoding(int[] a){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		BinaryTreeNode temp = null;
		for(int i = 0; i < a.length; i++){
			temp = new BinaryTreeNode();
			
			BinaryTreeNode left = new BinaryTreeNode();
			left.setData(Integer.parseInt((pq.poll().toString())));
			BinaryTreeNode right = new BinaryTreeNode();
			right.setData(Integer.parseInt(pq.poll().toString()));
			
			temp.setLeft(left);
			temp.setRight(right);
			temp.setData(left.getData() + right.getData());
			pq.add(temp.getData());
		}
		return temp;
	}
}
