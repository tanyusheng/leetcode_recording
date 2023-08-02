package 深度优先搜索;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/max-area-of-island/
 * @author swift
 *
 */
public class _695_岛屿的最大面积 {
	static int row = 0;
	static int col = 0;
	public static int maxAreaOfIsland(int[][] grid) {
		if(grid == null || grid.length == 0) {
			return 0;
		}
		row = grid.length;
		col = grid[0].length;
		int maxArea = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				maxArea = Math.max(maxArea, dfs(grid, i, j));
			}
		}
		
		return maxArea;
    }
	// 深度优先搜索
	private static int dfs(int[][] grid,int r,int c){
		if(r<0 || c<0 || r>=row || c>=col || grid[r][c]==0) {
			return 0;
		}
		int area = 1;
		// 访问后的岛屿，设置为0
		grid[r][c] = 0; 
		area += dfs(grid, r-1, c);
		area += dfs(grid, r+1, c);
		area += dfs(grid, r, c-1);
		area += dfs(grid, r, c+1);
		
		return area;
	}
	
	// main函数处理输入输出
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int m = cinScanner.nextInt();
			int n = cinScanner.nextInt();
			cinScanner.nextLine();
			int[][] matrix = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = cinScanner.nextInt();
				}
			}
			int result = maxAreaOfIsland(matrix);
			System.out.println(result);
		}
		cinScanner.close();
	}
}
