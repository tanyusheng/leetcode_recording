package 每日一题;

import java.util.HashSet;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/buddy-strings/
 * @author swift
 *	思路：     1.如果字符长度不等，直接排除；
 *			2.两个字符串如果内容相同，但是不含有重复元素，说明无法交换顺序，故排除；
 *			3.同时对两个字符串进行遍历，记录第一次不相等的位置，再记录第二次不相等的位置。
 *				如果A字符串第1次不相等的位置的字符等于B字符第二次不相等的位置的字符，
 *				且A第2次不相等的位置的字符等于B第一次
 *				不相等位置的字符，则满足条件。（说明交换一次即可满足相等）；
 *				如果还有三次不相等的位置，则直接排除。
 */
public class _859_亲密字符串 {
	public static  boolean buddyStrings(String s, String goal) {
		// 特殊情况判断
		if(s.length() != goal.length()) return false;
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		if(s.equals(goal) && set.size()==goal.length()) {
			return false;
		}
		// 遍历找不同的字符的位置
		int first = 0;
		int second = 0;
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != goal.charAt(i)) {
				if(count == 2) return false;
				if(count == 1) second = i;
				if(count == 0) first = i;
				count++;
			}
		}
		
		// 判读结果
		if(s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first)) {
			return true;
		}
		return false;
    }
	
	public static void main(String[] args) {
		Scanner cScanner = new Scanner(System.in);
		while(cScanner.hasNext()) {
			String str1 = cScanner.next();
			String str2 = cScanner.next();
			System.out.println(buddyStrings(str1, str2));
		}
	}
}
