package 数组;

/**
 * https://leetcode-cn.com/problems/reverse-integer/
 * @author swift
 *
 */
public class _7_整数反转 {
	public int reverse(int x) {
		if(x==0) {
			return 0;
		}
		
		//TODO
		return 0;
	}
	static char[] swap(char[] strs) {
		int left = 0;
		int right = strs.length-1;
		while(left<right) {
			char temp = strs[right];
			strs[right] = strs[left];
			strs[left] = temp;
			left++;
			right--;
		}
		return strs;
	}
}
