package 每日一题;

import java.util.Scanner;

/**
 * 
 * @author swift
 *https://leetcode-cn.com/problems/valid-perfect-square/
 */
public class _367_有效的完全平方数 {
	public static boolean isPerfectSquare(int num) {
		int res =(int) Math.sqrt(num);
        return res*res == num;
    }
	public static boolean isPerfectSquare2(int num) {
		int res =(int) Math.sqrt(num);
        return res*res == num;
    }
	
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int num = cinScanner.nextInt();
			boolean flag = isPerfectSquare(num);
			System.out.println(flag);
		}
	}

}
