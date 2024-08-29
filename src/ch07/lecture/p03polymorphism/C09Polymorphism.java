package ch07.lecture.p03polymorphism;

public class C09Polymorphism {
    public static void main(String[] args) {
        MyClass9 o1 = new MyClass9();
        o1.setNumber(new Integer(333)); // Integer 객체 사용
        o1.printDoubleNumber(); // 333의 double 값 출력

        MyClass9 o2 = new MyClass9();
        o2.setNumber(new Double(3.14)); // Double 객체 사용
        o2.printDoubleNumber(); // 3.14의 double 값 출력
    }
}

class MyClass9 {
    private Number number;

    public void setNumber(Number number) {
        this.number = number;
    }

    public void printDoubleNumber() {
        double v = number.doubleValue();
        System.out.println("v = " + v);
    }
}