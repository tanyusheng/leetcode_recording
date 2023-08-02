package 每日一题10月11月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/number-complement/
 * @author swift
 * 	思路：常规法：把10进制转为2进制，取反后再转10进制
 * 
 */
public class _476_数字的补数 {
	
	public static int findComplement(int num) {
		
		int mask = 1 << 30;
		while((mask &  num) == 0) {
			mask >>= 1;
		}
		mask = (mask << 1) - 1;
		return num ^ mask;
		
    }
	
	
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int num = cinScanner.nextInt();
			System.out.println(findComplement(num));
		}
		cinScanner.close();
	}
}
