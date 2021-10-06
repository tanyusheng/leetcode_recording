package 每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/third-maximum-number/
 * @author swift
 *	思路：把数组中的每一个元素存入HashSet中，然后将HashSet转为动态数组，
 *	使用Collections.sort()对其排序。如果长度大于3，返回倒数第三个位置的元素。否则返回最后一个位置的元素。
 */
public class _414_第三大的数 {
	public static int thirdMax(int[] nums) {
		// 使用HashSet去重
		Set<Integer> set = new HashSet<>();
		for(int i : nums) {
			set.add(i);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		if(list.size() < 3) {
			return list.get(list.size()-1);
		}else {
			return list.get(list.size()-3);
		}
	}
	
	// 处理输入输出
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			System.out.println(thirdMax(nums));
		}
	}
}
