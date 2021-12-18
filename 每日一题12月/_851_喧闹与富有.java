package 每日一题12月;

import java.util.Scanner;
/**
 * https://leetcode-cn.com/problems/loud-and-rich/
 * @author swift
 *  实习，LeetCode鸽了，鸽了，鸽了
 *  
 *
 */
public class _851_喧闹与富有 {
	public int[] loudAndRich(int[][] richer, int[] quiet) {
		
		return null;
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int m = cinScanner.nextInt();
			int n = cinScanner.nextInt();
			cinScanner.nextLine();
			int[][] richer = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					richer[i][j] = cinScanner.nextInt();
				}
			}
		}
	}
}
