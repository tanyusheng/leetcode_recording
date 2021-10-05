package 每日一题;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/license-key-formatting/
 * @author swift
 *
 */
public class _482_密钥格式化 {
	public String licenseKeyFormatting(String s, int k) {
		// 把字符串中的"-"去掉
		s = s.replace("-", "").toUpperCase();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		int address = sb.length();
		while(address>=k) {
			address -= k;
			if(address == 0) break;
			sb.insert(address, "-");
		}
		return sb.toString();
    }
	
	// 处理输入输出
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String s = cinScanner.next();
			int k = cinScanner.nextInt();
			String result = new _482_密钥格式化().licenseKeyFormatting(s, k);
			System.out.println(result);
		}
	}
}
