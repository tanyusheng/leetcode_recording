package 二分查找;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/binary-search/
 * @author swift
 *
 */
public class _704_二分查找 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			String str = cin.next();
			String[] strs = str.replace("[", "").replace("]", "").split(",");
			int[] nums = new int[strs.length];
			for(int i=0;i<strs.length;i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			int target = cin.nextInt();
			int result = search(nums, target);
			System.out.println(result);
		}
		cin.close();
	}
	public static int search(int[] nums,int target) {
		int left = 0;
		int right = nums.length-1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(target == nums[mid]) {
				return mid;
			}else if(target<nums[mid]) {
				right = mid-1;
			}else if(target>nums[mid]) {
				left = mid+1;
			}
		}
		return -1;
	}
}
