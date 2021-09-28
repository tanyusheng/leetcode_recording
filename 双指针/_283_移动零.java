package 双指针;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * @author swift
 *	思路:从后往前遍历，如果有零，跟尾指针交换，尾指针前移。
 */
public class _283_移动零 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < strs.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			moveZeroes(nums);
			System.out.println(Arrays.toString(nums));
			
		}
	}
	public static void moveZeroes(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int pos = 0;
        int search = 0;
        int countZero = 0;
        while(pos<nums.length && search<nums.length){
            if(nums[search]==0){
                search++;
                countZero++;
            }else{
                nums[pos] = nums[search];
                pos++;
                search++;
            }
        }
        for(int i=nums.length-1;i>=nums.length-countZero;i--){
            nums[i] = 0;
        }
    }
	
}
