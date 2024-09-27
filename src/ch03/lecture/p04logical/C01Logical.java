package ch03.lecture.p04logical;

public class C01Logical {
    public static void main(String[] args) {
        //and(&&)
        //하나의 피연산자만 false 여도 결과 false
        //둘 다 false 일때도 false

        System.out.println("and -------------");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        //or (//)
        // 두 피연산자가 모두 false 일 때만 결과 false
        // 그 외는 true
        System.out.println("or---------------");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        //xor (^) (caret)
        // 두 피연산자가 다르면 true, 같으면 false
        System.out.println("xor---------------");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        //not(!)
        // 결과는 피연산자의 반대
        System.out.println("not_______________");
        System.out.println(!true);
        System.out.println(!false);

    }
}
