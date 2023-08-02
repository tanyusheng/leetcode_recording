package 每日一题12月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/consecutive-characters/
 * @author swift
 * 	思路：使用cur记录字符串中连续最长子串长度，
 * 			如果当前字符与下一个字符相等，cur加1，否则cur重设为1；
 * 			使用res存储遍历过程中的最长长度。
 */
public class _1446_连续字符 {
	public static int maxPower(String s) {
		int res = 1;
		int cur = 1;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				cur++;
			}else {
				cur = 1;
			}
			res = Math.max(res, cur);
		}
		return res;
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String s = cinScanner.next();
			int res = maxPower(s);
			System.out.println(res);
		}
		cinScanner.close();
	}
}
