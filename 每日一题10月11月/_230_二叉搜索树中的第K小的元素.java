package 每日一题10月11月;


/**
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * @author swift
 *
 */
public class _230_二叉搜索树中的第K小的元素 {
	public int kthSmallest(TreeNode root, int k) {
		
		return 0;
    }
	
	private TreeNode createBt(int[] arr,int i) {
		TreeNode root = null;
		if(i > arr.length) {
			return null;
		}
		root = new TreeNode(arr[i]);
		root.left = createBt(arr, 2*i+1);
		root.right = createBt(arr, 2*i+2);
		return root;
	}
}
