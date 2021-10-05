package 广度优先搜索;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/rotting-oranges/
 * @author swift
 *
 */
public class _944_腐烂的橘子 {
	int row = 0;
	int col = 0;
	public int orangesRotting(int[][] grid) {
		row = grid.length;
		col = grid[0].length;
		int time = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(grid[i][j] == 1) {
					time = Math.min(time,dfs(grid, i, j));
				}
				
			}
		}
		return time;
    }
	
	private int dfs(int[][] grid,int r,int c) {
		if(r<0 || c<0 || r>=row || c>=col || grid[r][c]==0 || grid[r][c]==2) {
			return 0;
		}
		int count = 1;
		grid[r][c] = 2;
		count += dfs(grid, r-1, c);
		count += dfs(grid, r+1, c);
		count += dfs(grid, r, c-1);
		count += dfs(grid, r, c+1);
		return count;
	}
	
	// 处理输入输出
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int row = cinScanner.nextInt();
			int col = cinScanner.nextInt();
			cinScanner.nextLine();
			int[][] grid = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					grid[i][j] = cinScanner.nextInt();
				}
			}
			int result = new _944_腐烂的橘子().orangesRotting(grid);
			System.out.println(result);
		}
	}
}
