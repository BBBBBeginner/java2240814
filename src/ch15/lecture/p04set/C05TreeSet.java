package ch15.lecture.p04set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C05TreeSet {
    public static void main(String[] args) {

        // HashSet : 순서 상관없이 저장
        Set<Integer> set1 = new HashSet<>();
        set1.add(987);
        set1.add(876);
        set1.add(432);
        set1.add(123);
        set1.add(432);  // 중복된 값은 저장되지 않음

        System.out.println(set1);  // [876, 123, 987, 432] 출력 (순서는 무작위)
        //        System.out.println(set2.getFirst());  // HashSet은 요소들이 정렬되지 않아 첫번째것 두번째것의 개념이 없음
        //        System.out.println(set2.getlast());   //

        // TreeSet : 정렬된 순서로 저장됨
        Set<Integer> set2 = new TreeSet<>();
        set2.add(987);
        set2.add(876);
        set2.add(432);
        set2.add(123);
        set2.add(432);  // 중복된 값은 저장되지 않음

        System.out.println(set2);  // [123, 432, 876, 987] 출력
//        System.out.println(set2.getFirst());  // 가장 작은 값 123
//        System.out.println(set2.getlast());   // 가장 큰 값 987

        // TreeSet 으로 문자열 정렬
        TreeSet<String> set3 = new TreeSet<>();
        set3.add("asd");
        set3.add("s12");
        set3.add("pqw");
        set3.add("578");

        System.out.println(set3);  // [578, asd, pqw, s12] 출력 (문자열 정렬 기준)
        System.out.println(set3.getFirst());  // 가장 작은 값 "578"
        System.out.println(set3.getLast());   // 가장 큰 값 "s12"
    }
}