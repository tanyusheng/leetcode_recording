package 每日一题;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/fizz-buzz/
 * @author swift
 *	思路：暴力法：对小于等于n的每一个数进行判断，如果同时对3对5取余都等于0，则输出FizzBuzz
 *		否则如果对3取余等于0输出fizz,对5取余对于0输出Buzz,如果都不等于0则输出由整数转的字符。
 */
public class _412_FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<String>();
		for(int i = 1;i<=n;i++) {
			if(i%3 == 0 && i%5==0) {
				res.add("FizzBuzz");
			}else {
				if(i%3 == 0) {
					res.add("Fizz");
				}else if(i%5 == 0) {
					res.add("Buzz");
				}else{
				res.add(i+"");
				}
			}
		}
		return res;
	}
		
	
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			int n = cinScanner.nextInt();
			System.out.println(fizzBuzz(n));
			
		}
	}
}
