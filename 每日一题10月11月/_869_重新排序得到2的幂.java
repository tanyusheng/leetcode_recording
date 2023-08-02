package 每日一题10月11月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/reordered-power-of-2/
 * @author swift
 * ·思路一：将数值转为字符串再转为字符数组，调用Arrays.sort()对字符数组进行排序；
 * 然后将每个2的幂进行同样操作，然后通过Arrays.equals(A,B)判断两个字符数组是否相等即可。
 *	思路二：暴力回溯然后通过位运算判断是否是2的幂。
 */
public class _869_重新排序得到2的幂 {
	public static boolean reorderedPowerOf2(int n) {
		char[] charArray = String.valueOf(n).toCharArray();
		Arrays.sort(charArray);
		for(int i = 1; i <= 1e9; i *= 2) {
			char[] temp = String.valueOf(i).toCharArray();
			Arrays.sort(temp);
			if(Arrays.equals(charArray, temp)) {
				return true;
			}
		}
		return false;
    }
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			System.out.println(reorderedPowerOf2(n));
		}
		scanner.close();
	}
}
