package p06_lecture.lecture.p04constructor;

public class C05This {
    public static void main(String[] args) {
        MyClass05 od = new MyClass05();
        od.setName("sdaf");
        od.printName();
    }
}

class MyClass05 {
    int score;
    String name;

    void setName(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println(this.name);
    }

    void printFullDescription() {
        System.out.println(this.score);
    }
}