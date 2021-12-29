package 每日一题12月;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/count-special-quadruplets/	
 * @author swift
 * 思路：暴力
 */
public class _1995_统计特殊四元组 {
	public static int countQuadruplets(int[] nums) {
		int n = nums.length;
		int ans = 0;
		for(int a = 0; a < n; a++) {
			for (int b = a+1; b < n; b++) {
				for (int c = b+1; c < n; c++) {
					for (int d = c+1; d < n; d++) {
						if(nums[a]+nums[b]+nums[c]== nums[d]) {
							ans++;
						}
					}
				}
				
			}
		}
		return ans;
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
			int res = countQuadruplets(nums);
			System.out.println(res);
		}
	}
}
