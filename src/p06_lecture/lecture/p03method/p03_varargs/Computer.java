package p06_lecture.lecture.p03method.p03_varargs;

public class Computer {
    int sum(int... values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum;
    }
}