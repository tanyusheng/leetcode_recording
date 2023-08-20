package 剑指offer;

import java.util.Scanner;
import java.util.Stack;

public class _jz58_反转单词顺序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            String s = reverseWords(str);
            System.out.println(s);
        }
        scanner.close();
    }

    public static String reverseWords(String s){
        Stack<String> stack = new Stack<>();
        String[] words = s.split("\\s+");
        int len = words.length;
        StringBuilder sb = new StringBuilder();
        for(int i = len-1; i >= 0; i--){
            if(i == 0){
                sb.append(words[i]);
            }else {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
