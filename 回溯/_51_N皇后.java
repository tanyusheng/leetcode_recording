package 回溯;

import java.util.ArrayList;
import java.util.List;
/**
 * https://leetcode-cn.com/problems/n-queens/
 * @author swift
 *
 */
public class _51_N皇后 {
	int ways;
	int[] cols;
	// 定义一个二维数组，用于存储输出结果
	List<List<String>> result = new ArrayList<>();
	public static void main(String[] args) {
		_51_N皇后 queen = new _51_N皇后();
		System.out.println(queen.solveNQueens(4));
	}
	public List<List<String>> solveNQueens(int n) {
		if(n<1) return null;
		cols = new int[n];
		place(0);
		System.out.println(ways);
		return result;
    }
	
	/**
	 * 回溯法，计算棋牌摆放的种类数
	 * @param row
	 */
	void place(int row) {
		if(row == cols.length) {
			ways++;
			result.add(addResult(cols));
			return;
		}
		for(int col = 0;col<cols.length;col++) {
			if(isValid(row,col)) {
				cols[row] = col;
				place(row+1);
			}
		}
	}
	
	/**
	 * 剪枝操作，判断坐标是否冲突
	 * @param row
	 * @param col
	 * @return
	 */
	boolean isValid(int row,int col) {
		for(int i=0;i<row;i++) {
			if(col==cols[i]) return false;
			if(row-i==Math.abs(col-cols[i])) return false;
		}
		return true;
	}
	
	/**
	 * 用来输出皇后单次摆放结果
	 */
	private List<String> addResult(int[] cols) {
		ArrayList<String> tempList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
	
		for(int row=0;row<cols.length;row++) {
			for(int col=0;col<cols.length;col++) {
				if(cols[row]==col) {
					sb.append('Q');
				}else {
					sb.append('.');
				}	
			}
			tempList.add(sb.toString());
			sb.delete(0, sb.length());
		}
		return tempList;
	}
	
}
