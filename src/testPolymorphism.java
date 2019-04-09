/**
 * Created by lenovo on 2019/3/23.
 */
public class testPolymorphism {
    int num =1;
    private void f(){
        System.out.println("private f");
    }
    public int getNum(){
        return num;
    }
    public static void main(String[] args) {
        testPolymorphism te = new sub();
        te.f();
        te.c();
        System.out.println(te.num);
        System.out.println(te.getNum());

        sub s = new sub();
        System.out.println(s.getNum());
    }

    public void c() {
    }
}
class sub extends testPolymorphism{
    int num =2;
//    public int getNum(){
//        return num;
//    }
    public void f(){
        System.out.println("public f");
    }
    public void c(){
        System.out.println("CCCCC");
    }
    private void a(){
        System.out.println("AAAAA");
    }
}
