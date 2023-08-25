package 剑指offer;

import java.util.Arrays;
import java.util.Scanner;

public class _jz53_2_缺失的数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            int[] array = ListNode.parseArray(string);
            System.out.println(missingNumber(array));
        }
    }
    // 方法一：二分查找
    public static int missingNumber(int[] nums){
          int left = 0;
          int right = nums.length - 1;
          while (left <= right){
              int mid = (left + right) / 2;
              if(nums[mid] == mid){
                  left = mid + 1;
              }else{
                  right = mid - 1;
              }
          }
          // 数字与索引不一一对应的第一个数字
          return left;
    }
    // 方法二：求1~n的和，减去数组的和，即为缺失的数字
    public static int missingNumber2(int[] nums){
        int len = nums.length;
        int sum = (1+len)*len/2;
        int summary = 0;
        for(int i: nums){
            summary += i;
        }
        System.out.println("sum:"+sum+",summary:"+summary);
        return sum - summary;
    }
}
