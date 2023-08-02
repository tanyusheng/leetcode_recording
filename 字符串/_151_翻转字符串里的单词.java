package 字符串;

import java.util.Scanner;

public class _151_翻转字符串里的单词 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String str = cinScanner.nextLine();
			String resultString = reverseWords(str);
			System.out.println(resultString);
		}
		cinScanner.close();
	}
	public static String reverseWords(String s) {
		String[] strs = s.trim().split("\\s+");
		StringBuffer sb = new StringBuffer();
		for (int i = strs.length-1; i > 0 ; i--) {
			sb.append(strs[i]).append(" ");
		}
		sb.append(strs[0]);
		String resultString = sb.toString();
		return resultString;
    }
}
