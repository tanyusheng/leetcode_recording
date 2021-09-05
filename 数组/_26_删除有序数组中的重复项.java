package 数组;

public class _26_删除有序数组中的重复项 {
	/**
	 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/submissions/
	  * 思路：从下标为1开始依次跟前面的元素比较，如果值不同就把这个值放到索引index中。
	  * 类似于冒泡排序中的比较大小的方式。
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrays = {0,0,1,1,2};
		int num = removeDuplicates(arrays);
		System.out.println(num);
	}
	public static int removeDuplicates(int[] nums) {
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i-1]) {
				nums[index++] = nums[i];
			}
		}
		return index;
    }
}
