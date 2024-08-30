package ch04_lecture.p02Switch;

public class C09SwitchExpresssion {
    public static void main(String[] args) {
        // switch expression(공식)

        // switch expression 사용 전
        String message = "";

        String grade = "A";

        switch (grade) {
            case "A" -> {
                message = "우수한 등급";
            }
            case "B", "b" -> {
                message = "보통 등급";
            }
            case "C", "ch05_lecture.p01Array.a.c" -> {
                message = "등급 미만";
            }
        }

        System.out.println(message);


    }
}
