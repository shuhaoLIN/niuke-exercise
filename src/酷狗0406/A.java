package 酷狗0406;

/**
 * Created by lenovo on 2019/4/6.
 */
public class A {
    public void show(A obj){
        System.out.println("A in A");
    }
    public void show(B obj){
        System.out.println("B in A");
    }
    public void show(T obj){
        System.out.println("T in A");
    }
    public static class B extends A{
        public void show(A obj){
            System.out.println("A in B");
        }
        public void show(B obj){
            System.out.println("B in B");
        }
        public void show(C obj){
            System.out.println("C in B");
        }
        public void show(T obj){
            System.out.println("T in B");
        }
    }
    public static class C extends B{

    }
    public  static class T{

    }

    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        C c = new C();
        T t = new T();
        a.show(a);
        a.show(b);
        a.show(c);
        a.show(t);
    }
}
