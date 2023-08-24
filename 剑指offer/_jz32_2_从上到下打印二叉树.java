package 剑指offer;

/*
 * url:https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _jz32_2_从上到下打印二叉树 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root){
        if (root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        // 定义一个数组列表存储结果
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()){
            int count = queue.size();
            // 创建一个临时列表存储每一层的节点
            List<Integer> list = new ArrayList<>();
            while (count > 0){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                count--;
            }
            res.add(list);
        }
        return res;
    }
}
