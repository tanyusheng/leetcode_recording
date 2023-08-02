package 每日一题10月11月;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/fraction-to-recurring-decimal/
 * @author swift
 *	思路：余数*10 除以 分子，模拟除法的过程。
 *	为了计算负数先取绝对值，当-2^32，取绝对值后会溢出。
 *	为了防止溢出，转为long类型；
 *	使用HashMa记录小数重复情况。
 *	使用StringBuilder处理字符串，括号使用insert()方法在字符串中插入。
 */
public class _166_分数到小数 {
	public static String fractionToDecimal(int numerator, int denominator) {
		if(numerator == 0) return "0";
		StringBuilder sb = new StringBuilder();
		if(numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) {
			sb.append("-");
		}
		// 分子
		long fenzi = Math.abs((long)numerator);
		// 分母
		long fenmu = Math.abs((long)denominator);
		// 结果整数部分
		sb.append(fenzi / fenmu);
		// 余数
		long yushu = fenzi % fenmu;
		if(yushu == 0) {
			return sb.toString();
		}
		sb.append(".");
		// 定义一个HashMap用于记录小数点后重复的部分
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		
		while(yushu != 0) {
			if(map.containsKey(yushu)) {
				sb.insert(map.get(yushu), "(");
				sb.append(")");
				break;
			}
			map.put(yushu,sb.length());
			yushu *= 10;
			sb.append(yushu/fenmu);
			yushu %= fenmu;	
		}
		
		return sb.toString();
    }
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int n = cin.nextInt();
			int d = cin.nextInt();
			System.out.println(fractionToDecimal(n, d));
		}
		cin.close();
		
	}
}
