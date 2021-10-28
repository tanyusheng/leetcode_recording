package 每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/next-greater-element-i/
 * @author swift
 *	思路：暴力法
 *		还有单调栈法，后续完善
 */
public class _496_下一个更大元素 {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			int j = 0;
			while(j < m && nums1[i] != nums2[j]) {
				j++;
			}
			while(j < m && nums1[i] >= nums2[j]) {
				j++;
			}
			if(j>=m) {
				res[i] = -1;
			}else {
				res[i] = nums2[j];
			}
		}
		return res;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str1 = cinScanner.nextLine();
			String[] strs1 = str1.split(",");
			int[] nums1 = new int[strs1.length];
			for (int i = 0; i < nums1.length; i++) {
				nums1[i] = Integer.parseInt(strs1[i]);
			}
			String str2 = cinScanner.nextLine();
			String[] strs2 = str2.split(",");
			int[] nums2 = new int[strs2.length];
			for (int i = 0; i < nums2.length; i++) {
				nums2[i] = Integer.parseInt(strs2[i]);
			}
			int[] res = new int[nums1.length];
			res = nextGreaterElement(nums1, nums2);
			System.out.println(Arrays.toString(res));
		}
	}
}
