package 数组;

import java.util.HashMap;
import java.util.Scanner;

public class _1_两数之和 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			
			int target = cinScanner.nextInt();
			int[] resultArrray = twoSum1(nums, target);
			for (int i = 0; i < resultArrray.length; i++) {
				System.out.print(resultArrray[i]+" ");
			}
			System.out.println("\n***danli is big super very beauty fighting***");
		}
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
        	
        }
        return result;
    }
	
	public static int[] twoSum1(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {i,map.get(target-nums[i])};
			}
			map.put(nums[i],i);
		}
		return new int[] {};
    }
}
