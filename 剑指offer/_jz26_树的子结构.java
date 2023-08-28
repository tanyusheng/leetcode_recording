package 剑指offer;

/*
 *  url:https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof
 *  思路：1. 在A树中找到与B树根节点值相同的节点P
 *              B树有的子节点，A树必须有；
 *              B树没有的子节点，A树可以有；
 *
 */
public class _jz26_树的子结构 {
    public static void main(String[] args) {

    }

    /**
     * 寻找相同根节点
     * @param A A树
     * @param B B树
     * @return B树是否是A树的子结构
     */

    public boolean isSubStructure(TreeNode A, TreeNode B){
        if(A == null || B == null){
            return false;
        }
        if(A.val == B.val && isContain(A,B)){
            return true;
        }
        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    /**
     * 功能：比较是否包含
     * @param node1 A树的子结构
     * @param node2 B树的子结构
     * @return A树是否包含B树的所有节点
     */
    private boolean isContain(TreeNode node1, TreeNode node2){
        //A树的子结构为空，B树不为空，说明A树不包含B树子结构
        if(node1 == null && node2 != null){
            return false;
        }
        if(node2 == null){
            return true;
        }
      return node1.val == node2.val && isContain(node1.left,node2.left)&&isContain(node1.right,node2.right);
    }
}
