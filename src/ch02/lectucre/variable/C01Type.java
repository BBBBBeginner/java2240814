package ch02.lectucre.variable;

import java.sql.SQLOutput;

public class C01Type {
    public static void main(String[] args) {
        //java data type 2개

        //1. primitive type 8가지(기본타입, 원시타입)

        //  byte : 1바이트 정수
        //  short : 2바이트 정수
        //  int: 4바이트 정수 *
        //  long : 8바이트 정수 *
        //  float : 4바이트 실수
        //  double :  8바이트 실수 *
        //  boolean : 1바이트 논리 *
        //  char : 2바이트 문자


        //2. reference type 개수 무한대 (참조타입)
        //  primitive type 빼고 모두
            // 정수형 (byte(8bit = 1byte), short(2), int(4), long(8))

        byte b1;
        b1 = 127;
        byte b2;
        b2 = -128;

        int v1 = 21345678;
        System.out.println("v1 = + v1");

        System.out.println(v1 + 1);

        // long (8byte)
        //4byte 이상의 수 작성 시 끝에 L 붙이기
        long v2 = 214748364800000000l;
        long v3 = 21_4748_3648_0000_0000l;
        long v4 = 214_748_364_800_000_000l;
    }
}
