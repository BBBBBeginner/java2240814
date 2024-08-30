package ch04_lecture.p02Switch;

public class C10SwitchExpression {
    public static void main(String[] args) {
        // switch expression(공식)

        // switch expression 사용 전
        String grade = "ch05_lecture.p01Array.a.c";
        String message = switch (grade) {
            case "A", "a" -> message = "우수한 등급";
            case "B", "b" -> message = "보통 등급";
            case "C", "ch05_lecture.p01Array.a.c" -> message = "등급 미만";
            default -> "";
        };


        System.out.println(message);


    }
}