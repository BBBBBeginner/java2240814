package chapter02_lecture.CH3_EX.p03예제;

public class _67p {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);


        // String.ValueOf : primitive  ---> string
        String str1 = String.valueOf(10); // "10"
        String str2 = String.valueOf(3.14); // "3.14"
        String str3 = String.valueOf(true);

        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);

    }
}
