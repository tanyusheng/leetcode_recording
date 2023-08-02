package 回溯;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _39_组合总和 {
	private static int[] canidates;
	// 存放最终结果
	private static List<List<Integer>> res = new ArrayList<>();
	// 存放临时列表
	private static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner cinScanner = new Scanner(System.in);
		List<List<Integer>> res = new ArrayList<>();
		while(cinScanner.hasNext()) {
			String str = cinScanner.next();
			String[] strs = str.split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			int target = cinScanner.nextInt();
			res = combinationSum(nums, target);
			System.out.println(res.toString());
		}
		cinScanner.close();
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		dfs(candidates,0,target);
		return res;		
    }
	
	public static void dfs(int[] candidates,int u, int target) {
		if(target < 0) return;
		if(target == 0) {
			res.add(new ArrayList(list));
			return;
		}
		
		for(int i=u;i<candidates.length;i++) {
			if(candidates[i] <= target) {
				list.add(candidates[i]);
				dfs(candidates, i, target-candidates[i]);
				list.remove(list.size()-1);
			}
		}
	}
}
