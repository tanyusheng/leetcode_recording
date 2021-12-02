package 每日一题10月11月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/single-number-iii/
 * @author swift
 *	思路：哈希表
 */
public class _260_只出现一次的数字 {
	
	public static int[] singleNumber(int[] nums) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = map.keySet();
		for(Integer key : set) {
			if(map.get(key) == 1) {
				list.add(key);
			}
		}
		int[] res = new int[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
		return res;
    }	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String string = sc.next();
			String[] strsStrings = string.split(",");
			int[] nums = new int[strsStrings.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strsStrings[i]);
			}
			System.out.println(Arrays.toString(singleNumber(nums)));
		}
	}
}
