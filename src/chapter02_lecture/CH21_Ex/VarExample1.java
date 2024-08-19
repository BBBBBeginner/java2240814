package chapter02_lecture.CH21_Ex;

public class VarExample1 {
    public static void main(String[] args) {
        String name = getData();
        var userName = getData();
    }

    public static String getData() {
        return "홍길동";
    }
}
