package 滑动窗口;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @author swift
 * 	思路: 滑动窗口
 *
 */
public class _3_无重复字符的最长子串 {
	public int lengthOfLongestSubstring(String s) {
		int left = 0;
		int right = 1;
		while(right<=s.length()) {
			if(s.charAt(left)!=s.charAt(right)) {
				right++;
			}
		}
		return 0;
    }
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			String str = cin.next();
			System.out.println(str);
		}
		
	}
}
