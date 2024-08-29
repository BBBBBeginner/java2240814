package ch06.lecture.p09encapsulation;

public class C01Encapsulation {
    public static void main(String[] args) {
        MyClass01 o = new MyClass01();
        o.setAge(9);
        int a = o.getAge();
        System.out.println("a =" + a);

    }
}

class MyClass01 {
    // 노출하면 안될때는 privite
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}
