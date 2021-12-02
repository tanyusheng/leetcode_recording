package 每日一题10月11月;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 * @author swift
 *	思路：DFS
 */
public class _559_N叉树的最大深度 {
	class Node{
		public int val;
		public List<Node> children;
		public Node() {}
		public Node(int _val) {
			this.val = _val;
		}
		public Node(int _val,List<Node> _children) {
			val = _val;
			children = _children;
		}
	}
	public int maxDepth(Node root) {
		if(root == null) return 0;
		int deepth = 0;
		for(Node i : root.children) {
			deepth = Math.max(deepth, maxDepth(i));
		}
		return deepth+1;
	}
	
	public static void main(String[] args) {
		// 如何根据数组构造多叉树处理输入输出
	}
}
