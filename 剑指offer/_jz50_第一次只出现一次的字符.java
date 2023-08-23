package 剑指offer;

import java.util.HashMap;

/**
 * url：https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
 *
 */
public class _jz50_第一次只出现一次的字符 {
    public static void main(String[] args) {

    }

    public char firstUniqChar(String s){
        if (s.equals("")){
            return ' ';
        }
        // 存储一个哈希表存储各个字符是否为独特的
        HashMap<Character,Boolean> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for(char c : charArray){
            if(!map.containsKey(c)){
                map.put(c,true);
            }else {
                map.put(c,false);
            }
        }
        // 查询找到第一个出现的独特字符
        for(char c : charArray){
            if(map.get(c)){
               return c;
            }
        }
        return ' ';
    }
}
