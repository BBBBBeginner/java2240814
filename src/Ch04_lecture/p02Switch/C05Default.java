package Ch04_lecture.p02Switch;

public class C05Default {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 10) + 1;
        System.out.println("n =" + n);

        switch (n) {
            case 5:
            case 10:
                System.out.println("5의 배수");
                break;

            case 3:
            case 6:
            case 9:
                System.out.println("3의 배수");
                break;
            default:
                System.out.println("그외");
                break; // 마지막 브레이크는 생략 가능
        }

    }
}
