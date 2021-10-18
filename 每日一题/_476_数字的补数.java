package 每日一题;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/number-complement/
 * @author swift
 * 	思路：把10进制转为2进制，取反后再转10进制
 */
public class _476_数字的补数 {
	public static int findComplement(int num) {
		
		return deToBi(num);
    }
	
	private static int deToBi(int n) {
		String biString = Integer.toBinaryString(n);
		char[] biStringArray = biString.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : biStringArray) {
			if(c == 0) {
				sb.append(1);
			}else {
				sb.append(0);
			}
		}
		// 反转后的01字符串
		String rbiString = sb.toString();
		char[] rbiArray = rbiString.toCharArray();
		int sum = 0;
		int len = rbiArray.length;
		for (int i =0;i<len;i++) {
			if(rbiArray[i]=='1') {
				sum += Math.pow(2, i);
			}
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int num = cinScanner.nextInt();
			System.out.println(findComplement(num));
		}
	}
}
