package 每日一题12月;

import java.util.Arrays;
import java.util.Scanner;


/**
 * https://leetcode-cn.com/problems/shortest-completing-word/
 * @author swift
 * 
 *
 */
public class _748_最短补全词 {
	public static String shortestCompletingWord(String licensePlate, String[] words) {
		// 统计字符串中有效字母的出现的次数
		int[] slots = new int[26];
		licensePlate = licensePlate.toLowerCase();
		char chars[] = licensePlate.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] < 'a' || chars[i] > 'z') {
				continue;
			}
			slots[chars[i]-'a']++;
		}
		// 定义默认的最合适的单词下标为-1
		int resIndex = -1;
		for (int i = 0; i < words.length; i++) {
			int[] clone = slots.clone();
			char[] word = words[i].toCharArray();
			for (int j = 0; j < word.length; j++) {
				clone[word[j]-'a']--;
				if(j == word.length - 1) {
					// java8中流的写法，快速获得数组中的最小值
					if(Arrays.stream(clone).max().getAsInt() > 0) {
						// 说明有多余的字母，故跳出当前循环，测试下一个单词
						break;
					}
					// 如果当前是第一次比较或者当前满足条件的单词的长度小于已经记录的满足条件的单词长度
					if(resIndex == -1 || words[i].length() < words[resIndex].length()) {
						resIndex = i;
					}
				}
			}
		}
		return words[resIndex];
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String licensePlate = cinScanner.nextLine();
			String word = cinScanner.next();
			String[] words = word.split(",");
			String res = shortestCompletingWord(licensePlate, words);
			System.out.println(res);
			// step,steps,stripe,stepple
		}
	}
}
