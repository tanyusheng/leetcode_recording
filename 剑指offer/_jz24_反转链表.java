package 剑指offer;

import java.util.Scanner;

public class _jz24_反转链表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strings = str.split(",");
        int len = strings.length;
        int[] arr = new int[len];
        for(int i = 0 ; i < len; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }
        // 构造链表
        ListNode listNode = ListNode.array2LinkedList(arr);
        ListNode.printListNode(reverseList2(listNode));
        scanner.close();
    }

    // 递归法
    public static ListNode reverseList(ListNode head){
        // 处理特殊情况
        while (head == null || head.next == null){
            return head;
        }
        ListNode current = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return current;
    }

    // 双指针法
    public static ListNode reverseList2(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
