package 每日一题10月11月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/nth-digit/
 * @author swift
 * 	思路： 1位  1~9 9个；
 * 			2位 10~99 90个；
 * 			3位 100~999 900个；
 * 			4位 1000~9999 9000个；
 * 	
 *
 */
public class _400_第N位数字 {
	public static int findNthDigit(int n) {
		int base = 1;
		int weight = 9;
		while(n > (long)base*weight) { // 假设 n = 300
			n -= base*weight;
			base ++;
			weight *= 10;
		}
		// n = 111 base = 3 weight = 900
		n--;
		// 找到第n个位置是哪个数值的数字的构成元素
		int res = (int)Math.pow(10, base-1)+n / base;
		return String.valueOf(res).charAt(n % base)-'0';
    }
	
	public static void main(String[] args) {
		Scanner cScanner = new Scanner(System.in);
		while(cScanner.hasNext()) {
			int n = cScanner.nextInt();
			int res = findNthDigit(n);
			System.out.println(res);
		}
	}
}
