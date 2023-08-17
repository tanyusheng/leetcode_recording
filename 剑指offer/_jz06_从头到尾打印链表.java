package 剑指offer;

/**
 * url:https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
 * 思路：方法一：利用栈
 *      方法二：先计算链表的长度，然后在根据数组下标逆序打印
 */

import java.util.Scanner;
import java.util.Stack;



public class _jz06_从头到尾打印链表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] strs = str.split(",");
            int[] input = new int[strs.length];
            for(int i =0; i < strs.length; i++){
                input[i] = Integer.parseInt(strs[i]);
            }
            ListNode list = ListNode.array2LinkedList(input);
            int[] res = reversePrint2(list);
            for(int i : res){
                System.out.print(i+",");
            }
            System.out.println(" ");
        }
        scanner.close();
    }


    public static int[] reversePrint(ListNode head) {
        if(head == null){
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();

        // 将链表中的元素入栈
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        int stackSize = stack.size();
        int[] res = new int[stackSize];
        for (int i = 0; i < stackSize; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    /**
     * 常规数组法
     * @param head
     * @return
     */
    public static int[] reversePrint2(ListNode head) {
        //获取链表的长度
        int length = 0;
        ListNode current = head;
        while (current != null){
            length++;
            current = current.next;
        }
        // 重新开始
        current = head;
        int[] res = new int[length];
        for(int i = length -1 ; i >= 0; i--){
            res[i] = current.val;
            current = current.next;
        }
        return  res;
    }
}
