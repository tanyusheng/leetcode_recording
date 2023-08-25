package 剑指offer;

import java.util.Stack;

/*
 * url:https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof
 * 思路：用两个栈实现，Stack2，存储进入Stack1的最小值
 * 难点：要考虑空栈异常的情况，解决方案是如果进入的元素不是最小元素，Stack2同时进一个
 * 自身的栈顶元素；
 */
public class _jz30_包含min函数的栈 {
    public static void main(String[] args) {

    }
}

class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()){
           stack2.push(x);
        }else {
            if(stack2.peek() >= x){
                stack2.push(x);
            }else {
                stack2.push(stack2.peek());
            }
        }
    }

    public void pop() {
        stack2.pop();
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}