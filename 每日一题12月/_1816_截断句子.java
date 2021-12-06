package 每日一题12月;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/truncate-sentence/
 * @author swift
 *
 */
public class _1816_截断句子 {
	public static String truncateSentence(String s, int k) {
		String[] strs = s.split("\\s+");
		System.out.println(Arrays.toString(strs));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k-1; i++) {
			sb.append(strs[i]).append(" ");
		}
		sb.append(strs[k-1]);
		return sb.toString();
    }
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String s = cinScanner.next();
			cinScanner.nextLine();
			int k = cinScanner.nextInt();
			String resString = truncateSentence(s, k);
			System.out.println(resString);
		}
	}
}
