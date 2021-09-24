package 排序;

import java.util.Arrays;
import java.util.Scanner;


/**
 * https://leetcode-cn.com/problems/merge-sorted-array/
 * @author swift
 * 	思路：1. 合并两个数组，然后排序
 * 		2.使用双指针，依次比较大小，把结果从小到大存储在一个新开辟的数组中。
 */
public class _88_合并两个有序数组 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str1 = cinScanner.next();
			String[] strs1 = str1.split(",");
			int[] nums1 = new int[strs1.length];
			for (int i = 0; i < nums1.length; i++) {
				nums1[i] = Integer.parseInt(strs1[i]);
			}
			
			String str2 = cinScanner.next();
			String[] strs2 = str2.split(",");
			int[] nums2 = new int[strs2.length];
			for (int i = 0; i < nums2.length; i++) {
				nums2[i] = Integer.parseInt(strs2[i]);
			}
			int m = cinScanner.nextInt();
			int n = cinScanner.nextInt();
			merge2(nums1, m, nums2, n);
			System.out.println(Arrays.toString(nums1));
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=m,j=0;i<m+n;i++,j++) {
			nums1[i]=nums2[j];
		}
		Arrays.sort(nums1);
    }
	
	public static void merge2(int[] nums1, int m, int[] nums2, int n) {
		int i = 0;
		int j = 0;
		int pos = 0;
		int[] res = new int[m+n];
		while(i<m && j<n) {
			if(nums1[i] < nums2[j]) {
				res[pos] = nums1[i];
				i++;
				pos++;
			}else {
				res[pos] = nums2[j];
				j++;
				pos++;
			}
		}
		
		while(i<m) {
			res[pos++] = nums1[i++];
		}
	
		while(j<n) {
			res[pos++] = nums2[j++];
		}
		
		// 因为最后要获取nums1
		for (int k = 0; k < nums1.length; k++) {
			nums1[k] = res[k];
		}
		
    }
}
