package ch05_lecture.p01Array;

public class c {
    public static void main(String[] args) {
        // a.equals.(b) : a == b // int변수로 저장 X
        // a.isEmpty() : 인스턴스 메소드, 길이가 0일 때만 true //
        // length() : 문자열의 길이 리턴
        // a.charAt() : 명시된 인덱스의 char value를 계산한다.
        // a.replace("","")
        //.Substring(5,8) : 자르기


        String k = "asdfaswvwe fwaetq";
        String s = "java programming language";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(".equals()----------------------");
        boolean ksa = s.equals(k);
        System.out.println(ksa);
        System.out.println(s.equals(k));
        System.out.println(".charAt()----------------------");
        System.out.println(s.charAt(3));
        char c = s.charAt(5);
        System.out.println(c);
        System.out.println(".isEmpty()----------------------");
        System.out.println(s.isEmpty());
        System.out.println(".length()----------------------");
        int ani = s.length();
        System.out.println(ani);
        System.out.println(".replace()----------------------");
        String ak = s.replace("java", "c");
        System.out.println(ak);
        System.out.println(s.replace("language", "언어"));
        System.out.println(".Substring(,)----------------------");
        System.out.println(s.substring(5, 7));
        System.out.println(".indexOf()--------------------------");
        System.out.println(s.indexOf("java"));
        System.out.println("-------------------------------");
        System.out.println();
    }
}
