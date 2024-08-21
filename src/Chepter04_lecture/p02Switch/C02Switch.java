package Chepter04_lecture.p02Switch;

public class C02Switch {
    public static void main(String[] args) {
        //1,2,3
        
        int n = (int) (Math.random() * 3) + 1;

        switch (n) {
            case 1 -> {
                System.out.println("1");
                break;
            }
            case 2 -> {
                System.out.println("2");
                break;
            }
            case 3 -> {
                System.out.println("3");
                break;
            }
        }

    }
}
