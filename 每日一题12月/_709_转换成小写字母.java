package 每日一题12月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/to-lower-case/
 * @author swift
 *
 */
public class _709_转换成小写字母 {
	public static String toLowerCase(String s) {
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(array[i] >= 'A' && array[i] <= 'Z') {
				array[i] = (char)(array[i] + 32);
			}
		}
		String res = String.valueOf(array);
        return res;
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String string = cinScanner.next();
			String reString = toLowerCase(string);
			System.out.println(reString);
		}
	}
}
