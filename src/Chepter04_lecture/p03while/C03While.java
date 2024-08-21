package Chepter04_lecture.p03while;

public class C03While {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i <= 100) {
            if (i % 3 == 0) {
                sum += i;
            }
            i += 3;
        }
        System.out.println(sum);

    }
}
