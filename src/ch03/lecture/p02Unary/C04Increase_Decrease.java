package ch03.lecture.p02Unary;

public class C04Increase_Decrease {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println("a = " + a); //11

        int c = a++; // 사용 후 더함
        System.out.println("c =" + c); //11
        System.out.println("a =" + a); //12

        int d = ++a; // 더한 후 사용
        System.out.println("d = " + d); //13
        System.out.println("a = " + a); //13

        // 위 코드는 읽기 어려우니 사용 하지 말 것
        int e = 11;
        int f = e;
        a++;
        System.out.println("f =" + f);//11
        System.out.println("e =" + e);//11

        e++;
        int g = e;
        System.out.println("g =" + g);//12
        System.out.println("e =" + e);//12
    }
}
