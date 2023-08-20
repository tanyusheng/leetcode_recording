package 剑指offer;

/**
 * url:https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/submissions
 * 问题：这里Scanner处理输入输出有问题，待解决；
 * 思路1：创建一个新数组保存前n个元素，再将原数组向前覆盖，最后将保存的n个元素往原数组尾部添加即可；
 * 思路2：反转0~n-1，再反转n-len,最后再反转0~len即可实现数组左旋；
 */

import java.util.Scanner;

public class _jz58_左旋转字符串 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String ns = scanner.nextLine();
            int n = Integer.parseInt(ns);
            String res = reverseLeftWords(str, n);
            System.out.println(res);
        }
        scanner.close();
    }

    public static String reverseLeftWords(String s,int n){
        if(s.length() == 1){
            return s;
        }
        char[] head = new char[n];
        char[] charArray = s.toCharArray();
        for(int i = 0 ; i < n; i++){
            head[i] = charArray[i];
        }
        int len = charArray.length;
        // 开始左移
        for(int i = n; i < len; i++){
            charArray[i-n] = charArray[i];
        }
        //补充右边
        for(int i = 0; i < n; i++){
            charArray[len-n+i] = head[i];
        }
        return new String(charArray);
    }

    public static String reverseLeftWords2(String s, int n){
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        reverseString(sb,0,n-1);
        reverseString(sb,n,len-1);
        return sb.reverse().toString();
    }

    /**
     * 创建一个反转指定区间字符串的方法
     * @param sb 待反转的字符串转为sb
     * @param start 开始位置
     * @param end 结束位置
     */
    public static void reverseString(StringBuilder sb, int start, int end){
        while (start < end){
            char temp = sb.charAt(end);
            sb.setCharAt(end,sb.charAt(start));
            sb.setCharAt(start,temp);
            start++;
            end--;
        }
    }
}
