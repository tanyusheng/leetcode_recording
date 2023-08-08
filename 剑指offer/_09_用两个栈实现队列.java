package 剑指offer;
import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * 注意事项：注意审题，当栈为空时，输出结果为-1
 * 
 */
public class _09_用两个栈实现队列 {
    public static void main(String[] args) {
        
    }
}

class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue(){
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void appendTail(int val){
        stack1.push(val);
    }

    public int deleteHead(){
        // 只有当2栈（负责输出的栈）为空输入栈不为空时，才进行搬运操作，否则直接从2出栈
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }
        return stack2.pop();
    }
}