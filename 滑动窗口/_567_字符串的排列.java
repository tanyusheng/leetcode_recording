package 滑动窗口;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/permutation-in-string/
 * @author swift
 *	思路：滑动窗口思想，窗口长度固定。使用hashmap.equals()方法判断两个哈希表是否相等。
 *	从而判断s2中是否含有s1中的排列。
 */
public class _567_字符串的排列 {
	public static boolean checkInclusion(String s1, String s2) {
		int lenS1 = s1.length();
		int lenS2 = s2.length();
		// 如果S1比S2长，直接排除。
		if (lenS1>lenS2) {
			return false;
		}
		HashMap<Character, Integer> need = new HashMap<Character, Integer>();
		HashMap<Character, Integer> window = new HashMap<Character, Integer>();
		// 把需要匹配的子串存入need表中
		for (int i = 0; i < lenS1; i++) {
			need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i), 0)+1);
		}
		// 取lenS1长度的窗口大小，通过滑动窗口判断是否存在子串
		int index = 0;
		for(int i=0;i<lenS1;i++,index++) {
			window.put(s2.charAt(i),window.getOrDefault(s2.charAt(i), 0)+1);
		}
		
		// 窗口开始向右滑动
		while(index<lenS2) {
			if(need.equals(window)) {
				return true;
			}
			char before = s2.charAt(index-lenS1);
			char after = s2.charAt(index);
			// 窗口左边缩减一个
			window.put(before,window.get(before)-1);
			// 由于要判断哈希表是否相等，如果存在字符数为0的情况，则删除这个键值对。
			if(window.get(before) == 0) {
				window.remove(before);
			}
			// 窗口右边增加一个字符
			window.put(after,window.getOrDefault(after, 0)+1);
			
		}
		return need.equals(window);
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String s1 = cinScanner.next();
			String s2 = cinScanner.next();
			System.out.println(checkInclusion(s1, s2));
		}
	}
}
