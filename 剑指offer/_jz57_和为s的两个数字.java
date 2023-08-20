package 剑指offer;

/**
 * url:https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 * 思路：因为数组是递增的，双指针求边缘的和。如果大了，就减小，只能右指针左移；如果小了，就增大，只能左指针右移；
 */
public class _jz57_和为s的两个数字 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] + nums[right] > target){
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            }else {
                return new int[]{nums[left],nums[right]};
            }
        }
        return new int[0];
    }
}
