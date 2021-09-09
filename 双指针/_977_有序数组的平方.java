package 双指针;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * @author swift
 *
 */
public class _977_有序数组的平方 {
	public static int[] sortedSquares(int[] nums) {
		int[] result = new int[nums.length]; 
		for(int i=0;i<nums.length;i++) {
			result[i] = nums[i]*nums[i];
		}
		Arrays.sort(result);
		return result;
	}
	
	public static int[] sortedSquares2(int[] nums) {
		int[] result = new int[nums.length]; 
		int write = nums.length-1;
		int left = 0;
		int right = nums.length-1;
		while(left<=right) {
			if(nums[left]*nums[left]<nums[right]*nums[right]) {
				result[write] = nums[right]*nums[right];
				right--;
				write--;
			}else {
				result[write] = nums[left]*nums[left];
				left++;
				write--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNextLine()) {
			String str = cinScanner.next();
			String[] strs = str.replace("[", "").replace("]", "").split(",");
			int[] nums = new int[strs.length];
			for(int i=0;i<strs.length;i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			int[] result = new int[strs.length];
			result = sortedSquares(nums);
			System.out.print("[");
			for (int i = 0; i < result.length-1; i++) {
				System.out.print(result[i]+",");
			}
			System.out.println(result[result.length-1]+"]");
		}
	}
}
