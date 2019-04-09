package 剑指offer;

/**
 * Created by lenovo on 2019/3/16.
 */
public class RebuildBinaryTree {
    /**
     * Definition for binary tree*/
     public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
      }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(0 == pre.length){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        int mid = -1;
        for(int i=0;i<in.length;i++){
            if(in[i] == pre[0]) {
                mid = i;
                break;
            }
        }
        int[] left = new int[mid];
        int[] right = new int[in.length - mid - 1];
        int[] preL = new int[mid];
        int[] preR = new int[in.length - mid - 1];

        for(int i=1;i<pre.length;i++){
            if(i <= mid){
                preL[i - 1] = pre[i];
            }else{
                preR[i - mid - 1] = pre[i];
            }
        }
        for(int i=0;i<in.length;i++){
            if(i < mid){
                left[i] = in[i];
            }else if(i > mid){
                right[i - mid - 1] = in[i];
            }
        }
        root.left = reConstructBinaryTree(preL,left);
        root.right = reConstructBinaryTree(preR,right);
        return root;
    }
}
