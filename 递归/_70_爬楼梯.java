package 递归;

import java.util.Scanner;
public class _70_爬楼梯 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int a = cin.nextInt();
			System.out.println(climbStairs(a));
		}	
	}
	
	public static int climbStairs(int n) {
		if(n<=2) return n;
		int first = 1;
		int second = 2;
		for(int i=3;i<=n;i++) {
			int temp = first+second;
			first = second;
			second = temp;
		}
		return second;
    }
}
