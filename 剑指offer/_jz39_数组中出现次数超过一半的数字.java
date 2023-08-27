package 剑指offer;

import java.util.*;

/*
 * url:https://leetcode.cn/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof
 * 思路：一、哈希表法 -- 时间复杂度O(n)、空间复杂度O(n)
 *      二、排序取中法 -- 时间复杂度O(nlogn)、空间复杂度O(1)
 *      三、摩尔投票法 -- 时间复杂度O(n)、空间复杂度O(1)
 */
public class _jz39_数组中出现次数超过一半的数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            int[] array = ListNode.parseArray(string);
            int res = majorityElement(array);
            System.out.println(res);
        }
        scanner.close();
    }
    // 摩尔投屏法
    public static int majorityElement3(int[] nums){
        // 设x为众数
        int x = nums[0];
        // sum为票数
        int sum = 1;
        for(int i = 1; i < nums.length; i++){
            // 判断是否需要重新更换众数人选
            if(sum == 0){
                x = nums[i];
                sum = 1;
            }else {
                // 赞成票与反对票的操作
                if(x == nums[i]){
                    sum += 1;
                }else {
                    sum -= 1;
                }
            }
        }
        return x;
    }
    // 排序法
    public static int majorityElement2(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }


    // 哈希表统计法
    public static int majorityElement(int[] nums){
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> keySet = map.keySet();

        for(int key : keySet){
            if(map.get(key) > len/2){
                return key;
            }
        }

        return nums[0];
    }
}
