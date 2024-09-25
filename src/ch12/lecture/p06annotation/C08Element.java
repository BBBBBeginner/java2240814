package ch12.lecture.p06annotation;

public class C08Element {
    @MyAnnotation8(name = "kim", age = 3)
    int a;

    @MyAnnotation8(value = "seoul")
    int b;


    //하나의 elemet만 사용되고 value면 element명 생략 가능
    @MyAnnotation8("soul")
    int c;

    @MyAnnotation8(value = "seoul", name = "kim")
    int d;
}

@interface MyAnnotation8 {
    String name() default "son";

    int age() default 1;

    //value : 사용시 element 명 생략 가능
    String value() default "hi";
}
