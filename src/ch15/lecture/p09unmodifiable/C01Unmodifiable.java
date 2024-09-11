package ch15.lecture.p09unmodifiable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01Unmodifiable {
    public static void main(String[] args) {
        List<String> list1 = List.of("son", "lee", "kim");
        System.out.println(list1);

//        list1.add("hwang");

        Set<String> set1 = Set.of("a", "b", "c", "d");
//        System.out.println(set1);

        Map<String, String> map1 = Map.of("son", "토트넘", "lee", "국대");
        System.out.println(map1);

        System.out.println("다음코드");
    }
}
