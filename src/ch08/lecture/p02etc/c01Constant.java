package ch08.lecture.p02etc;

public class c01Constant {
}


interface MyInterface1 {
    //항상 public final static 필드(상수, constant)
    int age = 0;
    static String NAME = "son";
    final int NUMBER = 999;
    static double PI = 3.141592;
    public final static String MY_ADDRESS = "Korea";

    // public static 메소드
    void method1();
}