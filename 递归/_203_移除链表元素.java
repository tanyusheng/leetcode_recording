package 递归;

import java.util.Scanner;

public class _203_移除链表元素 {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
//	public ListNode removeElements(ListNode head, int val) {
//        ListNode dummyNode = new ListNode(0);
//        dummyNode.next = head;
//        ListNode prev = dummyNode;
//        while(head.next!=null) {
//        	
//        }
//    }
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a,b;
		while(cin.hasNextInt()) {
			a = cin.nextInt();
			b = cin.nextInt();
			System.out.println(a+b);
		}
		cin.close();
	}
}
