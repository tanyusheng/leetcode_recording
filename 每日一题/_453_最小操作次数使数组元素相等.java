package 每日一题;

import java.util.Arrays;
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
		int step = 0;
		while(!isEval(nums)) {
			int max = findMax(nums);
			nums[max]--;
			step++;
		}
		return step;
    }
	
	// 判断数组中的元素是否都相等
	private static boolean isEval(int[] nums) {
		int flag = nums[0];
		for(int i = 1; i< nums.length;i++) {
			if(flag != nums[i]) {
				return false;
			}
		}
		return true;
	}
	
	// 判断数组中元素的最大值的下标
	private static int findMax(int[] nums) {
		int max = 0;
		for(int i = 1;i < nums.length; i++) {
			if(nums[i] > nums[max]) {
				max = i;
			}
		}
		return max;
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
