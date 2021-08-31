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
			int temp = first+second;	//不停地求和
			first = second;		// 然后把第二个给第一个
			second = temp;	//把两数之和给第二个
		}
		return second;
    }
}
