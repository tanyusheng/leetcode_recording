package 剑指offer;

/* url:https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 *  思路：1.暴力
 *       2.从左下角开始走
 */
public class _jz04_二维数组的查找 {
    public static void main(String[] args) {

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target){
        int x = matrix.length - 1;
        int y = 0;
        while (x >= 0 && y <= matrix[0].length - 1){
            // 目标值小于当前位置值，则游标上移，x--
            if(target < matrix[x][y]){
                x--;
            // 目标值大于当前位置值，游标右移，y++
            } else if (target > matrix[x][y]) {
                y++;
            }else {
                return true;
            }
        }
        return false;
    }
    public boolean findNumberIn2DArray2(int[][] matrix, int target){
        if(matrix.length == 0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

}
