package 二叉树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 * https://leetcode-cn.com/problems/merge-two-binary-trees/
 * @author swift
 *	思路：递归
 */
public class _617_合并二叉树 {
	public TreeNode mergeTrees(TreeNode root1,TreeNode root2) {
		// 递归基(边界判断)
		if(root1 == null && root2 == null) return null;
		if(root1 == null) return root2;
		if(root2 == null) return root1;
		TreeNode newNode = new TreeNode(root1.val + root2.val);
		newNode.left = mergeTrees(root1.left, root2.left);
		newNode.right = mergeTrees(root1.right, root2.right);
		return newNode;
	}
	
	// 根据数组构建二叉树
	public TreeNode createBT(int[] arr,int i) {
		TreeNode root = null;
		if(i>=arr.length) return null;
		
		root = new TreeNode(arr[i]);
		root.left = createBT(arr, 2*i+1);
		root.right = createBT(arr, 2*i+2);
		return root;
	}
	
	// 层序遍历二叉树
	public static void levelOrderTraversal(TreeNode root) {
		if(root == null) return;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if(node.val<-1000000) {
				System.out.print("NUll ");
			}else {
				System.out.print(node.val+" ");
			}
			
			if(node.left!= null) {
				queue.offer(node.left);
			}
			if (node.right!=null) {
				queue.offer(node.right);
			}
		}
	}
	// 处理二叉树的输入输出
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str1 = cinScanner.next();
			String[] strs1 = str1.replace("[", "").replace("]", "").split(",");
			int[] nums1 = new int[strs1.length];
			for (int i = 0; i < nums1.length; i++) {
				try {
					nums1[i] = Integer.parseInt(strs1[i]);
				} catch (Exception e) {
					// TODO: handle exception
					nums1[i] = Integer.MIN_VALUE;
				}
				
			}
			String str2 = cinScanner.next();
			String[] strs2 = str2.replace("[", "").replace("]", "").split(",");
			int[] nums2 = new int[strs2.length];
			for (int i = 0; i < nums2.length; i++) {
				try {
					nums2[i] = Integer.parseInt(strs2[i]);
				} catch (Exception e) {
					// TODO: handle exception
					nums2[i] = Integer.MIN_VALUE;
				}
			}
			TreeNode tree1 = new _617_合并二叉树().createBT(nums1, 0);
			TreeNode tree2 = new _617_合并二叉树().createBT(nums2, 0);
			TreeNode resulTreeNode = new _617_合并二叉树().mergeTrees(tree1, tree2);
			levelOrderTraversal(resulTreeNode);
		}
		cinScanner.close();
	}
}
