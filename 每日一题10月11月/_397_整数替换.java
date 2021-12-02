package 每日一题10月11月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/integer-replacement/
 * @author swift
 *	思路：深度优先搜索
 */
public class _397_整数替换 {
	public static int sum = 0;
	public static int integerReplacement(int n) {
		if(n==1) return 0;
		return dfs(n * 1L);
    }
	
	private static int dfs(long n) {
		if(n == 1) return 0;
		if(n % 2 == 0) {
			sum = dfs(n/2)+1;
		}else {
			sum = Math.min(dfs(n-1), dfs(n+1))+1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner cScanner = new Scanner(System.in);
		while(cScanner.hasNext()) {
			int n = cScanner.nextInt();
			System.out.println(integerReplacement(n));
		}
	}
}
