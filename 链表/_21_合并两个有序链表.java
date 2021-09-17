package 链表;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author swift
 *
 */
public class _21_合并两个有序链表 {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) {
			return l2;
		}else if(l2 == null) {
			return l1;
		}else if(l1.val<=l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
		
    }
	
	public static void printNode(ListNode head) {
		while(head!=null) {
			System.out.print(head.val+"->");
			head = head.next;
		}
		System.out.println("null");
	}
	
	public static ListNode structNode(int[] nums) {
		ListNode dummyNode = new ListNode(-1);
		ListNode preNode = dummyNode;
		for (int i = 0; i < nums.length; i++) {
			ListNode tempNode = new ListNode(nums[i]);
			preNode.next = tempNode;
			preNode = preNode.next;
		}
		return dummyNode.next;
	}
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNextLine()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			String str1 = cinScanner.next();
			String[] strs1 = str1.split(",");
			int[] nums1 = new int[strs1.length];
			
			for (int i = 0; i < nums1.length; i++) {
				nums1[i] = Integer.parseInt(strs1[i]);
			}
			
			ListNode list = structNode(nums);
			ListNode list1 = structNode(nums1);
			ListNode result = mergeTwoLists(list,list1);
			printNode(result);
		}
	}
}
