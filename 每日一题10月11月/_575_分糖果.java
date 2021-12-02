package 每日一题10月11月;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/distribute-candies/
 * @author swift
 *	思路：哈希表记录所有糖果的种类数kind，如果种类数kind大于n/2,则结果为n/2;
 *			否则结果为kind
 */
public class _575_分糖果 {
	public static int distributeCandies(int[] candyType) {
		// 糖果的总数
		int n = candyType.length;
		// 先找出所有糖果的种类数
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i : candyType) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		// 定义糖果的种类数
		int kind;
		Set<Integer> set = map.keySet();
		kind = set.size();
		if(2*kind > n) {
			return n/2;
		}
		return kind;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			System.out.println(distributeCandies(nums));
		}
	}
}

