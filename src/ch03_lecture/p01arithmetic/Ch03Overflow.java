package ch03_lecture.p01arithmetic;

public class Ch03Overflow {
    public static void main(String[] args) {
        //overflow : 허용된 범위를 넘게 되어

        int money = 0;
        money = money + 10_0000_0000;
        System.out.println("money =" + money);

        money = money + 10_0000_0000;
        System.out.println("money =" + money);


    }
}
