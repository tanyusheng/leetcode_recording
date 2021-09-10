package 双指针;

/**
 * https://leetcode-cn.com/problems/reverse-string/
 * @author swift
 *
 */
public class _344_反转字符串 {
	public void reverseString(char[] s) {
		int left = 0;
		int right = s.length-1;
		if(s.length<=1) {
			return;
		}
		while(left<right) {
			char temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			left++;
			right--;
		}
    }
}
