package 二叉树;
/**
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/submissions/
 * @author swift
 *
 */


import java.util.ArrayList;
import java.util.List;




public class _144_二叉树的前序遍历 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode() {
			// TODO Auto-generated constructor stub
		}
		public TreeNode(int val) {
			this.val = val;
		}
		public TreeNode(int val,TreeNode left,TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	/**
	 * 使用递归的方式前序遍历
	 */
	List<Integer> res = new ArrayList<>();
	public List<Integer> preorderTraversal(TreeNode root){
		if(root == null) {
			return res;
		}else {
			res.add(root.val);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		return res;
	}
	
}
