package 链表;

import java.util.Scanner;

public class _206_反转一个链表 {
	
	private class ListNode{
		int val;
		ListNode next;
		public ListNode() {}
		public ListNode(int val) {
			this.val = val;
		}
		public ListNode(int val,ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	/**
	 * 功能函数 --迭代构造链表法
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = new ListNode();
		newHead = null;
		ListNode temp = new ListNode();
		while(head!=null) {
			temp = head;
			head = head.next;
			temp.next = newHead;
			newHead = temp;
		}
		return newHead;
	}
	
	/**
	 * 功能函数---递归法
	 * @param head
	 * @return
	 */
	public ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	/**
	 * 根据数组构造单链表  
	 * @param nums
	 * @return
	 */
	private ListNode structNode(int[] nums) {
		ListNode dummy = new ListNode(-1);
		ListNode preNode = dummy;
		for (int i = 0; i < nums.length; i++) {
			ListNode tempNode = new ListNode(nums[i]);
			preNode.next = tempNode;
			preNode = preNode.next;
		}
		return dummy.next;
	}
	/**
	 * 打印链表
	 * @param head
	 */
	static void printNode(ListNode head) {
		while(head!= null) {
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.print("Null");
	}
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			
			_206_反转一个链表 listNode = new _206_反转一个链表();
			ListNode result = listNode.reverseList2(listNode.structNode(nums));
			printNode(result);
		}
	}
}
