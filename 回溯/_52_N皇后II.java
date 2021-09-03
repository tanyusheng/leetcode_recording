package 回溯;

import java.util.Scanner;


public class _52_N皇后II {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int num = cin.nextInt();
			System.out.println(num+"皇后有"+new _52_N皇后II().totalNQueens(num)+"种摆法");
		}
	}
	
	int ways; // 定义方法数
	int[] cols; // 存储皇后的位置：数组索引是行号，数组元素是列号
	
	int totalNQueens(int n) {
		if(n<1) return 0;
		cols = new int[n];
		place(0);
		return ways;
    }
	/**
	 * 回溯法求摆法的种类
	 * @param row
	 */
	public void place(int row) {
		if(row == cols.length) {
			ways++;
			return;
		}
		for(int col=0;col<cols.length;col++) {
			if(isValid(row, col)) {
				cols[row] = col;
				place(row+1);
			}
		}
	}
	
	/**
	 * 剪枝操作,判断第row行和第col列是否可以摆放皇后
	 * @param row
	 * @param col
	 * @return
	 */
	boolean isValid(int row,int col) {
		for(int i=0;i<row;i++) {
			// 处理竖向的摆放冲突问题
			if(cols[i]==col) return false;	
			// 处理对角线上的摆放冲突问题
			if(row - i == Math.abs(col - cols[i])) return false;
		}
		return true;
	}
}
