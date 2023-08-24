package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * url:https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
 */
public class _jz32_1_从上到下打印二叉树 {
    public static void main(String[] args) {

    }

    public int[] levelOrder(TreeNode root){
        if(root == null){
            return new int[]{};
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int count = queue.size();
            while (count > 0){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                count--;
            }
            for(Integer i : list){
                res.add(i);
            }
        }
        int[] array = new int[res.size()];
        for(int i = 0; i < res.size();i++){
            array[i] = res.get(i);
        }
        return array;
    }
}
