package 腾讯2017暑假实习生编程题;

import java.util.Scanner;

/**
 * Created by lenovo on 2019/3/16.
 */
public class Main {

        public static void main(String[] args){
            Scanner read = new Scanner(System.in);

//            int a = 1;
//            int b = 1;
//            System.out.println(a ^ b);
            while(read.hasNext()){
                String s1 = read.next();
                String s2 = new StringBuilder(s1).reverse().toString();
                int[][] dp = new int[s1.length()+1][s2.length()+1];
                //为什么要构造一个+1的数组：因为要初始化零，并且方便后面的操作。
                //从一开始，但是比较还是从0开始的
                for(int i=1;i<=dp.length;i++){
                    for(int j=1;j<=dp[0].length;j++){
                        dp[i][j] = (s1.charAt(i-1) == s2.charAt(j-1) ? dp[i-1][j-1] + 1 : Math.max(dp[i][j-1], dp[i-1][j]));
                    }
                }
                System.out.println(s1.length() - dp[s1.length()][s2.length()]);
            }
        }

}
