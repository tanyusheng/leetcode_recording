package 剑指offer;

import java.util.Scanner;

/**
 * url:https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof
 * 思路：常规指针删除
 */
public class _jz18_删除链表中的节点 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int val = scanner.nextInt();
            String[] strs = str.split(",");
            int len = strs.length;
            int[] arr = new int[len];
            for(int i = 0 ; i < len; i++){
                arr[i] = Integer.parseInt(strs[i]);
            }
            ListNode listNode = ListNode.array2LinkedList(arr);
            ListNode resList = deleteNode(listNode, val);
            ListNode.printListNode(resList);
        }
        scanner.close();
    }
    public static ListNode deleteNode(ListNode head, int val){
        if(head == null){
            return head;
        }
        if(head.val == val){
            return head.next;
        }
        ListNode cur = head;
        while (cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
                break;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
