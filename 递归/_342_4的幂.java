package 递归;

import java.util.ArrayList;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/power-of-four/
 * @author swift
 *
 */
public class _342_4的幂 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			List<Boolean> list = new ArrayList<>();
			list.add(isPowerOfFour(i));
			System.out.println(list.toString());
		}
		
	}
	public static boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        else if(n==1) return true;
        else {
        	return n%4==0 && isPowerOfFour(n/4);
        }
    }
}
