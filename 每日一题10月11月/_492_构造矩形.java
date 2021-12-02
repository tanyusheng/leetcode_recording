package 每日一题10月11月;

import java.util.Arrays;
import java.util.Scanner;


/**
 * https://leetcode-cn.com/problems/construct-the-rectangle/
 * @author swift
 * 	思路：从sqrt(area)开始前遍历，找到最小的一个可以被area整除的即为w
 *
 */
public class _492_构造矩形 {
	public static int[] constructRectangle(int area) {
		int mid = (int)(Math.sqrt(area));
		for(int i = mid;;i--) {
			if(area % i == 0) {
				return new int[] {i,area/i};
			}
		}
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int area = scanner.nextInt();
			int[] result = constructRectangle(area);
			System.out.println(Arrays.toString(result));
		}
	}
}
