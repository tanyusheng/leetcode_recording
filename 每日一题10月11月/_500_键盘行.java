package 每日一题10月11月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/keyboard-row/
 * @author swift
 *	思路：使用三个哈希集set1,set2,set3分别存储第一排字母、第二排字母、第三排字母。
 *		然后对输入的每一个单词存为哈希集set，如果任何一个哈希集都不containsAll(set),则舍弃改单词。
 */
public class _500_键盘行 {
	public static String[] findWords(String[] words) {
		// 使用HashSet存储每一排字符
		Set<Character> set1 = new HashSet<>();
		String s1 = new String("qwertyuiop");
		for(char c : s1.toCharArray()) {
			set1.add(c);
		}
		Set<Character> set2 = new HashSet<>();
		String s2 = new String("asdfghjkl");
		for(char c : s2.toCharArray()) {
			set2.add(c);
		}
		Set<Character> set3 = new HashSet<>();
		String s3 = new String("zxcvbnm");
		for(char c : s3.toCharArray()) {
			set3.add(c);
		}
		// 定义一个存储结果的list
		List<String> list = new ArrayList<>();
		// 对传入的字符串数组进行遍历
		for(String word: words) {
			// 对每一个words转小写再转字符数组
			Set<Character> set = new HashSet<>();
			for(char c : word.toLowerCase().toCharArray()) {
				set.add(c);
			}
			if(set1.containsAll(set)) {
				list.add(word);
			}else if(set2.containsAll(set)) {
				list.add(word);
			}else if(set3.containsAll(set)) {
				list.add(word);
			}else {
				continue;
			}
		}
		
		String[] resStrings = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			resStrings[i] = list.get(i);
		}
		return resStrings;
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String str = scanner.nextLine();
			String[] words = str.split(",");
			String[] result = findWords(words);
			System.out.println(Arrays.toString(result));
		}
	}
	
}
