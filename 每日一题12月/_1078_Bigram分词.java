package 每日一题12月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/occurrences-after-bigram/
 * @author swift
 *
 */
public class _1078_Bigram分词 {
	public static String[] findOcurrences(String text, String first, String second) {
		String[] words = text.split(" ");
		List<String> res = new ArrayList<>();
		for(int i = 0; i < words.length - 2; i++) {
			if(first.equals(words[i]) && second.equals(words[i+1])) {
				res.add(words[i+2]);
			}
		}
		return res.toArray(new String[0]);
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String text = cinScanner.nextLine();
			String first = cinScanner.next();
			String second = cinScanner.next();
			String[] res = findOcurrences(text, first, second);
			System.out.println(Arrays.toString(res));;
		}
		cinScanner.close();
	}
}

