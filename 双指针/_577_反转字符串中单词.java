package 双指针;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * @author swift
 *
 */
public class _577_反转字符串中单词 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNextLine()) {
			String string = cinScanner.nextLine();
			String result = new _577_反转字符串中单词().reverse(string);
			System.out.println(result);
		}
		cinScanner.close();
	}
	public String reverseWords(String s) {
		// 原始字符串数组
		String[] strs = s.split(" ");
		// 反转后的字符串数组
		String[] rev_str = new String[strs.length];
		// 保存结果字符串
		String resultString = "";
		for (int i = 0; i < strs.length; i++) {
			rev_str[i]= reverse(strs[i]);	
		}
		
		for (int i = 0; i < strs.length-1; i++) {
			resultString += (rev_str[i]+" ");
		}
		resultString += rev_str[strs.length-1];
		return resultString;
    }
	
	/**
	 * 
	 * @param charstring 待转字符串
	 * @return 转好的字符串
	 */
	private String reverse(String charstring) {
		if(charstring.length()<=1) {
			return charstring;
		}
		// 把字符串转为字符数组
		char[] s = new char[charstring.length()];
		for (int i = 0; i < s.length; i++) {
			s[i] = charstring.charAt(i);
		}
		// 把字符数组反转
		int left = 0;
		int right = s.length-1;
		while(left<right) {
			char temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			left++;
			right--;
		}
		String resultString = "";
		for (int i = 0; i < s.length; i++) {
			resultString+=s[i];
		}
		return resultString;
	}
}
