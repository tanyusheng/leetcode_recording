package 每日一题10月11月;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/longest-harmonious-subsequence/
 * @author swift
 *	思路：最长和谐子序列，最大值与最小值的差为1，说明子序列中只存在两种数；
 *		把数组中的元素存入哈希表中，并统计次数。遍历哈希表中的keySet,如果存在两个相邻的key,
 *		则返回这两个key对应的数量之和。依次遍历直到找到最长的即为最长和谐子序列。
 */
public class _594_最长和谐子序列 {
	public static int findLHS(int[] nums) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int i : nums) {
			hashMap.put(i,hashMap.getOrDefault(i, 0)+1);
		}
		int longest = 0;;
		// 遍历哈希表
		for(int i : hashMap.keySet()) {
			if(hashMap.containsKey(i+1)) {
				longest = Math.max(longest, hashMap.get(i)+hashMap.get(i+1));
			}
		}
		return longest;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			
			System.out.println(findLHS(nums));
		}
		cinScanner.close();
	}	
}
