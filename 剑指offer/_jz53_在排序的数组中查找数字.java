package 剑指offer;

import java.util.HashMap;
import java.util.Scanner;

public class _jz53_在排序的数组中查找数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            int target = scanner.nextInt();
            int[] array = ListNode.parseArray(string);
            System.out.println(search(array,target));
        }
        scanner.close();
    }

    // 方法一：哈希表
    public static int search(int[] nums, int target){
        if(nums.length == 0){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map.getOrDefault(target,0);
    }

    // 方法二：二分查找
//    public static int search2(int[] nums, int target){
        // 先找左边界再找右边界
//        int left = 0;
//        int right = nums.length - 1;
//        while(left <= right){
//            int mid = left + ((right - left) >> 2);
//            if(nums[mid] < target){
//                left = mid+1;
//            } else if (nums[mid] > target) {
//                right = mid-1;
//            }else if(nums[mid] == target){
//                left = mid;
//            }else{
//                return -1;
//            }
//        }
//
//        return right - left + 1;
//    }
}
