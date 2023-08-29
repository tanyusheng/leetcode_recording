package 剑指offer;

/*
 *  url:https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof
 *  思路：
 *  概念：二叉树的深度是指当前节点到根节点的最长简单距离
 *       二叉树的高度是指当前节点到叶子节点的最长简单距离
 *      二叉树最大深度可以理解为：叶子节点到根节点的最长距离本质上与根节点与叶子节点的最大距离相等，
 *       所以可以使用二叉树的后续遍历，从叶子节点开始讲高度返回给上一层。
 */
public class _jz55_1_二叉树的深度 {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = maxDepth(root.left);
        int rightH = maxDepth(root.right);
        return 1 + Math.max(leftH,rightH);
    }


}
