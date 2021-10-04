package 深度优先搜索;

import java.util.Arrays;
import java.util.Scanner;


/**
 * https://leetcode-cn.com/problems/flood-fill/
 * @author swift
 *	思路：深度优先搜索
 */
public class _733_图像渲染 {
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		dfs(image,sr,sc,newColor,image[sr][sc]);
		return image;
    }
	
	// 深度优先搜索
	public static void dfs(int[][] image, int sr,int sc,int newColor,int oldColor) {
		if(sc<0 || sc<0 || sr>=image.length || sc>=image[0].length || newColor==oldColor || image[sr][sc]!=oldColor) {
			return;
		}
		image[sr][sc] = newColor;
		dfs(image, sr-1, sc, newColor, oldColor);
		dfs(image, sr+1, sc, newColor, oldColor);
		dfs(image, sr, sc+1, newColor, oldColor);
		dfs(image, sr, sc-1, newColor, oldColor);
	}
	
	// 处理输入输出
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int r = cin.nextInt();
			int c = cin.nextInt();
			int[][] matrix = new int[r][c];
			cin.nextLine(); // 跳过行数和列数后的换行符
			for(int i=0;i<r;i++) {
				for (int j = 0; j < c; j++) {
					matrix[i][j] = cin.nextInt();
				}
			}
			cin.nextLine();
			int sr = cin.nextInt();
			int sc = cin.nextInt();
			int newColor = cin.nextInt();
			System.out.println(Arrays.deepToString(floodFill(matrix,sr,sc,newColor)));
			
		}
	}
}
