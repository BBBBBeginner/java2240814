package chapter02_lecture.Ch02_Ex;

public class longExemple {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
//        long var3 = 1000000000000; //오류
        long var4 = 1000000000000L; //8바이트 이상 끝에 L 붙여야
        byte var5 = 127;
//        byte var6 = 128;

        System.out.println(var1);
        System.out.println(var2);
//        System.out.println(var3);
        System.out.println(var4);
//        System.out.println(var5);
    }
}
