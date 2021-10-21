package 每日一题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/plus-one/
 * @author swift
 *	思路：把数组转为数值，加一，再转为数组
 */
public class _66_加一 {
	public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--) {
        	if(digits[i] == 9) {
        		digits[i] = 0;
        	}else {
        		digits[i]++;
        		return digits;
        	}
        }
        int[] digital = new int[digits.length + 1];
        digital[0] = 1;
        return digital;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.nextLine();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for(int i = 0; i < strs.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			int[] result = plusOne(nums);
			System.out.println(Arrays.toString(result));
		}
	}
}
