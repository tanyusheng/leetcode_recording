package 每日一题12月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/repeated-string-match/
 * @author swift
 * 鸽，鸽
 * 
 */
public class _686_重复叠加字符串匹配 {
	public static int repeatedStringMatch(String a, String b) {
		boolean[]set = new boolean[26];
        for (char ch : a.toCharArray()) {
            set[ch - 'a'] = true;
        }
        for (char ch : b.toCharArray()) {
            if(!set[ch - 'a']) {
                return -1;
            }
        }
        int k = b.length() / a.length();
        StringBuilder str = new StringBuilder(a.repeat(k));
        for (int i = 0; i < 3; i++) {
            if (str.toString().contains(b)) {
                return k + i;
            }
            str.append(a);
        }
        return -1;
		
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String a = cinScanner.next();
			String b = cinScanner.next();
			int res = repeatedStringMatch(a, b);
			System.out.println(res);
		}
	}
}
