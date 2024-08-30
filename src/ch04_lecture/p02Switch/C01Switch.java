package ch04_lecture.p02Switch;

public class C01Switch {
    public static void main(String[] args) {
        // switch(조건문, 분기문),
        // 1,2,3

        int n = (int) (Math.random() * 3) + 1;

        //byte ,short ,char ,int ,string ,enum
        switch (n) {
            case 1 -> { //값이 1일때 출력
                System.out.println("첫번째수 출력:");
            }
            case 2 -> { //2일때 출력
                System.out.println("두번째수 출력:");
            }
            case 3 -> { //3일때 출력
                System.out.println("세번째수 출력:");
            }

        }

    }
}
