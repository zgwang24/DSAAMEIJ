package Tree;

import java.util.Stack;

public class InOrderNonPre {
	public static void inOrderNonPre(BinaryTreeNode root){
		if(null == root){
			return ;
		}
		Stack s = new Stack();
		while(true){
			while(null != root){
				s.push(root);
				root = root.getLeft();
			}
			if(s.isEmpty()){
				break;
			}
			root = (BinaryTreeNode) s.pop();
			System.out.println(root.getData());
			root = root.getRight();
		}
	}
}
