package 每日一题10月11月;

import java.util.HashSet;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/perfect-rectangle/comments/
 * @author swift
 *	思路：
 *		1.所有小矩形的面积之和等于最大的矩形面积
 *		2. 如果能全覆盖，坐标唯一的点，有仅存在4个
 *
 *	注意：
 *		1.记录小矩形的坐标，要通过字符串的方式存储，如果直接HashSet存储数组有问题
 *		2.初始化顶点的时候，如果是下边或者左边的则取Integer.MAX，如果是上边或者右边的则取Integer.MIN
 */
public class _391_完美矩形 {
	public static boolean isRectangleCover(int[][] rectangles) {
		int left = Integer.MAX_VALUE;
		int right = Integer.MIN_VALUE;
		int top = Integer.MIN_VALUE;
		int bottom = Integer.MAX_VALUE;
		int n = rectangles.length;
		// 定义一个存储顶点的HashSet
		HashSet<String> set = new HashSet<>();
		
		// 总矩形面积
		int fullArea = 0;
		// 单个矩形面积之和
		int sum_Area = 0;
		for (int i = 0; i < n; i++) {
			left = Math.min(left, rectangles[i][0]);
			bottom = Math.min(bottom, rectangles[i][1]);
			right = Math.max(right, rectangles[i][2]);
			top = Math.max(top,rectangles[i][3]);
			// 单个矩形面积
			int area = (rectangles[i][2]-rectangles[i][0])*(rectangles[i][3]-rectangles[i][1]);
			// 求所有小矩形的面积之和
			sum_Area += area;
			// 记录每一个矩形的顶点坐标
			String lb = rectangles[i][0]+" "+rectangles[i][1];
			String lt = rectangles[i][0]+" "+rectangles[i][3];
			String rb = rectangles[i][2]+" "+rectangles[i][1];
			String rt = rectangles[i][2]+" "+rectangles[i][3];
			if(!set.contains(lb)) {
				set.add(lb);
			}else {
				set.remove(lb);
			}
			if(!set.contains(lt)) {
				set.add(lt);
			}else {
				set.remove(lt);
			}
			if(!set.contains(rb)) {
				set.add(rb);
			}else {
				set.remove(rb);
			}
			if(!set.contains(rt)) {
				set.add(rt);
			}else {
				set.remove(rt);
			}
		}
		// 判断总矩形面积是否等于所有单个矩形面积之和
		fullArea = (right - left)*(top - bottom);
		if(set.size() == 4 && set.contains(left + " " + top) && set.contains(left + " " + bottom) && set.contains(right + " " + bottom) && set.contains(right + " " + top) ){
			return sum_Area == fullArea;
		}
		return false;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		int n = cinScanner.nextInt();
		int m = cinScanner.nextInt();
		cinScanner.nextLine();
		int[][] arrays = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arrays[i][j] = cinScanner.nextInt();
			}
		}
		System.out.println(isRectangleCover(arrays));
		
	}
}
