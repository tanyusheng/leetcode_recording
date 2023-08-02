package 双指针;

/**
 * https://leetcode-cn.com/problems/rotate-array/submissions/
 * 没想出来，明天继续做
 */
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

public class _189_旋转数组 {
	public void rotate(int[] nums, int k) {
		if(k==0) {
			return;
		}
		k %= nums.length;
		int left = 0;
		int right = nums.length-1;
		reverse(nums,left,right);
		reverse(nums, left, k-1);	
		reverse(nums, k, right);
    }
	
	// 反转数组
	private void reverse(int[] nums,int left,int right) {
		while(left<right) {
			int temp = nums[right];
			nums[right] = nums[left];
			nums[left] = temp;
			right--;
			left++;
		}
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
			new _189_旋转数组().rotate(nums, k);
			for (int i = 0; i < nums.length-1; i++) {
				System.out.print(nums[i]+",");
			}
			System.out.println(nums[nums.length-1]);
		}
		cinScanner.close();
	}
}
