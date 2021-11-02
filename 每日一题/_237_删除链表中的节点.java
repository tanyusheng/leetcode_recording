package 每日一题;

import java.awt.HeadlessException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @author swift
 *
 */
public class _237_删除链表中的节点 {
	/*
	 * 功能函数
	 */
	public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;    
    }
	
	/*
	 * 根据数组构造链表
	 */
	private static ListNode arrayToListNode(int[] nums) {
		ListNode dummy = new ListNode(-1);
		ListNode preNode = dummy;
		for (int i = 0; i < nums.length; i++) {
			ListNode tempNode = new ListNode(nums[i]);
			tempNode.next = preNode.next;
			preNode.next = tempNode;
			preNode = preNode.next;
		}
		return dummy.next;
	}
	
	/*
	 * 打印链表
	 */
	private static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			ListNode listNode = arrayToListNode(nums);
			deleteNode(listNode);
			printList(listNode);
		}
	}
}
