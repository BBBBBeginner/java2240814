package Chepter04_lecture.p05break;

public class C02Break {
    public static void main(String[] args) {

        while (true) {
            int num2 = (int) (Math.random() * 6) + 1;
            int num1 = (int) (Math.random() * 6) + 1;
            System.out.println(STR."주사위 값 : (\{num1} \{num2})\n");
            if (num1 + num2 == 5) {
                break;
            }
        }
        System.out.println("주사위 값의 합이 5 ");
    }
}
