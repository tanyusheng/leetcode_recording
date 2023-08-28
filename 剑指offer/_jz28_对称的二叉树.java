package 剑指offer;

/*
 *  url:https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof
 *  思路：递归
 *
 */
public class _jz28_对称的二叉树 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root){
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode tree1, TreeNode tree2) {
        if(tree1 == null ^ tree2 == null){
            return false;
        }
        if(tree1 == null & tree2 == null){
            return true;
        }
        // 判断是否头相等
        boolean isVal = tree1.val == tree2.val;
        // 头相等且满足左孩子与右孩子相等，右孩子与左孩子相等，才算对称二叉树
        return isVal && isSymmetric(tree1.left,tree2.right) && isSymmetric(tree1.right,tree2.left);
    }

}
