package ch11.lecture.p01exception;

public class C01NullPointException {
    public static void main(String[] args) {
        // NullPointerException
        String s = "java";
        System.out.println(s.length());

        System.out.println("다음코드");


        // NullPointerException
        String t = null;
        System.out.println(t.length()); // 있는데 값이 없어 -> exeption

        System.out.println("다음코드");

    }
}
