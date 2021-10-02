package 哈希表;

import java.util.HashSet;
import java.util.List;
/**
 * https://leetcode-cn.com/problems/destination-city/submissions/
 * @author swift
 *	思路：旅行的终点必然存在于【cityA,cityB】的cityB中
 *		依次遍历list,将每一个list的cityA存入HashSet中；
 *		再遍历list中的cityB,如果其不存在与HashSet中，则说明它是终点。
 */
public class _1436_旅行终点站 {
	public String destCity(List<List<String>> paths) {
		HashSet<String> cities = new HashSet<>();
		for(List<String> path:paths) {
			cities.add(path.get(0));
		}
		for(List<String> path:paths) {
			if(!cities.contains(path.get(1))) {
				return path.get(1);
			}
		}
		return "";
	}
	
}
