package ch04.lecture.p01if;

public class C05Random {
    public static void main(String[] args) {
        // 1,2,3,4,5,6중 하나의 수 출력
        Double n = Math.random();
        System.out.println(n);
        System.out.println((int) (n * 6) + 1);
    }
}

//int n = (int) (Math.random() * ?) + 1