package ch03.lecture.p04_ex;

public class LogicalOperator_94 {
    public static void main(String[] args) {
        int charCode = 'A';
        //int charCode = 'a';
        //int charCode = '5';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자이군요");
        }
        
//        if (('A' <= charCode) & (charCode <= 'B')) {
//            System.out.println("대문자이군요");
//        }

        if ((97 < -charCode) && (charCode <= 122)) {
            System.out.println("소문자");
        }
        if ((48 < -charCode) && (charCode <= 57)) {
            System.out.println("0~9숫자");
        }

//        -------------------------------------------
        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2또는 3의 배수군요");
        }
    }
}
