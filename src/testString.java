/**
 * Created by lenovo on 2019/3/23.
 */
public class testString {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "aaa";
        String c = new String("aaa");
        System.out.println(a+"  "+b+" "+c );
        System.out.println(a == b);
        System.out.println(b == c);
    }
}
