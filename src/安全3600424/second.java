package 安全3600424;

import java.util.*;

/**
 * Created by lenovo on 2019/4/24.
 */
public class second {
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static int longpath(int[][] matrix) {
        int[][] num = new int[matrix.length][matrix[0].length];
        int maxi = 0;
        int maxj = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        Map<Integer, Integer> mapxy = new HashMap<>();

        for(int i=0;i<matrix.length;i++){

            for(int j = 0;j<matrix[0].length;j++){
                count = 0;
                if(i - 1 >=0 ){
                    if(matrix[i-1][j] > matrix[i][j]){
                        count++;
                    }
                }
                if(j - 1 >= 0){
                    if(matrix[i][j-1] > matrix[i][j]){
                        count++;
                    }
                }
                if(i + 1 < matrix.length){
                    if(matrix[i + 1][j] > matrix[i][j]){
                        count++;
                    }
                }
                if(j+1 < matrix.length){
                    if(matrix[i][j+1] > matrix[i][j]){
                        count++;
                    }
                }
                num[i][j]  = count;
                if(count >= max){
                    max = count;
                    maxi = i;
                    maxj = j;
                    mapxy.put(maxi, maxj);
                }
            }
        }
        int numsss = 0;
        for(int i = maxi,j = maxj; maxi >=0 && maxi < matrix.length &&
                maxj >=0 && maxj < matrix[0].length;){
            int a = i - 1 >= 0 ? num[i - 1][j] : 0;
            int b = j - 1 >= 0 ? num[i][j - 1] : 0;
            int c = i + 1 >= 0 ? num[i + 1][j] : 0;
            int d = j + 1 >= 0 ? num[i][j + 1] : 0;
            if( a > b && a > c && a > d){
                i = i-1;
                j = j;
                numsss++;

                continue;
            }
            else if(b > a && b > c && b >d){
                i = i;
                j = j - 1;
                numsss++;
                continue;
            }else if(c > a && c > b && c > d){
                i = i+ 1;
                numsss++;

                continue;
            }else if( d > a && d > b && d >c){
                j = j + 1;
                numsss++;

                continue;
            }

        }



//        Iterator iter = mapxy.entrySet().iterator();
//        int maxroad = 0;
//        while(iter.hasNext()){
//            Map.Entry entry = (Map.Entry) iter.next();
//            int key = (int) entry.getKey();
//            int val = (int) entry.getValue();
//
//            Stack<Integer> dir = new Stack<>(); //记录通往的方向，后面要进行回溯
//            boolean[][] flag = new boolean[matrix.length][matrix[0].length];
//
//            while(true){
//                int a = key - 1 >= 0 ? num[key - 1][val] : 0;
//                int b = val - 1 >= 0 ? num[key][val - 1] : 0;
//                int c = key + 1 >= 0 ? num[key + 1][val] : 0;
//                int d = val + 1 >= 0 ? num[key][val + 1] : 0;
//
//                if( a > b && a > c && a > d){
//                    maxroad++;
//                    key
//                }
//
//            }
//
//        }


        //System.out.println(maxi +" " + maxj+"   "+ max);
        return numsss;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _matrix_rows = 0;
        int _matrix_cols = 0;
        _matrix_rows = Integer.parseInt(in.nextLine().trim());
        _matrix_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _matrix = new int[_matrix_rows][_matrix_cols];
        for(int _matrix_i=0; _matrix_i<_matrix_rows; _matrix_i++) {
            for(int _matrix_j=0; _matrix_j<_matrix_cols; _matrix_j++) {
                _matrix[_matrix_i][_matrix_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = longpath(_matrix);
        System.out.println(String.valueOf(res));

    }
}
