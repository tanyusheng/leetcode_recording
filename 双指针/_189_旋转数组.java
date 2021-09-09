package 双指针;

/**
 * https://leetcode-cn.com/problems/rotate-array/submissions/
 * 没想出来，明天继续做
 */
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class _189_旋转数组 {
	public static int[] rotate(int[] nums, int k) {
		k %= nums.length;
		int[] result = new int[nums.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = nums[(i+k+1)%nums.length];
		}
		return result;		
    }
	
	private void swap(int[] nums,int a,int b) {
		int temp;
		temp = nums[b];
		nums[b] = nums[a];
		nums[a] = temp;
	}
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < strs.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			int k = cinScanner.nextInt();
			int[] result = rotate(nums, k);
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
			}
		}
	}
}
