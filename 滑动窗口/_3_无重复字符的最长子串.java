package 滑动窗口;

import java.util.HashSet;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @author swift
 * 	思路: 滑动窗口
 *
 */
public class _3_无重复字符的最长子串 {
	public int lengthOfLongestSubstring(String s) {
		if(s.isEmpty()) {
			return 0;
		}
		
		HashSet<Character> set = new HashSet<>();
		int max=1; // 无重复字符串长度初始值
		int start = 0;
		int end = 0;
		while(end < s.length()) {
			char c_e = s.charAt(end);
			if (set.contains(c_e)) {
				set.remove(start);
				start++;
			}else {
				set.add(c_e);
				max = Math.max(max, set.size());
				end++;
			}
		}
		
		return max;
    }
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			String str = cin.next();
			System.out.println(str);
		}
		
	}
}
