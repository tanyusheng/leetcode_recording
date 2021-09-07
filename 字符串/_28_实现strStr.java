package 字符串;

/**
 * https://leetcode-cn.com/problems/implement-strstr/
  *  思路：在母串中使用与子串同样长的字符串，使用equals方法进行比较是否相等。
  *  在母串中获取子串的方式是subString(start,end)
 */
import java.util.Scanner;

public class _28_实现strStr {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNextLine()) {
			String haystackString  = cin.next();
			String needleString = cin.next();
			int result = strStr(haystackString, needleString);
			System.out.println(result);
		}
	}
	public static int strStr(String haystack, String needle) {
		if (needle.length()==0) {
			return 0;
		}
		for(int i=0;i<=haystack.length()-needle.length();i++) {
			if(needle.equals(haystack.substring(i, i+needle.length()))) {
				return i;
			}
		}
		return -1;
    }
}
