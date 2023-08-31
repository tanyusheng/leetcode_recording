package 剑指offer;

/*
 *  url:https://leetcode.cn/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof
 *  思路：手动模拟一下：使用位运算，
 *  半加器通过异或实现，进位通过与运算左移一位实现；当没有进位的时候，直接使用半加器的结果
 */

import java.util.Scanner;

public class _jz65_不用加减乘除做加法 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int res = add2(a,b);
            System.out.println(res);
        }
        scanner.close();
    }

    // 递归法
    public static int add(int a, int b){
        if(a == 0){
            return b;
        }
        int sum = a ^ b;
        int up = a & b;
        return add(up << 1,sum);
    }
    // 迭代法
    public static int add2(int a,int b){
        int sum = 0;
        int carry = 0;
        while (b != 0){
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        }

        return a;
    }
}
