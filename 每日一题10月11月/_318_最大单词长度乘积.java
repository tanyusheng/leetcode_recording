package 每日一题10月11月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/maximum-product-of-word-lengths/
 * @author swift
 *
 */
public class _318_最大单词长度乘积 {
	public static int maxProduct(String[] words) {
		int n = words.length;
		// 先转化为bit数组
		int[] bits = new int[n];
		for (int i = 0; i < n; i++) {
			char[] chars = words[i].toCharArray();
			for (int j = 0; j < chars.length; j++) {
				bits[i] |= 1 << (chars[j] - 'a');
			}
		}
		int len = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if((bits[i] & bits[j]) == 0) {
					len = Math.max(len, words[i].length()*words[j].length());
				}
			}
		}
		return len;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			System.out.println(maxProduct(strs));
		}
	}
}
