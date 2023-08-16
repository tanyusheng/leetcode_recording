package 剑指offer;

/**
 * url:https://leetcode.cn/problems/ti-huan-kong-ge-lcof/description/?envType=study-plan-v2&envId=coding-interviews
 * 思路：遍历字符串然后通过StringBuild重新构造字符串
 */

import java.util.Scanner;

public class _jz05_替换空格 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            String res = replaceSpace(s);
            System.out.print(res);
        }
        scanner.close();
    }

    public static String replaceSpace(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
