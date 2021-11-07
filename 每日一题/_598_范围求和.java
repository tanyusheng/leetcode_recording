package 每日一题;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/range-addition-ii/
 * @author swift
 *	思路：最大数的个数即重叠最多的矩形的面积，即最小数值长宽的乘积。
 */
public class _598_范围求和 {
	
	public int maxCount(int m, int n, int[][] ops) {
		int minWidth = m;
		int minHeight = n;
		for(int i=0; i < ops.length; i++) {
			minWidth = Math.min(minWidth, ops[i][0]);
			minHeight = Math.min(minHeight, ops[i][1]);
		}
		return minWidth*minHeight;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			sc.nextLine();
			// java怎么读取二维数组的输入？
			
		}
	}

}
