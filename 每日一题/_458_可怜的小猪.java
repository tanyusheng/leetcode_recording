package 每日一题;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/poor-pigs/
 * @author swift
 *	思路：信息熵
 */
public class _458_可怜的小猪 {
	public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets == 1) return 0;
        int step = minutesToTest / minutesToDie + 1;
        // loga(b) = ln(b) / ln(a)
        double time = Math.log(buckets) / Math.log(step);
        return (int)Math.ceil(time);

    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int buckets = cinScanner.nextInt();
			int minutesToDie = cinScanner.nextInt();
			int minutesToTest = cinScanner.nextInt();
			System.out.println(poorPigs(buckets, minutesToDie, minutesToTest));
		}
	}
}
