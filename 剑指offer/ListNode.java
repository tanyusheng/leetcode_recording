package 剑指offer;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    //将输入的字符串转为整形数组
    public static int[] parseArray(String input){
        String[] parts = input.split(",");
        int[] array = new int[parts.length];
        for(int i = 0; i < parts.length; i++){
            array[i] = Integer.parseInt(parts[i].trim());
        }
        return array;
    }

    //将数组构造成链表
    public static ListNode array2LinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // 打印链表
    public static void printListNode(ListNode head) {
        while (head != null) {
            if (head.next == null) {
                System.out.print(head.val);
            } else {
                System.out.print(head.val + "->");
            }
            head = head.next;
        }

    }
}
