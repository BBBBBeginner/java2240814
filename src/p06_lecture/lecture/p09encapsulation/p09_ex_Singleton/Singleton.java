package p06_lecture.lecture.p09encapsulation.p09_ex_Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }


    public static Singleton getInstance() {
        return singleton;

    }
}