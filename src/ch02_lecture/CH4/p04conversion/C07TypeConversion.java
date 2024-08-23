package ch02_lecture.CH4.p04conversion;

public class C07TypeConversion {
    public static void main(String[] args) {
        // 강제형변환(casting)은 기본타입간, 또는 참조타입간에만 가능
        long a = 3;
        int b = (int) a; // 기본타입끼리의 캐스팅 가능

        //
//        String c = (String) a; // 기본타입과 참조타입 형변환 x
        String d = "3";
//        int e = (int) d; // 기본타입과 참조타입간의 형변환 x

    }
}
