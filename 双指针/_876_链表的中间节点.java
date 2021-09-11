package 双指针;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @author swift
 *	核心代码没为题，自己用数组构造链表后，调用核心代码后报空指针异常。有空的时候再修复。
 */
public class _876_链表的中间节点 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < strs.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			
			ListNode head = null;//创建首节点
			ListNode resultListNode = structList(head, nums);
			printNode(resultListNode);
		}
	}
	
	/**
	 * 构建链表
	 * @param head
	 * @param nums
	 */
	public static ListNode structList(ListNode head,int[] nums) {
		ListNode dummy = new ListNode(-1);
		ListNode preNode = dummy;
		for (int i = 0; i < nums.length; i++) {
			ListNode curNode = new ListNode(nums[i]);
			preNode.next = curNode;
			preNode = preNode.next;
		}
		return dummy.next;
	}
	
	/**
	 * 打印链表
	 * @param head
	 */
	private static void printNode(ListNode head) {
		while(head!= null) {
			System.out.print(head.val+"->");
			head = head.next;
		}
		
	}
	
	static class ListNode{
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val){
			this.val = val;
		}
		ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;	
		}
	}
	
	/**
	 * 核心功能区代码
	 * @param head
	 * @return
	 */
	public static ListNode middle(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next.next!=null&&fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast.next!=null) {
			return slow.next;
		}else {
			return slow;
		}
	}
}
