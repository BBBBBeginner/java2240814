package ch12.exercise.n17;

import java.util.regex.Pattern;

public class num17 {
    public static void main(String[] args) {
        String id = "5Angle1004";
        String regExp = "[a-zA-Z][a-zA]{8,12}";
        boolean isMatch = Pattern.matches(regExp, id);
        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("Id로 사용할 수 없습니다.");
        }
    }
}
