package 每日一题;

import java.util.Random;

/**
 * https://leetcode-cn.com/problems/shuffle-an-array/comments/
 * @author swift
 *	思路：洗牌算法
 */
public class _384_打乱数组 {
	class Solution {
		int[] nums;
		int[] shuffle;
		Random random;
		public Solution(int[] nums) {
			this.nums = nums;
			random = new Random();
		}
		
		public int[] reset() {
			return nums;
		}
		
		public int[] shuffle() {
			shuffle = nums.clone();
			for (int i = shuffle.length-1; i >= 0; i--) {
				// random.nextInt(n)方法生成[0~n)之间的整数,加一的目的是防止参数等于0报错
				int j = random.nextInt(i+1);
				swap(i, j);
			}
			return shuffle;
		}
		private void swap(int i,int j) {
			int temp = shuffle[i];
			shuffle[i] = shuffle[j];
			shuffle[j] = temp;
		}
	}
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(1));
	}
}
