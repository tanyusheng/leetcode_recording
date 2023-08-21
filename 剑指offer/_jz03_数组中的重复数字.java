package 剑指offer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _jz03_数组中的重复数字 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] array = ListNode.parseArray(s);
        System.out.println(findRepeatNumber(array));
    }

    public static int findRepeatNumber(int[] nums){

        int rep = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                rep = num;
            } else {
                set.add(num);
            }
        }
        return rep;
    }
}
