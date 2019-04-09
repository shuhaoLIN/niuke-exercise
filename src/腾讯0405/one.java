package 腾讯0405;

import java.util.Scanner;

/**
 * Created by lenovo on 2019/4/5.
 */
public class one
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while(read.hasNext()){
            int n = read.nextInt();
            long s = read.nextLong();
            long[] num = new long[n];
            long sum = 0;
            long min = Long.MAX_VALUE;
            for(int i=0;i<n;i++){
                num[i] = read.nextLong();
                sum+= num[i];
                if(num[i] < min){
                    min = num[i];
                }
            }
            if(sum >= s){
                if(((sum-s) / n ) > min)
                    System.out.println(min);
                else System.out.println((sum - s ) / n);
            }else{
                System.out.println(-1);
            }
        }
    }
}
