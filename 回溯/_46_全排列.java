package 回溯;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import 链表.ListNode;

/**
 * https://leetcode-cn.com/problems/permutations/
 * @author swift
 *
 */
public class _46_全排列 { 
	List<List<Integer>> res = new LinkedList<>();
	public List<List<Integer>> permute(int[] nums) {
		// 记录路径
		LinkedList<Integer> track = new LinkedList<>();
		backtrack(nums, track);
		return res; 
    }
	
	void backtrack(int[] nums, LinkedList<Integer> track) {
		// 触发结束条件
		if(track.size() == nums.length) {
			res.add(new LinkedList(track));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if(track.contains(nums[i])) {
				continue;
			}
			track.add(nums[i]);
			backtrack(nums, track);
			track.removeLast();
		}
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
			List<List<Integer>> res = new _46_全排列().permute(nums);
			for (List<Integer> list : res) {
				System.out.println(list);
			}
		}
	}
}
