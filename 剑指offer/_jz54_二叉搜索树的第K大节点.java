package 剑指offer;

/*
 *  url: https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof
 *  思路：中序遍历二叉搜索树可以生成一个有序数组，第K大则为逆序数组第K个；
 *      可以通过 right - root - left的方式遍历成逆序数组
 */
public class _jz54_二叉搜索树的第K大节点 {
    public static void main(String[] args) {

    }

    int k = 0;
    int target = 0;
    public int kthLargest(TreeNode root, int k){
        this.k = k;
        right_root_left(root);
        return target;
    }

    public void right_root_left(TreeNode root){
        if(root == null){
            return;
        }
        right_root_left(root.right);
        k--;
        if(k == 0){
            this.target = root.val;
        }
        right_root_left(root.left);
    }
}
