package 栈;

import java.util.LinkedList;
import java.util.Queue;


public class _225_用队列实现栈 {
	private Queue<Integer> iQueue;
	private Queue<Integer> oQueue;
	/** Initialize your data structure here. */
    public _225_用队列实现栈() {
    	iQueue = new LinkedList<>();
    	oQueue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	iQueue.offer(x);
   
    	// 如果输出队列oQueue非空，将输出队列oQueue的值依次进入输入队列iQueue
    	while(!oQueue.isEmpty()) {
    		iQueue.offer(oQueue.poll());
    	}
    	
    	// 交换输入队列与输出队列
    	Queue<Integer> tempQueue = new LinkedList<>();
    	tempQueue = oQueue;
    	oQueue = iQueue;
    	iQueue = tempQueue;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	return oQueue.poll();
    }
    
    /** Get the top element. */
    public int top() {
    	return oQueue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return oQueue.isEmpty();
    }
}
