package ch04_lecture.p02Switch;

public class C08Break {
    public static void main(String[] args) {

        //break 문의 중요성
        int n = (int) (Math.random() * 3) + 1;
        System.out.println("n = " + n);

        switch (n) {
            case 1:
                System.out.println("첫째");
                break;
            case 2:
                System.out.println("둘째");
                break;
            case 3:
                System.out.println("셋째");
        }


    }
}
