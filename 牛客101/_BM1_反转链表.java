package 牛客101;

/**
 *  BM1 反转链表
 *  思路：递归法
 *  参考题解：https://www.bilibili.com/video/BV1bg4y1s7vS
 *  
 */
public class _BM1_反转链表 {
    // 定义解题方法
    public ListNode ReverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
