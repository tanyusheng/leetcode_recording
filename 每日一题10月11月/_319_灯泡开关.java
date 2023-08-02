package 每日一题10月11月;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/bulb-switcher/
 * @author swift
 * 思路：一个数有奇数个因数，他才会尾部亮灯；故求一下根号取整即可
 */
public class _319_灯泡开关 {
	// 数论法
	public static int bulbSwitch(int n) {
		int r = (int)Math.sqrt(n);
		return r;
    }
	
	// 暴力法(最后一个用例99999999太大超时过不了)
	public static int bulbSwitch2(int n) {
		boolean[] lights = new boolean[n+1];
		Arrays.fill(lights, true);
		for (int i = 2; i <= n; i++) {
			for (int j = i; j <= n; j+=i) {
				lights[j] = !lights[j];
			}
		}
		int count = 0;
		for (int i = 1; i < lights.length; i++) {
			if(lights[i]) {
				count++;
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int n = cinScanner.nextInt();
			System.out.println(bulbSwitch2(n));
		}
		cinScanner.close();
	}
}
