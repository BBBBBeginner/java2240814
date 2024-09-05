package ch12.lecture.p02Wrapper;

public class C03wrapper {
    public static void main(String[] args) {
        int a = 3000;
        int b = 3000;

        System.out.println(a == b);

        System.out.println("-------------");
        Integer c = a;
        Integer d = b;
        System.out.println(c == d);

        System.out.println("-------------");
        //참조타입 비교는 equals
        System.out.println(c.equals(d));
        System.out.println("-------------");
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println("-------------");
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));
    }
}
