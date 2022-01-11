package 每日一题1月;

import java.util.Scanner;


/**
 * https://leetcode-cn.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
 * @author swift
 *	实习~~~~~~~~
 */
public class _1576_替换所有的问号 {
	public static String modifyString(String s) {
		int last = 0;
        int n = s.length();
        char[] ch = s.toCharArray();
        
        for(int i = 0; i < n; i++) {
            if (ch[i] == '?') {
                ch[i] = (char)('a'+last);
                last = (last+1)%26;
            } else {
                last = (ch[i]-'a'+1)%26;
            }

            if (i < n-1 && ch[i] == ch[i+1]) {
                ch[i] = (char) ('a'+(ch[i]-'a'+1)%26);
            }
        }

        return new String(ch);
		
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String string = cinScanner.next();
			String res = modifyString(string);
			System.out.println(res);
		}
	}
}
