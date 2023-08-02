package 双指针;

import java.util.Scanner;
 
/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @author swift
 *	--核心代码没为题，自己用数组构造链表后，调用核心代码后报空指针异常。有空的时候再修复。
 *	--已经修复。
 */
public class _876_链表的中间节点 {
	// 自定义一个ListNode类
		static class ListNode{
			int val;
			ListNode next;
			public ListNode() {
				
			}
			ListNode(int val){
				this.val = val;
			}
			ListNode(int val,ListNode next){
				this.val = val;
				this.next = next;
			}
		}
		/**
		 * 根据数组来构建一个链表
		 * @param nums
		 * @return
		 */
		private static ListNode buildLinkList(int[] nums) {
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
		 * 核心功能函数
		 * @param head
		 * @return
		 */
		public static ListNode middleNode(ListNode head) {
			// 如果只有一个节点，则直接返回
	        if(head.next == null) {
				return head;
			}
			ListNode slow = head;
			ListNode fast = head;
			while(fast.next.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
	            if(fast.next==null) {
					break;
				}
			}
			if(fast.next!=null) {
				return slow.next;
			}else {
				return slow;
			}
	    }
	 	
	 	/**
	 	 * 打印链表的方法
	 	 * @param head
	 	 */
		private static void printNode(ListNode head) {
			while(head != null) {
				System.out.print(head.val+"->");
				head = head.next;
			}
			System.out.print("Null");
		}
		
		public static void main(String[] args) {
			Scanner cin = new Scanner(System.in);
			while(cin.hasNext()) {
				String str = cin.next();
				String[] strs = str.split(",");
				int[] nums = new int[strs.length];
				for (int i = 0; i < nums.length; i++) {
					nums[i] = Integer.parseInt(strs[i]);
				}
				ListNode listNode = buildLinkList(nums);
				ListNode resultNode = middleNode(listNode);
				printNode(resultNode);
			}
			cin.close();
		}
}
