package 华为20190327;

import java.util.Scanner;

/**
 * Created by lenovo on 2019/3/27.
 * 整数：还有可能是负数哦。。。。
 */
public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        point[] points = new point[5];

        while(read.hasNext()){
            for(int i=0;i<5;i++){
                points[i] = new point();
                points[i].x = read.nextLong();
                points[i].y = read.nextLong();
                points[i].back = Math.sqrt(Math.pow(points[i].x, 2) + Math.pow(points[i].y, 2));
            }
            long[] minlens = new long[5];
            minlens[0] = getAllPD(points[0],points[1],points[2],points[3],points[4]); //获取以0开头的最小值
            minlens[1] = getAllPD(points[1],points[0],points[2],points[3],points[4]);
            minlens[2] = getAllPD(points[2],points[1],points[0],points[3],points[4]);
            minlens[3] = getAllPD(points[3],points[1],points[2],points[0],points[4]);
            minlens[4] = getAllPD(points[4],points[1],points[2],points[3],points[0]);
            long min = Long.MAX_VALUE;
            for(int i=0;i<5;i++){
                if(minlens[i] <min){
                    min = minlens[i];
                }
            }
            System.out.println(min);
        }
    }
    public static long getAllPD(point a, point b,point c, point d,point e){
        double[] minlens = new double[4];
        minlens[0] = getfivePD(a,b,c,d,e); //获取以a,b开头的值
        minlens[1] = getfivePD(a,c,b,d,e);
        minlens[2] = getfivePD(a,e,b,c,d);
        minlens[3] = getfivePD(a,d,b,c,e);
        double min = Double.MAX_VALUE;
        for(int i = 0;i<4;i++){
            if(minlens[i] < min){
                min = minlens[i];
            }
        }
        return (long)min;
    }
    public static double getfivePD(point a, point b,point c, point d,point e){
        double[] lens = new double[6];
        double min = Double.MAX_VALUE;
        lens[0] = a.back + PD(a,b)+PD(b,c)+PD(c,d)+PD(d,e) + e.back;
        lens[1] = a.back + PD(a,b)+PD(b,c)+PD(c,e)+PD(e,d) + d.back;
        lens[2] = a.back + PD(a,b)+PD(b,d)+PD(d,c)+PD(c,e) + e.back;
        lens[3] = a.back + PD(a,b)+PD(b,d)+PD(d,e)+PD(e,c) + c.back;
        lens[4] = a.back + PD(a,b)+PD(b,e)+PD(e,c)+PD(c,d) + d.back;
        lens[5] = a.back + PD(a,b)+PD(b,e)+PD(e,d)+PD(d,c) + c.back;
        for(int i = 0;i<6;i++){
            if(lens[i] < min){
                min = lens[i];
            }
        }
        return min;
    }
    public static double PD(point a, point b){
        return Math.sqrt(Math.pow(a.x - b.x , 2) + Math.pow(a.y - b.y, 2));
    }
}
class point{
    long x;
    long y;
    double back;
}
