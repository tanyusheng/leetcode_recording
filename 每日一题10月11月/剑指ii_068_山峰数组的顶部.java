package 每日一题10月11月;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/B1IidL/
 * @author swift
 *
 */
public class 剑指ii_068_山峰数组的顶部 {
	// 暴力法--时间复杂度O(n)
	public static int peakIndexInMountainArray(int[] arr) {
		int index = 0;
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i-1]<arr[i] && arr[i+1]<arr[i]) {
				index = i;
			}
		}
		return index;
    }
	
	// 二分查找法--时间复杂度O(log(n))
	public static int peakIndexInMountainArray2(int[] arr) {
		int left = 1;
		int right = arr.length-2;
		while(left < right) {
			int mid = left + (right-left)/2;
			if(arr[mid] < arr[mid+1]) {
				left = mid + 1;
			}else {
				right = mid;
			}
		}
		return left;
    }
	
	// 处理输入输出
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			int result = peakIndexInMountainArray(nums);
			System.out.println(result);
		}
	}
}
