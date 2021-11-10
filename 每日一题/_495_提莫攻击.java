package 每日一题;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/teemo-attacking/
 * @author swift
 *	思路：对数组中的每一个数字从下标1开始，依次算它与前一个数字的步长，
 *	如果步长小于技能攻击时间duration，则累加计算步长；否则累加计算攻击时间duration
 *	
 */
public class _495_提莫攻击 {
	public static int findPoisonedDuration(int[] timeSeries, int duration) {
		
		int result = 0;
		for (int i = 1; i < timeSeries.length; i++) {
			int length = timeSeries[i]-timeSeries[i-1];
			if(length <= duration) {
				result += length;
			}else {
				result += duration;
			}	
		}
		result += duration;
		return result;
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] timeSeres = new int[strs.length];
			for (int i = 0; i < timeSeres.length; i++) {
				timeSeres[i] = Integer.parseInt(strs[i]);
			}
			cinScanner.nextLine();
			int duration = cinScanner.nextInt();
			System.out.println(findPoisonedDuration(timeSeres, duration));
		}
	}
}
