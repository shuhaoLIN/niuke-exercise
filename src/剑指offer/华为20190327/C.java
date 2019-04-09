package 剑指offer.华为20190327;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lenovo on 2019/3/27.
 */
public class C {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        point[] points = new point[n];
        Set<Integer> seth = new HashSet<>();
        Set<Integer> sets = new HashSet<>();
        Set<Integer> setz = new HashSet<>();//记录最左上角端的横坐标
        Set<Integer> sety = new HashSet<>();//记录最右上角端的横坐标

        int[][] shuiguo = new int[40][50];
        for (int i = 0; i < n; i++) {
            int x = read.nextInt();
            int y = read.nextInt();
            points[i] =  new point();
            points[i].x = x;
            points[i].y = y;
            shuiguo[x][y] = 1;
            if(shuiguo[x][0] != 1)shuiguo[x][0] = -1;
            if(shuiguo[0][y] != 1)shuiguo[0][y] = -1;
            if(x - y > 0 &&  shuiguo[x -y][0] != 1){
                shuiguo[x -y][0] = -1;
            }else if(shuiguo[0][y - x] != 1){
                shuiguo[0][y - x] = -1;
            }
//
//            if(y - x > 0 &&  shuiguo[x -y][0] != 1){
//                shuiguo[x -y][0] = -1;
//            }else if(shuiguo[0][y - x] != 1){
//                shuiguo[0][y - x] = -1;
//            }
//            //seth.add(y);
//            //sets.add(x);
        }
        if(n == 1){
            System.out.println(1);
        }else{
            if(n == 2){
                double a = points[0].x / points[1].x;
                double b = points[0].y / points[1].y;
                if(a != b){
                    System.out.println(2);
                }else{
                    System.out.println(1);
                }
            }
            else{
                //从3开始
                int min = Integer.MAX_VALUE;
                int h = 0;
                int s = 0;
                int l = 0;
                int r = 0;
                for(int i=0;i<n;i++){
                    int x = points[i].x;
                    int y = points[i].y;
                    for(int j = 0;j<50;j++){
                        if(shuiguo[x][j] == 1){
                            h++;
                        }
                    }
                    for(int j = 0;j<40;j++){
                        if(shuiguo[j][y] == 1){
                            s++;
                        }
                    }
                    //左上角
                    for(int j = 0;x+j < 40 && y + j < 50;j++){
                        if(shuiguo[x+j][y+j] == 1) {
                            l++;
                        }
                    }
                    for(int j = 0;x-j  >= 0 && y-j >=0;j++){
                        if(shuiguo[x-j][y-j] == 1) {
                            l++;
                        }
                    }

                }
            }
        }
    }
    static class point{
        int x;
        int y;
    }
}

