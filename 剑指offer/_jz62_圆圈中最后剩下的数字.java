package 剑指offer;

/*
 * url:https://leetcode.cn/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof
 * 思路：这是一道约瑟夫环经典问题
 *  公式法：存活的数字下标f(n,m) = (f(n-1,m)+m)%n
 *  思路题解文章：https://blog.csdn.net/u011500062/article/details/72855826
 *
 */

import java.util.ArrayList;

public class _jz62_圆圈中最后剩下的数字 {
    public static void main(String[] args) {

    }

    public int lastRemaining(int n, int m){
        // 将约瑟夫环转为数组
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }
        // 根据公式得到存活人员的下标
        int ans = 0;
        // 最后一轮是2个人，所以从最后一轮开始往前推
        // f(n+1,m) = (f(n,m)+m)%n
        for(int i = 2; i <= n; i++){
            ans = (ans + m) % i;
        }
        return ans;
    }
}
