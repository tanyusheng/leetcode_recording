package 排序;

import 剑指offer.ListNode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * url:https://leetcode.cn/problems/sort-an-array/
 */
public class _912_排序数组 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String sting = scanner.nextLine();
            int[] array = ListNode.parseArray(sting);
            int[] res = quicksort(array);
            System.out.println(Arrays.toString(res));
        }
    }

    // 快速排序
    public static int[] quicksort(int[] array){

        return array;
    }
}
