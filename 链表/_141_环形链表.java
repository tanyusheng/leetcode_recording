package 链表;

public class _141_环形链表 {
	/**
	 * 快慢指针思想：
	 * 
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
		ListNode fast = head.next;	// 快指针
		ListNode slow = head;	// 慢指针
		if(head == null || head.next == null){
	        return false;
	    }
		
		while (fast != null && fast.next != null) {	// 防止空指针异常，fast与fast.next都不能为空
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * 暴力解法：
	 * 迭代10000次，如果链表的head.next不存在null，那就说明这个链表是有环的
	 * @param head
	 * @return
	 */
	public boolean hasCycle_1(ListNode head) {
	    int count = 0;
	    if(head == null || head.next == null){
	        return false;
	    }
	    while(count<=10000){
	        if(head.next != null){
	            head = head.next;
	            count++;
	        }else{
	            return false;
	        }           
	    }
	    return true;
	}
}
