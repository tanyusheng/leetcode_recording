package 排序;

import java.util.Arrays;

public class _88_合并两个有序数组 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=m,j=0;i<m+n;i++,j++) {
			nums1[i]=nums2[j];
		}
		Arrays.parallelSort(nums1);
    }
}
