package Array;
/**
*@ClassName: DynamicArraySum
*@Description: 动态数据求和
*@Author: fishOcean
*@Date: 2020/10/17 17:17
*@Version: V1.0
 *
 *给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 *
 * 请返回 nums 的动态和。
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 * 示例 2：
 *
 * 输入：nums = [1,1,1,1,1]
 * 输出：[1,2,3,4,5]
 * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 * 示例 3：
 *
 * 输入：nums = [3,1,2,10,1]
 * 输出：[3,4,6,16,17]
 *
 * 动态规划思想
**/


public class DynamicArraySum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

         sum(nums);
    }

    private static void sum(int[] nums){


        //int sumResult[] = new int[nums.length] ;
//        for(int i =0;i < nums.length ;i++){
//             sumResult[i] =0;
//            for(int j =0; j<=i ; j++){
//                if( i == 0){
//                    sumResult[i] =nums[i] ;
//                }else {
//                    sumResult[i] =nums[i] + sumResult[i-1];
//                }
//
//            }
//        }
        for(int i = 1; i< nums.length;i++){
           //nums[i] += nums[i-1];
           nums[i] = nums[i] + nums[i-1];
        }


        for(int i =0;i < nums.length ;i++){
            System.out.println(nums[i]);

        }


    }
}
