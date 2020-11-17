package Array;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * 奇偶排序
 *
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 * 示例：
 *
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 */
public class ParitySortingArray {

    public static void main(String[] args) {
        int[] a = {4,2,5,7};

        Arrays.stream(new ParitySortingArray().paritySorting(a)).forEach(e -> System.out.println(e));
    }

    private int[] paritySorting(int[] arry){
        int[] ans = new int[arry.length];
        int i = 0; int j = 1;int z = 0;
        for (int a: arry
             ) {
            if(arry[z] % 2==0){
                ans[i] = a;
                i = i+2;
            }else {
                ans [j] = a;
                j = j+2;
            }
        z++;
        }


        return ans;
    }

}
