package 双指针;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * @author swift
 *
 */
public class _167_两数之和II输入有序数组 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String string = cinScanner.next();
			
			String[] strsString = string.split(",");
			int[] result = new int[strsString.length];
			for (int i = 0; i < strsString.length; i++) {
				result[i] = Integer.parseInt(strsString[i]);
			}
			int target = cinScanner.nextInt();
			int[] anwser = twoSum(result, target);
			for (int i = 0; i < anwser.length; i++) {
				System.out.print(anwser[i]+",");
			}
			System.out.println("\n");
		}
	}
	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length-1;
		while(left<right) {
			if(numbers[left]+numbers[right] == target) {
				return new int[] {left+1,right+1};
			}else if(numbers[left]+numbers[right] > target) {
				right--;
			}else if(numbers[left]+numbers[right] < target){
				left++;
			}
		}
		return new int[] {-1,-1};
    }
}
