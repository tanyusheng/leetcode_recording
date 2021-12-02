package 每日一题10月11月;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode-cn.com/problems/k-th-smallest-prime-fraction/
 * @author swift
 *	思路:暴力求解，定义一个list存储数组结果。然后重写比较器排序
 *		二分法、优先队列法有待后续完善
 */
public class _786_第K个最小素数分数 {
	public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
		int n = arr.length;
		if(n == 2) return arr;
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < n-1 ; i++) {
			for (int j = i+1; j < n; j++) {
				list.add(new int[] {arr[i],arr[j]});
			}
		}
		Collections.sort(list,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] * o2[1] - o1[1] * o2[0];
			}
		});
		return list.get(k-1);
    }
	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		while(cinScanner.hasNext()) {
			String string = cinScanner.next();
			cinScanner.nextLine();
			int k = cinScanner.nextInt();
			String[] strings = string.split(",");
			int[] arr = new int[strings.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(strings[i]);
			}
			int[] res = kthSmallestPrimeFraction(arr, k);
			System.out.println(Arrays.toString(res));
		}
	}
}
