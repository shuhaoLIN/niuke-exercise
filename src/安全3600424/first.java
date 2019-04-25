package 安全3600424;

import java.util.*;

/**
 * Created by lenovo on 2019/4/24.
 */
public class first {
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/



    static int n;
    static int[] nums;
    static Map<Integer, Integer> map;
    static int main() {
        int min = Integer.MAX_VALUE;
        int minkey = 0;
        if(map.size() == 1){
            return 1;
        }else if(map.size() == 0){
            return 0;
        }
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            int key = (int) entry.getKey();
            int val = (int) entry.getValue();
            if(min > val){
                min = val;
                minkey = key;
            }
        }
        int count = 1;
        boolean flag = false;
        iter = map.entrySet().iterator();
        for(;min >= 2;min--){
            while(iter.hasNext()){
                Map.Entry entry = (Map.Entry) iter.next();
                int key = (int) entry.getKey();
                int val = (int) entry.getValue();
                if(key != minkey && val % min == 0){
                    flag = true;
                    count += val / min;
                }else if(key != minkey && val % min != 0){
                    flag = false;
                    count = 1;
                    break;
                }
            }
        }
        if(flag == true)
            return count;
        return 0;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
        n = in.nextInt();
        nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        map = new TreeMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+ 1);
            }else{
                map.put(nums[i], 1);
            }
        }
//        Iterator iter = map.entrySet().iterator();
//        while(iter.hasNext()){
//            Map.Entry entry = (Map.Entry) iter.next();
//            Object key = entry.getKey();
//            Object val = entry.getValue();
//            System.out.println(key+"  "+val);
//        }
        res = main();
        System.out.println(String.valueOf(res));

    }
}
