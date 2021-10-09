package 每日一题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/repeated-dna-sequences/
 * @author swift
 *	思路：将字符串s从头至尾取长度为10的子串，存入HashMap中，并统计存入的数量。
 *	使用KeySet获取hash表中的键集合。迭代查询数量大于1的子串，加入结果res中。
 */
public class _187_重复的DNA序列 {
	public static List<String> findRepeatedDnaSequences(String s) {
		List<String> res = new ArrayList<>();
		if(s.length() <= 10) return res;
		// 滑动窗口初始长度装载
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i <= s.length()-10; i++) {
			map.put(s.substring(i,i+10),map.getOrDefault(s.substring(i,i+10), 0)+1);
		}
		// 对哈希表中的元素进行遍历
		for(String s1:map.keySet()) {
			if(map.get(s1)>1) {
				res.add(s1);
			}
		}
		return res;
    }
	
	
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String string = cinScanner.next();
			System.out.println(findRepeatedDnaSequences(string));
		}
		
	}
}
