package 剑指offer;

/**
 * url:https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 * 思路：双指针，常规方法
 */

import java.util.Scanner;

public class _jz25_合并两个排序的链表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.nextLine();
            int[] arr1 = ListNode.parseArray(s1);
            String s2 = scanner.nextLine();
            int[] arr2 = ListNode.parseArray(s2);
            ListNode list1 = ListNode.array2LinkedList(arr1);
            ListNode list2 = ListNode.array2LinkedList(arr2);
            ListNode mergedList = mergeTwoLists(list1, list2);
            ListNode.printListNode(mergedList);
        }
        scanner.close();
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        // 创建一个虚拟头结点
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (l1!=null && l2!=null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 == null){
            cur.next = l2;
        }
        if(l2 == null){
            cur.next = l1;
        }
        return dummy.next;
    }
}
