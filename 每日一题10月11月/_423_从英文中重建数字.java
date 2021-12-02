package 每日一题10月11月;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author swift
 *	https://leetcode-cn.com/problems/reconstruct-original-digits-from-english/
 */
public class _423_从英文中重建数字 {
	public static String originalDigits(String s) {
        // 存储字符串中每一个单词出现的频率
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // 定义一个数组存储每一个单词字母出现的次数
        int[] numArray = new int[10];
        // 只出现一次的特征数字
        numArray[8] = map.getOrDefault('g',0);
        numArray[4] = map.getOrDefault('u',0);
        numArray[2] = map.getOrDefault('w',0);
        numArray[6] = map.getOrDefault('x',0);
        numArray[0] = map.getOrDefault('z',0);
        // 出现两次的特征数字
        numArray[3] = map.getOrDefault('h',0) - numArray[8];
        numArray[5] = map.getOrDefault('f',0) - numArray[4];
        numArray[7] = map.getOrDefault('s',0) - numArray[6];
        // 出现多次的特征数字
        numArray[1] = map.getOrDefault('o',0)-numArray[0]-numArray[2]-numArray[4];
        numArray[9] = map.getOrDefault('i',0)-numArray[5]-numArray[6]-numArray[8];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < numArray[i];j++){
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            String str = cin.next();

            System.out.println(originalDigits(str));
        }
    }
}
