package 每日一题10月11月;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/arranging-coins/
 * @author swift
 * 思路：数学法：设层数为x,填满x层需要(1+x)x/2+(可能没填满的部分硬币) = n
 * 	直接用二次函数求根公式x=-b+sqrt(b^2-4ac)/2a，求得层数x=-1+sqrt(1+8n)/2
 * 	注意事项：当n很大时，直接计算8n可能会溢出，所以我们要把结果转化成只有一个n的计算公式
 * 	x=-0.5+2^0.5*(n+0.125)^0.5
 *
 */
public class _441_排列硬币 {
	// 数学法
	public static int arrangeCoins(int n) {
		return (int)(Math.pow(2, 0.5)*Math.pow(n+0.125, 0.5)-0.5);
    }
	// 二分法
	public static int arrangeCoins2(int n) {
		long left = 1;
		long right = n;
		while(left <= right) {
			long mid = left + (right-left)/2;
			long total = (1+mid)*mid/2;
			if(total == n) {
				return (int)mid;
			}
			if(total > n) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		return (int)left;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int x = cinScanner.nextInt();
			System.out.println(arrangeCoins(x));
		}
	}
}
