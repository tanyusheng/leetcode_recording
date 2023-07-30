package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;
/*
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 * 思路：利用两个辅助栈，一个栈存储奇数层的数据，一个栈存储偶数层的数据。(利用栈先进后出的规律，刚好之字形)
 */
public class 按Z字形打印二叉树 {
	 public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		 ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
		 if(pRoot == null)	return arrayList;
		 
		 Stack<TreeNode> stack = new Stack<TreeNode>();
		 Stack<TreeNode> stack2 = new Stack<TreeNode>();
		 int layer = 1;
		 stack.push(pRoot);
		
		 while(!stack.isEmpty() || !stack2.isEmpty()) {		//stack判空条件不是null而是isEmpty()
			 ArrayList<Integer> temp = new ArrayList<Integer>();
			 while(layer % 2 == 1 && !stack.isEmpty()) {
				 TreeNode node = stack.pop();
				 if(node != null) {
					 temp.add(node.val);
					 stack2.push(node.left);
					 stack2.push(node.right);
				 } 
			 }
			
			 while(layer % 2 != 1 && !stack2.isEmpty()) {
				 TreeNode node = stack2.pop();
				 if(node != null) {
					 temp.add(node.val);
					 stack.push(node.right);
					 stack.push(node.left);
				 }
			 }
		
			 if(temp.size() != 0) {
				 arrayList.add(temp);
			 }
			 layer ++;
		 }
		 
		 return arrayList;
	 }
	
	 public static void main(String[] args) {
			TreeNode root1 = new TreeNode(1);
			root1.left = new TreeNode(2);
			root1.right = new TreeNode(3);
			root1.left.left = new TreeNode(4);
			root1.left.right = new TreeNode(5);
			root1.right.left = new TreeNode(6);
			root1.right.right = new TreeNode(7);
			
			TreeNode root2 = null;
			System.out.println(new 按Z字形打印二叉树().Print(root1));
	 }
	
}
