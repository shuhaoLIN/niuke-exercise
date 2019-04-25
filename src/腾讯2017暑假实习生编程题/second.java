package 腾讯2017暑假实习生编程题;

/**
 * Created by lenovo on 2018/8/31.
 */

import java.util.Scanner;

/**
 * 小Q最近遇到了一个难题：把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。
 你能帮帮小Q吗？
 使用简单粗暴的方法，将字母小写的先输出来
 再将字母大写的输出来
 */
public class second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ){
                    System.out.print(str.charAt(i));
                }
            }
            for(int i=0;i<str.length();i++){
                if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
        sc.close();
    }


}

/**
 * 答案区里面的一个答案，使用函数将其大小写字母转换为空后输出。
 */
class Main1{
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        String str = scan.nextLine();
        System.out.println(getResult(str));
        }
        }
        public static String getResult(String str){
            return str.replaceAll("[A-Z]","")+str.replaceAll("[a-z]","");
        }
}

