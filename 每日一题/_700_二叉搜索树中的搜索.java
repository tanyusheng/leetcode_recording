package 每日一题;

/**
 * https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 * @author swift
 *	思路：递归
 */
public class _700_二叉搜索树中的搜索 {
	public TreeNode searchBST(TreeNode root, int val) {
		if(root == null) return null;
		if(root.val > val) return searchBST(root.left, val);
		else if(root.val < val) return searchBST(root.right, val);
		else{
			return root;
		}
    }
	
	private TreeNode numsToTree(int[] nums,int i) {
		TreeNode root = null;
		if(i >= nums.length) {
			return null;
		}
		root = new TreeNode(nums[i]);
		root.left = numsToTree(nums, 2*i+1);
		root.right = numsToTree(nums, 2*i+2);
		return root;
	}
}
