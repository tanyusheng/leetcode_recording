package 剑指offer;

/*  url：https://leetcode.cn/problems/dui-lie-de-zui-da-zhi-lcof
 *  思路：构建一个辅助的双端队列Deque，元素入队前，清除辅助队列中，前面比自己小的元素
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class _jz59_2_队列的最大值 {
    public static void main(String[] args) {

    }
    class MaxQueue{
        Queue<Integer> queue;
        Deque<Integer> deque;
        public MaxQueue(){
            queue = new LinkedList<>();
            deque = new LinkedList<>();
        }

        public int max_value(){
            if(deque.isEmpty()){
                return -1;
            }
            return deque.peek();
        }

        public void push_back(int value){
            queue.offer(value);
            while (!deque.isEmpty()&&deque.getLast() < value){
                deque.removeFirst();
            }
        }
        public int pop_front(){
            if(queue.isEmpty()){
                return -1;
            }
            Integer val = queue.peek();
            if(val.equals(deque.peek())){
                return deque.remove();
            }
            return queue.remove();
        }

    }




}
