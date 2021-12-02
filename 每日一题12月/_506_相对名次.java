package 每日一题12月;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/relative-ranks/
 * 思路：先对数组score进行拷贝，然后进行排序，将排序好的数组存入哈希表，key为分数，value为倒数名次(i)
 *      最后对原始数组中的score依次在哈希表中根据分数查找名次，最终将前三名设置一个特定字符串即可。
 */
public class _506_相对名次 {
    public static String[] findRelativeRanks(int[] score) {
        int len = score.length;
        String[] res = new String[len];
        int[] sourceArray = score.clone();
        Arrays.sort(score);
        // 按<分数,倒数名次>存储到哈希表，（0 ~ len-1）
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            map.put(score[i],i);
        }
        // 查询结果
        for (int i = 0; i < len; i++){
            // 获取名次
            int level = len - map.get(sourceArray[i]);
            if(level == 1) res[i] = "Gold Medal";
            else if(level == 2) res[i] = "Silver Medal";
            else if(level == 3) res[i] = "Bronze Medal";
            else res[i] = String.valueOf(level);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            String[] strs = str.split(",");
            int[] score = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                score[i] = Integer.parseInt(strs[i]);
            }
            String[] result = findRelativeRanks(score);
            System.out.println(Arrays.toString(result));
        }
    }
}

