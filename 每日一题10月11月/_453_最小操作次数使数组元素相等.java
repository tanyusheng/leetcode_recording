package 每日一题10月11月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 * @author swift
 *	思路：每次有n-1个数+1，就相当于每次有1个数-1，最终达到的效果是每个元素相等
 */
public class _453_最小操作次数使数组元素相等 {
	public static int minMoves(int[] nums) {
		if(nums.length == 1) {
			return 0;
		}
		int min = findMin(nums);
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return sum - min*nums.length;
		
    }
	
	// 判断数组中元素的最小值
	private static int findMin(int[] nums) {
		int min = nums[0];
		for(int i = 1; i < nums.length;i++) {
			if(nums[i]<min) {
				min = nums[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.nextLine();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for(int i = 0; i < strs.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			System.out.println(minMoves(nums));
		}
	}
}
