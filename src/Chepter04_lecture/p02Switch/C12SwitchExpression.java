package Chepter04_lecture.p02Switch;

public class C12SwitchExpression {
    public static void main(String[] args) {
        int n = 4;
        
        String g = switch (n) {
            case 1 -> "일";
            case 2 -> {
                String a = "이";
                String b = "등급";
                yield a + b;
            }
            case 3 -> "삼";
            default -> "그외";
        };
    }
}
