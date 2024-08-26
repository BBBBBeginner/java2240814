package p06_lecture.p01Class;

public class C01Class {
    public static void main(String[] args) {
        String a = new String("java");
        new String("java");

        MyClass b = new MyClass();
        MyClass c = new MyClass();

        int codeA = System.identityHashCode(a);
        System.out.println("code A =" + codeA);

        int codeB = System.identityHashCode(b);
        System.out.println("codeB =" + codeB);

        int codeC = System.identityHashCode(c);
        System.out.println("codeC = " + codeC);
    }
}

class MyClass {

}