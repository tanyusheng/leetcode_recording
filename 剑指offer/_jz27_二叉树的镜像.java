package 剑指offer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _jz27_二叉树的镜像 {
    public static void main(String[] args) {

    }

    public TreeNode mirrorTree(TreeNode root){
        if(root == null) return null;
        // 定义一个临时节点用来存储当前节点的左子树
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);

        return root;
    }
}
