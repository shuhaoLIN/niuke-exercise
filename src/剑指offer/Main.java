package 剑指offer;
//问题：滑动窗口
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] num = {16,14,12,10,8,6,4};
        ArrayList<Integer> list = m.maxInWindows(num,5);
        for (int o :
                list) {
            System.out.println(o);
        }
    }
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> result = new ArrayList<>();
        if(size == 1){
            for(int i=0;i<num.length;i++){
                result.add(num[i]);
            }
            return result;
        }
        //记录每一个最大值以及第二大值，然后最多就会消去最大值，但是肯定有一个是给下一个size用的。
        int maxone = Integer.MIN_VALUE;
        int indexone = -1;
        int maxtwo = Integer.MIN_VALUE;
        int indextwo = -1;
        for(int i=0;i<num.length;i++){
            System.out.println("maxone"+maxone +"  "+indexone);
            System.out.println("maxtwo"+maxtwo +"  "+indextwo);
            //if( i + 1 > size) {
            if(num[i] > maxone){
                maxtwo = maxone;
                indextwo = indexone;

                maxone = num[i];
                indexone = i;
            }else{
                if(num[i] > maxtwo){
                    maxtwo = num[i];
                    indextwo = i;
                }
            }

            //}
            if( i + 1 >= size) {//这就来到了每一次的最大值提取处了。
                result.add(maxone);
                //如果是最先开始的那一个是最大
                if(indexone == i - size + 1){
                    maxone = maxtwo;
                    indexone = indextwo;
                    maxtwo = Integer.MIN_VALUE;
                    indextwo = -1;
                }else if(indextwo == i - size + 1){
                    maxtwo = Integer.MIN_VALUE;
                    indextwo = -1;
                }
            }
        }
        return result;
    }
}