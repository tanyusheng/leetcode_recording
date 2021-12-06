package 每日一题12月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/super-pow/
 * @author swift
 *	思路：快速幂
 */
public class _372_超级次方 {
	// 不会做
	public static int superPow(int a, int[] b) {
		long bNum = 0;
		int res = 0;
//		for(int i = 0; i < b.length; i++) {
//			
//			bNum += (int)Math.pow(10, i)*b[b.length-1-i];
//		}
//		System.out.println("bNum="+bNum);
//		res = (int)((int)Math.pow(a, bNum) % 1337);
		return res; 
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while (cinScanner.hasNext()) {
			int a = cinScanner.nextInt();
			cinScanner.nextLine();
			String string = cinScanner.next();
			String[] strings = string.split(",");
			int[] b = new int[strings.length];
			for (int i = 0; i < b.length; i++) {
				b[i] = Integer.parseInt(strings[i]);
			}
			int res = superPow(a, b);
			System.out.println(res);
		}
	}
}
