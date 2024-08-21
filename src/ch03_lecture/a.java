package ch03_lecture;

public class a {
    public static void main(String[] args) {
        //자동변환
        //헝용범위 순 : 1byte < 2short,char < 4int < 8long < 4float <8double

//        byte byteValue = 10;
//        int intValue = byteValue;
//        System.out.println(intValue);
//
//        long longValue = 5000000000L;
//        float floatValue = longValue;
//        double doubleValue = longValue;
//        System.out.println(doubleValue);
//
//        char charValue = 'A';
//        int intValue1 = charValue;
//        System.out.println(intValue1); // A 유니코드 = 정수 65


        //강제 타입 변환

        // long -> int -> byte
        //long -> int
        long longValue = 20000000001L;
        int intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14d;
        int Value = (int) doubleValue;
        System.out.println(Value);


        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println(result);

        String a = "777";
        int ai = Integer.parseInt(a);
        System.out.println(ai);

        String b = "5.1527";
        float bi = Float.parseFloat(b);
        System.out.println(bi);

        String c = "true";
        boolean ci = Boolean.parseBoolean(c);
        System.out.println(ci);


    }
}
