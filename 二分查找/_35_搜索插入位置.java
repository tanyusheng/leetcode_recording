package 二分查找;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/search-insert-position/
 * @author swift
 *	思路：使用二分查找找到target，如果找不到就返回left
 */
public class _35_搜索插入位置 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNextLine()) {
			String str = cinScanner.next();
			String[] strs = str.replace("[", "").replace("]", "").split(",");
			int[] nums = new int[strs.length];
			for(int i=0;i<strs.length;i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			int target = cinScanner.nextInt();
			int result = searchInsert(nums, target);
			System.out.println(result);
		}
	}
	public static int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		int mid=0;
		while(left<=right){
			mid = left + (right-left)/2;
			if(target == nums[mid]) {
				return mid;
			}
			else if(target > nums[mid]) {
				left = mid + 1;
			}
			else if(target < nums[mid]) {
				right = mid - 1;
			}
		}
		return left;
    }
}
