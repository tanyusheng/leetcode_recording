package 剑指offer;

import java.util.Scanner;

public class _jz10_斐波拉契数列 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int res = fib(n);
            System.out.println(res);
        }
    }

    public static int fib(int n){
        int modulo = 1000000007;
        int modN = n % modulo;
        if(modN == 0 || modN == 1){
            return modN;
        }
        return (fib(modN-1)+fib(modN-2))%modulo;
    }
}
