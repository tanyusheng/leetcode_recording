// 本模块的意义是记录ACM标准输入输出方法
package 剑指offer;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("hello,world");
        Scanner cinScanner = new Scanner(System.in);
        while(cinScanner.hasNext()){
            int n = cinScanner.nextInt();
            System.out.println(test(n));
        }
        cinScanner.close();
    }

    public static int test(int a){

        return (a >> 1);
    }
}
