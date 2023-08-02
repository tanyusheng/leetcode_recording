package 链表;
/**
 * 来源：https://leetcode.cn/problems/reverse-linked-list/
 * 说明：为了以ACM模式运行代码，这里做了以下工作：
 * 	（1）定义了单链表类ListNode；
 * 	（2）通过Scanner实现了控制台输入数据的读取并保存在数组中；
 * 	（3）实现了构造链表的方法，将数组构造成单链表；
 * 	（4）实现了链表中数据的打印方法；
 */

import java.util.Scanner;

public class _206_反转一个链表 {
	
	// private class ListNode{
	// 	int val;
	// 	ListNode next;
	// 	public ListNode() {}
	// 	public ListNode(int val) {
	// 		this.val = val;
	// 	}
	// 	public ListNode(int val,ListNode next) {
	// 		this.val = val;
	// 		this.next = next;
	// 	}
	// }
	
	/**
	 * 功能函数1 --迭代构造链表法
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
	 * 功能函数2---递归法
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
	 * 定义一个根据数组构造单链表的方法structNode  
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
	 * 定义打印链表内容的方法printNode
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
		// 实现输入流读取控制台信息，调用主要方法实现输出结果的呈现
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
		// 关闭io资源，避免资源泄露
		cinScanner.close();
	}
}
