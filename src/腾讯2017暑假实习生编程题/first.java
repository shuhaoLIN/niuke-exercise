package 腾讯2017暑假实习生编程题;

/**
 * Created by lenovo on 2018/8/31.
 */

import java.util.Scanner;

/**
 * 给定一个字符串s，你可以从中删除一些字符，使得剩下的串是一个回文串。如何删除才能使得回文串最长呢？
 输出需要删除的字符个数。
 学习了答案的思维：
 使用动态规划进行编写。
 nums[i][j] 表示cs1前i个字符能够跟cs2前j个字符产生的
最大相等串长（即是原来的回文串）

 */
public class first {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            char[] cs1 = s1.toCharArray();
            char[] cs2 = new StringBuffer(s1).reverse().toString().toCharArray();
            int n = solution(cs1,cs2);
            System.out.println(s1.length()-n);
        }
        sc.close();
    }

    private static int solution(char[] cs1,char[] cs2){
        int len = cs1.length;
        int[][] nums = new int[len+1][len+1];
        for(int i=0;i<=len;i++){
            nums[0][i] = nums[i][0] = 0;
        }
        for(int i=1;i<=len;i++){
            for(int j=1;j<=len;j++){
                if(cs1[i - 1] == cs2[j - 1]){
                    nums[i][j] = nums[i-1][j - 1] + 1;
                }
                else {
                    nums[i][j] = Math.max(nums[i][j-1],nums[i-1][j]);
                }
            }
        }
        return nums[len][len];

    }
}
