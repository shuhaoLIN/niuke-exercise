package 腾讯0405;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by lenovo on 2019/4/5.
 */
public class three {
    public static void main(String[] args) {
        int n;
        int k;
        Scanner read = new Scanner(System.in);
        while(read.hasNext()){
            n = read.nextInt();
            k = read.nextInt();
            int max = 2 * n;
            //不符合的情况
            if(max - k < k){
                System.out.println(0);
                continue;
            }
            int amax = max - k;
            int bmin = 1 + k;
            if(bmin == amax + 1){
                System.out.println(2);
                continue;
            }
            long up = n - bmin + 1;
            long down = amax - bmin + 1;
            long above = 1;
            long under = down;
            if((down - up + 1) >= up){
                for(int i=1;i<= up;i++) {
                    under *= (down - i);
                    above *= i;
                    if(under % above == 0){
                        under = under / above;
                        above = 1;
                    }
                    for(int j=2;i<300;i++){
                        if(under % j == 0 && above % j == 0){
                            under /= j;
                            above /=j;
                        }
                    }
                }
            }else{
                for(long i=down - up + 1; i < down;i++){
                    under *= i;
                }
                for(long i = 1;i<down - up + 1;i++){
                    above *= i;
                }
            }

            System.out.println((under / above) * 2);
        }
    }

}
