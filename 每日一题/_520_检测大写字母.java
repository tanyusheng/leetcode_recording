package 每日一题;

import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/detect-capital/
 * @author swift
 *	
 */
public class _520_检测大写字母 {
	public static boolean detectCapitalUse(String word) {
		if(word.equals(word.toLowerCase())) {
			return true;
		}else if(word.equals(word.toUpperCase())) {
			return true;
		}else {
			return capitalFormat(word);
		}
    }
	
	private static boolean capitalFormat(String word) {
		char[] wordArray = word.toCharArray();
		if(wordArray[0] >= 'A' && wordArray[0] <= 'Z') {
			for (int i = 1; i < wordArray.length; i++) {
				if(wordArray[i] >= 'a' && wordArray[i] <= 'z') {
					continue;
				}else {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String string = cinScanner.next();
			System.out.println(detectCapitalUse(string));
		}
	}
}
