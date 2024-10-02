package ch05.lecture.p02reference;

public class C05Method1 {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4},
                {5, 7}
        };
        System.out.println("1번 으로 실행:" + arr[0][0]);
        method1(arr);
        System.out.println("3:" + arr[0][0]);
    }

    public static void method1(int[][] a) {
        System.out.println("2:" + a[0][0]);
        a[0] = new int[]{33, 44};
    }
}