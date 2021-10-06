package 二叉树;

/**
 * https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
 * @author swift
 *
 */
public class _116_填充每一个节点的下一个右侧节点指针 {
	public Node connect(Node root) {
		if(root == null) return root;
		connect(root,null);
		return root;
	}
	
	private void connect(Node root,Node node) {
		if(root != null) {
			root.next = node;
			connect(root.left,root.right);
			connect(root.right,root.next == null?null:root.next.left);
		}
	}
}
