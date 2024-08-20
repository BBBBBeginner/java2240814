package ch03.lecture.p02_ex;

public class IncreaseDecreaseOperator_82 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x =" + x);

        System.out.println("_________________________");
        y--;
        --y;
        System.out.println("y =" + y);

        System.out.println("-------------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("-------------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("-------------------------");
        z = ++x + y++;
        System.out.println("z =" + z);
        System.out.println("x =" + x);
        System.out.println("y =" + y);
    }
}
