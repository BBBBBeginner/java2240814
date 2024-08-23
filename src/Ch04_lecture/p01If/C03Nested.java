package Ch04_lecture.p01If;

public class C03Nested {
    public static void main(String[] args) {
        // 제어문 내에 제어문 작성 가능


        if (true) {
            System.out.println(1);

            if (false) {
                System.out.println(2);
                System.out.println(3);
            } else {
                System.out.println(4);
            }
            System.out.println(5);
            System.out.println(6);
        }
        System.out.println(7);
    }
}
