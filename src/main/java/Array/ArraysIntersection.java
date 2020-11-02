package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 *  
 *
 * 说明：
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 */
public class ArraysIntersection {
    public static void main(String[] args) {
     int[] nums1 = {4,9,5};
     int[] nums2 = {9,4,9,8,4};
     intersection(nums1,nums2);

    }

    private static void intersection(int[] nums1,int[] nums2){
        Set<Integer> temp = new HashSet<Integer>();
        int pre = 0;
        for ( int a:
             nums1) {
            for (int b:
                 nums2) {
                if (a==b){
                    temp.add(a);

                }
            }
        }
        int[] intersection = new int[temp.size()];
        int index = 0;
        for (int a:
             temp) {
            intersection[index] = a;
            index++;
            System.out.println(a);
        }

    }

}
