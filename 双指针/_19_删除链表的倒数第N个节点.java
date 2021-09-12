package 双指针;

import java.util.Scanner;
/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/submissions/
 * @author swift
 *	思路:使用双指针法，为了指到倒数第n个节点，我们让快指针先走n步
 *	然后快慢指针都每次走一步，当快指针走到终点时，慢指针指向的便是待删除节点的上一个节点。
 */
public class _19_删除链表的倒数第N个节点 {
	static class ListNode{
		int val;
		ListNode next;
		public ListNode() {
		}
		public ListNode(int val) {
			this.val = val;
		}
		public ListNode(int val,ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	/**
	 * 根据数组构建链表
	 * @param nums
	 * @return
	 */
	private static ListNode structNode(int[] nums) {
		ListNode dummy = new ListNode(-1);
		ListNode preNode = dummy;
		for (int i = 0; i < nums.length; i++) {

			ListNode node = new ListNode(nums[i]);
			preNode.next = node;
			preNode = preNode.next;
		}
		return dummy.next;
	}
	
	/**
	 * 功能函数
	 * @param head
	 * @param n 这里的n是从1开始的
	 * @return
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null || head.next==null) {
			return null;
		}
		
		ListNode fast = head;
		ListNode slow = head;
		// 让快指针先走n步,如果n等于链表的长度，会报空指针异常，我们提前终止即可
		for (int i = 1; i <= n; i++) {
			fast = fast.next;
			// 如果快指针指出了链表，说明要删除链表首节点。
			if(fast==null) {
				return head.next;
			}
		}
		while(fast.next!=null) {
			fast = fast.next;
			slow = slow.next;
		}
		// 需要被删除节点的前一个节点为slow,删除它
		slow.next = slow.next.next;
		return head;	
    }
	/**
	 * 打印链表
	 * @param head
	 */
	private static void printNode(ListNode reslut) {
		ListNode head = reslut;
		while(head != null) {
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println("Null");
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = cin.next();
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		int n = cin.nextInt();
		ListNode list = structNode(nums);
		ListNode reslut = removeNthFromEnd(list, n);
		printNode(reslut);
		
	}
}
