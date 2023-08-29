package 剑指offer;

/*
 *  url:https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof
 *  思路：在A树中找到与B树根节点值相同的节点P；
 *       将P节点作为根节点看成P树，与B树进行比较
 *           P树有的子节点，A树必须有；
 *           P树没有的子节点，A树可以有；
 *
 */
public class _jz26_树的子结构 {
    public static void main(String[] args) {

    }

    // 寻找A树中的与B树根节点值相同的P节点
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        // 题目规定空树不是任意一个树的子结构
        if (A == null || B == null) {
            return false;
        }
        // 根节值相同，说明找到P树了
        if (A.val == B.val && isContain(A, B)) {
            return true;
        }
        // 通过递归找到A树里的P树
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    // 检查P树是否包含B树
    private boolean isContain(TreeNode P, TreeNode B) {
        // P树有的节点，B树没有，直接说明B树不配做P树的子结构
        if (P == null && B != null) {
            return false;
        }
        // P树可有可不有的节点，B树没有，那说明B树还是可以作为P树的子结构的
        if (B == null) {
            return true;
        }
        // P树根节点与B树相同，左右子树也相同，这些条件全部达到了，才能说P树包含了B树
        return P.val == B.val && isContain(P.left, B.left) && isContain(P.right, B.right);
    }
}
