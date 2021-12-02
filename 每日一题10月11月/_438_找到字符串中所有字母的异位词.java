package 每日一题10月11月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 * @author swift
 * 思路：固定长度的滑动窗口，使用字符数组存储列表中存在的字符种类及次数。
 * 		滑动窗口调用Arrays.equals(A,B)比较两个数组是否相等。
 *
 */
public class _438_找到字符串中所有字母的异位词 {
	public static List<Integer> findAnagrams(String s, String p) {
		// 使用数组存储字符出现的次数与频率，使用Arrays.equals判断两个数组是否相等
		int pLen = p.length();
		int sLen = s.length();
		if(sLen < pLen) return new ArrayList<>();
		// 存储结果的list
		List<Integer> resList = new ArrayList<>();
		int[] sArray = new int[26];
		int[] pArray = new int[26];
		for(int i = 0; i < pLen; i++) {
			pArray[p.charAt(i) - 'a']++;
			sArray[s.charAt(i) - 'a']++;
		}
		if(Arrays.equals(pArray, sArray)){
			resList.add(0);
			
		}
		for (int i = 0; i < sLen - pLen; i++) {
			sArray[s.charAt(i) - 'a']--;
			sArray[s.charAt(i+pLen) - 'a']++;
			if(Arrays.equals(pArray, sArray)) {
				resList.add(i+1);
			}
		}
		return resList;
		
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String s = cinScanner.next();
			String p = cinScanner.next();
			List<Integer> list = findAnagrams(s, p);
			System.out.println(list.toString());
		}
	}
}
