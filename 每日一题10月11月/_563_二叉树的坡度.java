package 每日一题10月11月;

/**
 * https://leetcode-cn.com/problems/binary-tree-tilt/
 * @author swift
 *	思路：深度优先搜索
 */
public class _563_二叉树的坡度 {
	int res;
	public int findTilt(TreeNode root) {
        if(root == null) return 0;
        slope(root);
		return res;
    }
	
	int slope(TreeNode node) {
		if(node == null) return 0;
		int left = slope(node.left);
		int right = slope(node.right);
		res += Math.abs(left - right);
		return node.val + left + right;
	}
}
