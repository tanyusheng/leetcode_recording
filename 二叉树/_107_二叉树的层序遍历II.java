package 二叉树;
/**
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 * 二叉树的层序遍历||
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _107_二叉树的层序遍历II {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode() {
			// TODO Auto-generated constructor stub
		}
		public TreeNode(int val) {
			this.val = val;
		}
		public TreeNode(int val,TreeNode left,TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	/**
	 * 思路：使用队列来进行层次遍历，这题结果要返回成二维数组，把每一层的结果
	 * 存储在一个临时列表中，最后在加入到二维数组中即可。
	 * @param root
	 * @return
	 */
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		// 定义一个保存结果的数组链表
        LinkedList<List<Integer>> res = new LinkedList<>();
        if(root == null){
            return res;
        }
        // 定义一个由二叉树节点构成的队列
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
        	int count = queue.size();
        	List<Integer> list = new ArrayList<>();
        	while(count>0) {	// 将每一层的结果保存在临时列表list中
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null) {
                	queue.offer(node.left);
                }
                if (node.right != null) {
    				queue.offer(node.right);
    			}
                count--;
        	}
            res.addFirst(list);//为了反转链表，每次在尾部插入即可
        }
        return res;
        
    }
	
}
