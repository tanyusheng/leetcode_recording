package 每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/repeated-dna-sequences/
 * @author swift
 *
 */
public class _187_重复的DNA序列 {
	public static final int WINLEN = 10;
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> res = new ArrayList<String>();
		// 滑动窗口初始长度装载
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < WINLEN; i++) {
			map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
		}
		return null;
    }
	
	public static int[] test() {
		return new int[2];
	}
	
	public static void main(String[] args) {
		int[] result = test();
		System.out.println(Arrays.toString(result));
	}
}
