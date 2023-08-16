package 牛客101;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

/**
 * 题目描述：有两个整型数组A和B，要求找出存在数组A中而不存在数组B中的元素，并打印输出
 */
public class _BM_找出在A非B的元素 {
    public static void main(String[] args) {
        Scanner ciScanner = new Scanner(System.in);
        String strA = ciScanner.nextLine();
        int[] arrayA = parseArray(strA);
        String strB = ciScanner.nextLine();
        int[] aArrayB = parseArray(strB);
        
        int[] res = resolve(arrayA, aArrayB);
        for(int i : res){
            System.out.print(i+",");
        }
        System.out.println("");
        ciScanner.close();
        
    }

    public static int[] parseArray(String input){
        String[] parts = input.split(",");
        int[] array = new int[parts.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(parts[i].trim());
        }
        return array;
    }

    public static int[] resolve(int[] aArray, int[] bArray){
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int j: bArray){
            set.add(j);
        }
        for(int i:aArray){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for(int i : list){
            res[index++] = i;
        }
        return res;
    }


}
