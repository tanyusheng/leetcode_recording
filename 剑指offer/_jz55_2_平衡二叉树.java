package 剑指offer;

/*
 *  url:https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/
 *  概念：二叉树任意节点左右子树的高度差不能超过1即为平衡二叉树；
 *  求高度用后序遍历，求深度用前序遍历
 */
public class _jz55_2_平衡二叉树 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root){
        int res = getHeight(root);
        if(res == -1){
            return false;
        }
        return true;
    }

    int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHight = getHeight(root.left);
        if(leftHight == -1){
            return -1;
        }
        int rightHight = getHeight(root.right);
        if(rightHight == -1){
            return -1;
        }
        int res = 0;
        if(Math.abs(leftHight - rightHight) > 1){
            res = -1;
        }else {
            res = 1+Math.max(leftHight,rightHight);
        }
        return res;
    }
}
