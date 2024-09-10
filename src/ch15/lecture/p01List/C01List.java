package ch15.lecture.p01List;

import java.util.ArrayList;
import java.util.List;

public class C01List {
    public static void main(String[] args) {

        // List : 구성요소(element)의 순서가 있는 컬렉션, element 저장
        List<String> List = new ArrayList<>();

        // element 주요 기능
        // element 추가하는 메소드
        // add 추가, set 교체
        List.add("java");
        List.add("react");
        List.add(new String("css"));
        List.add("spring");// 추가
        List.set(1, "vue");// 교체
        List.add(2, "jsp");// 특정 인덱스 자리에 추가, 추가되면서 다음 인덱스들은 밀림
        System.out.println(List);


        //element 얻기
        //get (0-indexed)
        String item1 = List.get(0);
        String item2 = List.get(2);
        System.out.println(item1);
        System.out.println(item2);


        //element 확인(검색)
        //contains 리스트에서 꺼내와서 특정한 변수에 저장하는 방식으로 검색
        boolean r1 = List.contains("css");
        boolean r2 = List.contains("html");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


        // element 수 확인
        // size, isEmpty
        int size = List.size(); // element 갯수
        boolean r3 = List.isEmpty(); // 비어있는지
        System.out.println(size);
        System.out.println(r3);
    }
}
