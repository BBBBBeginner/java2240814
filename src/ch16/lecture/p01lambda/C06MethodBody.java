package ch16.lecture.p01lambda;

public class C06MethodBody {
    public static void main(String[] args) {
        // 중괄호와 return 키워드를 사용하는 경우
        MyInterface6 o = () -> {
            return 9;  // 여러 줄의 명령문을 포함하는 경우 중괄호와 return 필요
        };

        int a = o.method();
        System.out.println("a = " + a);


        // 한 줄의 명령문일 때 return 키워드와 중괄호 생략 가능
        MyInterface6 p = () -> 10;  // 한 줄의 리턴문에는 중괄호와 return 키워드 생략

        int b = p.method();
        System.out.println("b = " + b);
    }
}

@FunctionalInterface
interface MyInterface6 {
    int method();
}