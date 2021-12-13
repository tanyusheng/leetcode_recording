package 每日一题12月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/
 * @author swift
 *
 */
public class _807_保持城市天际线 {
	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		
		return 0;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int m = cinScanner.nextInt();
			int n = cinScanner.nextInt();
			cinScanner.nextLine();
			int[][] grid = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					grid[i][j] = cinScanner.nextInt();
				}
			}
			int res = maxIncreaseKeepingSkyline(grid);
			System.out.println(res);
		}
		
	}
}	
