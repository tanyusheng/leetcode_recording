package 双指针;

import java.awt.geom.CubicCurve2D;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * @author swift
 *	思路:从后往前遍历，如果有零，跟尾指针交换，尾指针前移。
 */
public class _283_移动零 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < strs.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			moveZeroes(nums);
			for (int i = 0; i < nums.length-1; i++) {
				System.out.print(nums[i]+",");
			}
			System.out.println(nums[nums.length-1]);
			
		}
	}
	public static void moveZeroes(int[] nums) {
		if(nums.length<=1) {
			return;
		}
		// 存储要覆盖的位置
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				nums[index]=nums[i];
				index++;
			}
		}
		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
		
		
	}
	
}
