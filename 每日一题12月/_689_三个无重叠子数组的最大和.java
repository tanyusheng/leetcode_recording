package 每日一题12月;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/maximum-sum-of-3-non-overlapping-subarrays/
 * @author swift
 * 	动态规划
 *	// 这题不会做！！！
 */
public class _689_三个无重叠子数组的最大和 {
	
	public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
		
		return null;	
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String string = cinScanner.next();
			String[] strings = string.split(",");
			int[] nums = new int[strings.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strings[i]);
			}
			cinScanner.nextLine();
			int k = cinScanner.nextInt();
			System.out.println(Arrays.toString(nums));
			System.out.println("k="+k);
		}
	}
}
