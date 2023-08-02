package 滑动窗口;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @author swift
 * 	思路: 滑动窗口
 *
 */
public class _3_无重复字符的最长子串 {
	
	public static int lengthOfLongestSubstring(String s) {
		if(s.length() == 0) {
			return 0;
		}
		int right = 0;
		int left = 0;
		int res = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while(right<s.length()) {
			char c = s.charAt(right);
			right++;
			map.put(c, map.getOrDefault(c, 0)+1);
			while(map.get(c)>1) {
				char d = s.charAt(left);
				left++;
				map.put(d, map.get(d)-1);
			}
			res = Math.max(res,right-left);
		}
		return res;
	}
	
	
	public int lengthOfLongestSubstring2(String s) {
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
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			int result = lengthOfLongestSubstring(str);
			System.out.println(result);
		}
		cinScanner.close();
	}
}
