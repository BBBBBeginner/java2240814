package p06_lecture.lecture.p03method.p03_return;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.powerOn();

        int r1 = c.plus(5, 6);
        System.out.println("r1 = " + r1);

        int x = 10;
        int y = 4;
        double r2 = c.divide(x, y);
        System.out.println("r2 = " + r2);


        c.powerOff();
    }
}