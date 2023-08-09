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
	
	// 滑动窗口方案
	public static int lengthOfLongestSubstring2(String s) {
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
				char c_s = s.charAt(start);
				set.remove(c_s);
				start++;
			}else {
				set.add(c_e);
				max = Math.max(max, set.size());
				end++;
			}
		}
		return max;
    }
	
	// 滑动窗口方法
	public static int lengthOfLongestSubstring3(String s){
		if(s.length() == 0){
			return 0;
		}
		// 定义左右指针，通过滑动可变长度的窗口实现
		int left = 0;
		int right = 0;
		int maxLenghtSubString = 0;
		// 定义一个哈希集合防止检查元素重复性
		HashSet<Character> set = new HashSet<>();
		while(left < s.length() && right < s.length()){
			if(set.contains(s.charAt(right))){
				set.remove(s.charAt(left));
				left++;
			}else{
				set.add(s.charAt(right));
				right++;
				int currentLength = right - left;
				maxLenghtSubString = Math.max(currentLength,maxLenghtSubString);
			}
		}
		return maxLenghtSubString;
	}
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			int result = lengthOfLongestSubstring3(str);
			System.out.println(result);
		}
		cinScanner.close();
	}
}
