package chapter02_lecture.CH3.P03;

public class C01String {
    public static void main(String[] args) {
        //char : 단일 문자를 저장하는 타입
        char a = '가'; // 작은 따옴표 사용
        System.out.println("a = " + a);

        // String : 여러 문자들(문자열) 을 저장하느 타입
        String c = "가나";//큰 따옴표 사용
        System.out.println("c =" + c);

        String d = "It's good";
        System.out.println("d =" + d);

//  String 내에서 큰 따옴표는 역슬래시와 함께
        String e = "it is \"good\""; //\" \"
        System.out.println("e= " + e);

// 역슬래시는 역슬래시와 함께
        String f = "\\는 특수 기호 사용시"; // \\
        System.out.println("f =" + f);


//  역슬래시 사용 예시 (52p)
        String g = "작은 따옴표\'";
        System.out.println("g = " + g);
        String h = "다음 줄 \n 표현";
        System.out.println("h =" + h);
        String i = "탭\t 표현";
        System.out.println("i=" + i);

    }
}
