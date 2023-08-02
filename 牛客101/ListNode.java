package 牛客101;

public class ListNode {
    int val;
    ListNode next;
    // 定义无参的构造方法
    ListNode(){
        
    }
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
