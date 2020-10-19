package String;
/**
*@ClassName: BackspaceStringCompare
*@Description: 比较含退格的字符串
*@Author: fishOcean
*@Date: 2020/10/19 19:43
*@Version: V1.0
 *
 *给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。
 *
 * 示例 1：
 *
 * 输入：S = "ab#c", T = "ad#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “ac”。
 * 示例 2：
 *
 * 输入：S = "ab##", T = "c#d#"
 * 输出：true
 * 解释：S 和 T 都会变成 “”。
 * 示例 3：
 *
 * 输入：S = "a##c", T = "#a#c"
 * 输出：true
 * 解释：S 和 T 都会变成 “c”。
 * 示例 4：
 *
 * 输入：S = "a#c", T = "b"
 * 输出：false
 * 解释：S 会变成 “c”，但 T 仍然是 “b”。
 *
 */
public class BackspaceStringCompare {

    public static void main(String[] args) {
       String s = "a##c";
       String t = "#a#c";
        System.out.println(compare(s,t));
    }

    /**
     * 方法一：重构字符串
     * 思路及算法
     * 最容易想到的方法是将给定的字符串中的退格符和应当被删除的字符都去除，还原给定字符串的一般形式。然后直接比较两字符串是否相等即可。
     * 具体地，我们用栈处理遍历过程，每次我们遍历到一个字符：
     * 如果它是退格符，那么我们将栈顶弹出；
     * 如果它是普通字符，那么我们将其压入栈中。
     * @param str
     * @return
     */
   private static String build1(String str){
        StringBuilder ret = new StringBuilder();
        char[] temp  = str.toCharArray();
        for (int i= 0; i< temp.length;i++){
            if(temp[i] !='#'){
                 ret.append(temp[i]);//如果它是普通字符，那么我们将其压入栈中
            }else {
               if(ret.length() >1){
                   ret.deleteCharAt(ret.length()-1);//如果它是退格符，那么我们将栈顶弹出；
               }
            }
        }
        return ret.toString();
   }

   private static boolean compare(String s,String t){
        return build1(s).equals(build1(t));
   }
}
