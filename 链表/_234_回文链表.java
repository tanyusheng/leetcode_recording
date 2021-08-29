package 链表;
import java.util.*;
/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 * @author swift
 *	思路：1.使用快慢指针找到中间节点
 *		  2.找到中间节点后，将后半部分进行反转
 *		  3.然后分别从头部和中间进行遍历比较，全部相同返回true,如果有不同返回false
 */
public class _234_回文链表 {
	
	public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
        	return true;
        }
        ListNode middle = findmiddle(head);
        ListNode compare = reverse(middle.next);
        return compare(head, compare);
    }
	
	// 定义一个findmiddle方法，找到链表的中间节点
	private ListNode findmiddle(ListNode head) {
		
        ListNode fast = head;	// 快节点
        ListNode slow = head;	// 慢节点
        
        while (fast.next != null && fast.next.next != null) {
        	fast = fast.next.next; // 快节点每次走两步
            slow = slow.next;	// 慢节点每次走一步
		}
        return slow;
	}
	// 定义一个方法reverse，反转链表
	private ListNode reverse(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode newhead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newhead;
	}
	// 定义一个compare方法，对链表的的值进行比较
	private boolean compare(ListNode node1,ListNode node2) {
		while(node2 != null) {
			if(node1.val != node2.val) {
				return false;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		return true;
	}
}
