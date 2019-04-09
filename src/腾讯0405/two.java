package 腾讯0405;

import java.util.Scanner;

/**
 * Created by lenovo on 2019/4/5.
 */
public class two {
    public static void main(String[] args) {
        int n;
        Scanner read = new Scanner(System.in);
        while(read.hasNext()){
            n = read.nextInt();
            long[] d = new long[n];
            int[] p = new int[n];
            for(int i=0;i<n;i++){
                d[i] = read.nextLong();
            }
            for(int i=0;i<n;i++){
                p[i] = read.nextInt();
            }
            long[] fn = new long[n];//记录当前拥有的武力值
            int sum = p[0];//记录需要的金币
            fn[0] = d[0];
            for(int i=1;i<n;i++){
                if(fn[i - 1 ] > d[i]){
                    fn[i] = fn[i - 1];
                    continue;
                }else{
                    fn[i] = fn[i-1] + d[i];
                    sum += p[i];
                    continue;
                }
            }
            System.out.println(sum);
        }
    }
}
