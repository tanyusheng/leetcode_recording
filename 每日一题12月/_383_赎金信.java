package 每日一题12月;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/ransom-note/
 * 	思路：哈希表
 */
public class _383_赎金信 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean flag = true;
        // 把magazine存入HashMap
        Map<Character,Integer> map = new HashMap<>();
        for(Character i : magazine.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        // 对ransomNode中的每一个单词进行遍历
        for(int j = 0; j < ransomNote.length(); j++){
            Character character = ransomNote.charAt(j);
            if(map.containsKey(character) && map.get(character) > 0){
                map.replace(character,map.get(character)-1);
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            String ransomNote = cin.next();
            String magazine = cin.next();
            boolean res = canConstruct(ransomNote,magazine);
            System.out.println(res);
        }
    }
}
