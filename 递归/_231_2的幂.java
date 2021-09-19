package 递归;

import java.util.Scanner;
/**
 * https://leetcode-cn.com/problems/power-of-two/
 * @author swift
 *
 */
public class _231_2的幂 {
	/**
	 * 递归法
	 * @param n
	 * @return
	 */
	public static boolean isPowerOfTwo(int n) {
		if(n<=0) return false;
		else if(n==1) return true;
		else return (n%2 == 0) && isPowerOfTwo(n/2);
	}
	
	/**
	 * 如果一个数是2的幂，则n & n-1 == 0
	 * @param n
	 * @return
	 */
	public static boolean isPowerOfTwo1(int n) {
		return n>0 && (n & (n-1)) == 0;
	}
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int n = cinScanner.nextInt();
			System.out.println(isPowerOfTwo(n));
		}
	}
}
