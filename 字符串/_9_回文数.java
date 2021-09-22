package 字符串;

import java.util.Scanner;

public class _9_回文数 {
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int n = cinScanner.nextInt();
			System.out.println(isPalindrome(n));
		}
		
	}
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		// 把整数转为字符串
		String str = x+"";
		if(str.length()==1) {
			return true;
		}
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)==str.charAt(right)) {
				left++;
				right--;
			}else {
				return false;
			}
		}
		return true;
	}
}
