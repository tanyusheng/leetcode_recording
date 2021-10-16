package 动态规划;

import java.util.Scanner;

public class _70_爬楼梯 {
	/**
	 * 递归法
	 * @param n
	 * @return
	 */
	public static int climbStairs(int n) {
        if(n==1||n==2) {
        	return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
	/**
	 * 动态规划法
	 * @param n
	 * @return
	 */
	public static int climbStairs1(int n) {
        if(n==1||n==2) {
        	return n;
        }
        int first = 1;
        int second = 2;
        for(int i = 3;i<=n;i++) {
        	int temp = first + second;
        	first = second;
        	second = temp;
        }
        return second;
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int n = cinScanner.nextInt();
			int result = climbStairs(n);
			System.out.println(result);
		}
	}
}
