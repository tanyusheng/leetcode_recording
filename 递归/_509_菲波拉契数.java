package 递归;
/**
 * https://leetcode-cn.com/problems/fibonacci-number/
 * @author swift
 *
 */
public class _509_菲波拉契数 {
	public int fib(int n) {
        if(n==0 || n==1) return n;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
