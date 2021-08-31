package oops;

public class MethodOverloadingDemo {
    void m1(Object obj1, Object obj2){
        System.out.println("method 2");
    }

    void m1(String s, String s1){
        System.out.println("method 1");
    }

    public static void main(String[] args) {
        MethodOverloadingDemo m = new MethodOverloadingDemo();
        m.m1(null,null);
    }
}
