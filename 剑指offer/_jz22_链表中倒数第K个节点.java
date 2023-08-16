package 剑指offer;

/**
 *  url: https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 *  思路：使用快慢指针的思路
 */
public class _jz22_链表中倒数第K个节点 {
    public static void main(String[] args) {

    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        //定义一个虚拟头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 定义快慢指针
        ListNode fast = dummy;
        ListNode slow = dummy;
        // 快指针先走k步
        for(int i = 0; i < k+1 ; i++){
            fast = fast.next;
        }
        // 快慢指针开始同时走
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.next;
    }
}
