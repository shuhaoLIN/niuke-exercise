import java.util.*;

/**
 * Created by lenovo on 2019/3/17.
 */
public class testMapAndSoon {
    public static void main(String[] args) {
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        num.add(2,10);
//        for(int i=0;i<num.size();i++){
//            System.out.println(num.get(i));
//        }
//        System.out.println(num.toArray());
//        System.out.println(num.contains(1));

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        linkedList.addFirst(10);
//        linkedList.addLast(1000);
//        for(int i=0;i<linkedList.size();i++){
//            System.out.println(linkedList.get(i));
//        }
//        System.out.println(linkedList.element());
//        System.out.println(linkedList.element());



//        Map<Integer , Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,2);
//        map.put(3,3);
//        map.put(4,4);
//        map.put(5,5);
//        map.put(10,1);
//        Iterator iter = map.entrySet().iterator();
//        while(iter.hasNext()){
//            Map.Entry entry = (Map.Entry) iter.next();
//            Object key = entry.getKey();
//            Object val = entry.getValue();
//            System.out.println(key+"  "+val);
//        }
//
//        Set<Integer> set = new HashSet<>();//TreeSet

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Iterator a = stack.iterator();

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
