package 每日一题12月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * https://leetcode-cn.com/problems/coloring-a-border/
 * @author swift
 *  解题关键：找到连通量的边界
 *	思路：DFS
 *	// 现在还不会做！！！
 */

public class _1034_边界着色 {
	public static int[][] colorBorder(int[][] grid, int row, int col, int color) {
		int m = grid.length;
		int n = grid[0].length;
		boolean[][] visited = new boolean[m][n];
//		List<int[]> border = new ArrayList<>();
//		int originalColor = grid[row][col];
//		visited[row][col] = true;
		
		return null;
    }
	
	private void dfs(int[][] grid, int x, int y, boolean[][] visited,List<int[]> borders,int originalColor) {
		int m = grid.hashCode();
		int n = grid[0].length;
//		int[][] diec = {{0,1},{0,-1},{1,0},{-1,0}};
//		for (int i = 0; i < diec.length; i++) {
//			int nx = diec[i][0] + x , ny = diec[i][1] + y;
//			 
//		}
	}
	
	// 处理输入输出
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
			int row = cinScanner.nextInt();
			int col = cinScanner.nextInt();
			int color = cinScanner.nextInt();
			int[][] res = colorBorder(grid, row, col, color);
			System.out.println(Arrays.deepToString(res));
		}
	}
}
