package 每日一题;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 * @author swift
 *
 */
public class _434_字符串中的单词数 {
	public int countSegments(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if((i==0 || s.charAt(i-1)==' ' )&& s.charAt(i)!=' ') {
				count++;
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.nextLine();
			int count = new _434_字符串中的单词数().countSegments(str);
			System.out.println(count);
		}
	}
}
