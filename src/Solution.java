import java.util.Stack;
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        head.next = a;
        a.next = b;
        a = b;
        a.next = c;

//        System.out.println(1);
        ReverseList(head);
    }
    public static ListNode ReverseList(ListNode head) {
        ListNode pre;
        ListNode mid;
        ListNode aft;
        if(head == null){
            return null;
        }
        else{
            pre = head; //记录pre
            if(head.next == null){
                return pre;
            }
            mid = pre.next; //记录mid
            pre.next = null;//首指针next改为null。
            //mid.next = pre;//先倒转两个

            while(mid.next != null){
                aft = mid.next;
                mid.next = pre;
                pre = mid;
                mid = aft;
            }
            mid.next = pre;
            return mid;
        }
    }
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}