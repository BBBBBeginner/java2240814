package ch11.lecture.p02try;

public class C05Finally {
    public static void main(String[] args) {
        try {
            int[] arr = {3, 4};
            int a = arr[0];

            System.out.println("a = " + a);
            return;
//            System.out.println("실행안됨");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(" try,catch 상관없이 얘는 무조건 실행해야 함");
        }

        System.out.println("다음 실행 흐름...");

    }
}
