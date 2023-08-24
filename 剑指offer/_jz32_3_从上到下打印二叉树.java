package 剑指offer;

/*
 * url:https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof
 * 思路：设置一个标志位flag，每隔一次反转一次层级list；
 */

import java.util.*;

/**
 *
 */
public class _jz32_3_从上到下打印二叉树 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root){
        if(root == null){
            return new LinkedList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        // 定义一个链表数组存储最终结果
        List<List<Integer>> res = new LinkedList<>();
        queue.offer(root);
        // 定义flag为true则正向打印层级列表
        boolean flag = true;
        while (!queue.isEmpty()){
            List<Integer> list = new LinkedList<>();
            int count = queue.size();
            for(int i = 0; i < count; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
            // 如果为假则反转list
            if(!flag){
                Collections.reverse(list);
            }
            flag = !flag;
            res.add(list);
        }
        return res;
    }
}
