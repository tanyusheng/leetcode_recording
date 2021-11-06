package 每日一题;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/missing-number/
 * @author swift
 *	思路：1.哈希表
 *		2.把1-n加起来，减去数组中的每一个元素
 */
public class _268_丢失的数字 {
	public static int missingNumber(int[] nums) {
		// 把数组中每一个元素存在set中
		Set<Integer> set = new HashSet<>();
		for(int i : nums) {
			set.add(i);
		}
		int result = 0;
		for(int j = 0; j <= nums.length;j++) {
			if(!set.contains(j)) {
				result = j;
			}
		}
		return result;
    }
	public static int missingNumber2(int[] nums) {
		int n = nums.length;
		int sum = (1+n)*n/2;
		for(int i: nums) {
			sum -= i;
		}
		return sum;
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str = scanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			System.out.println(missingNumber(nums));
		}
	}
}
