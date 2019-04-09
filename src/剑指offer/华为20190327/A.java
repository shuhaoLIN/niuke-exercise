package 剑指offer.华为20190327;

import java.util.Scanner;

/**
 * Created by lenovo on 2019/3/27.
 */
public class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String str = read.next();
        for(int i = 0;i<str.length();i+=9){
            if(str.charAt(i) == '1'){
                System.out.print(str.substring(i+1,i+9));
            }else{
                for(int j=i+8;j>=i+1;j--){
                    System.out.print(str.charAt(j));
                }
            }
            if(i != str.length() - 9){
                System.out.print(" ");
            }
        }
    }
}
