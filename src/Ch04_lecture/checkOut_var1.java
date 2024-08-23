package Ch04_lecture;

public class checkOut_var1 {
    public static void main(String[] args) {

        int i = 0;
        // ver1
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        System.out.println();

        // %10을 이용한 버젼
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(i % 10);
                i++;
            }
            System.out.println();
        }
    }
}
