package 每日一题;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/majority-element-ii/
 * @author swift
 *	思路：使用HashMap存储每个数字出现的次数，找出values大于n/3的key
 */
public class _229_求众数 {
	

	public static List<Integer> majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> res = new ArrayList<Integer>();
		int n = nums.length;
		// 把数组中的元素存入map
		for(int i : nums) {
			map.put(i,map.getOrDefault(i, 0)+1);
		}
		Set<Integer> collection = map.keySet();
		
		for(Integer i : collection) {
			if(map.get(i) > n/3) {
				res.add(i);
			}
		}
		return res;
    }
	
	/**
	 * 处理输入输出
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.nextLine();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for(int i = 0; i < strs.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			List<Integer> list = new ArrayList<Integer>();
			list = majorityElement(nums);
			System.out.println(list);
		}
	}
}
