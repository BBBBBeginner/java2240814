package Ch04_lecture;

public class checkOut_var2 {
    public static void main(String[] args) {

        int j = 0;

        while (j <= 5) {
            System.out.println(j);
            if (j == 4) {
                for (j = 4; j >= 0; j--) {
                    System.out.println(j);
                }
                break;
            }
            ++j;
        }

    }
}

