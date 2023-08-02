package 队列;

import java.util.Stack;



public class _232_用栈实现队列 {
	public static void main(String[] args) {
		_232_用栈实现队列 queue = new _232_用栈实现队列();
		queue.push(11);
		queue.push(22);
		queue.pop();
		queue.push(33);
		queue.pop();
		System.out.println(queue.peek());
	}
	
	private Stack<Integer> inStack;
	private Stack<Integer> outStack;
	/** Initialize your data structure here. */
    public _232_用栈实现队列() {
    	inStack = new Stack<>();
    	outStack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	inStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(!outStack.isEmpty()) {
    		return outStack.pop();
    	}else{
    		while(!inStack.isEmpty()) {
        		int temp = inStack.pop();
        		outStack.push(temp);
        	}
    		return outStack.pop();
    	}
    }
    
    /** Get the front element. */
    public int peek() {
    	if (outStack.isEmpty()) {
    		while(!inStack.isEmpty()) {
        		int temp = inStack.pop();
        		outStack.push(temp);
        	}
			return outStack.peek();
		}
    	return outStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return (outStack.isEmpty())&&(inStack.isEmpty());
    }
}
