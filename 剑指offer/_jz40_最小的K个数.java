package 剑指offer;
/*
 *  url:https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class _jz40_最小的K个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            int[] array = ListNode.parseArray(s);
            int k = scanner.nextInt();
            int[] leastNumber = getLeastNumber(array, k);
            System.out.println(Arrays.toString(leastNumber));
        }
    }

    public static int[] getLeastNumber(int[] arr, int k){
        Arrays.sort(arr);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr[i];
        }
        return res;
    }
}
