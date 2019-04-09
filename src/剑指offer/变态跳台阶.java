package 剑指offer;

/**
 * Created by lenovo on 2019/3/16.
 */
public class 变态跳台阶 {
    public static void main(String[] args) {

    }
    public int JumpFloorII(int target) {
        int a=1;
        return a<<(target-1);
        /*if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int[] num = new int[target+1];
        num[1] = 1;
        num[2] = 2;
        for(int i = 3;i<=target;i++){
            num[i] = 2 * num[i-1];
        }
        return num[target];*/
    }
}
