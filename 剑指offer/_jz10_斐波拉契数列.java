package 剑指offer;

/*
 * url:https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof
 *
 */

import java.util.Scanner;

public class  _jz10_斐波拉契数列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int res = fib(n);
            System.out.println(res);
        }
    }
    // 动态规划
    public static int fib2(int n){

        return 0;
    }
    // 递归法：会超时的；
    public static int fib(int n){
        int modulo = 1000000007;
        int modN = n % modulo;
        if(modN == 0 || modN == 1){
            return modN;
        }
        return (fib(modN-1)+fib(modN-2))%modulo;
    }
}
