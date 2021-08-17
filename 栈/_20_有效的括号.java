package 栈;

import java.util.Stack;

public class _20_有效的括号 {
	// 方法1
	public boolean isValid1(String s) {
		while(s.contains("{}")||s.contains("[]")||s.contains("()")) {
			s = s.replace("{}", "");
			s = s.replace("[]", "");
			s = s.replace("()", "");
		}
		return s.isEmpty();
    }
	
	// 方法2
	/**
	 * https://leetcode-cn.com/problems/valid-parentheses/
	 * @author swift
	 *	思路：
	 *	遇见左字符，将左字符入栈；
	 *	遇见右字符，如果栈为空， 无效；
	 *				如果栈不空，栈顶字符出栈与右字符匹配。
	 *					如果匹配不上，说明无效；
	 *					如果匹配上了，继续扫描下一个字符
	 *	扫描完毕：栈空：有效；
	 *			栈非空：无效
	 */

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if(c=='('||c=='['||c=='{') {
				stack.push(c);
			}else {	//因为只包含左右括号，能来这里说明只能是右括号
				if (stack.isEmpty()) {
					return false;
				}else {
					char left = stack.pop();
					if(left=='('&& c!=')') return false;
					if(left=='{'&& c!='}') return false;
					if(left=='['&& c!=']') return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("[]][]{}()"));
	}
}
