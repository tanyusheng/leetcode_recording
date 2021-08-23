package 递归;
/**
 * https://leetcode-cn.com/problems/power-of-three/
 * @author swift
 *
 */
public class _326_3的幂 {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(3));
	}
	public static boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        else if(n==1) return true;
        else{
        	return n%3==0 && isPowerOfThree(n/3);
        }
        
    }
}
