package 二分查找;
/**
 * https://leetcode-cn.com/problems/first-bad-version/submissions/
  * 思路：二分查找；算法思想很简单，但是有很多细节。要考虑好边界问题。
 * @author swift
 *
 */
public class _278_第一个错误的版本 extends VersionControl{
	public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while(left<right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)){
                right = mid;
            }else{
                left = mid+1;
            }           
        }
        return left;
    }
}

class VersionControl{
	boolean isBadVersion(int version) {
		return false;
	}
}