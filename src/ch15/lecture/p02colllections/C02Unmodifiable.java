package ch15.lecture.p02colllections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02Unmodifiable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("spring");
        list.add("java");
        list.add("css");
        list.add("react");
        list.add("vue");

        // 수정 불가능한 컬렉션 생성
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        // 원본 리스트 출력
        System.out.println("원본 리스트: " + list);

        // 수정 불가능한 리스트 출력
        System.out.println("수정 불가능한 리스트: " + unmodifiableList);

        // 원본 리스트 정렬
        Collections.sort(list); // Collections : 리스트를 정렬하는 매서드
        System.out.println("정렬된 원본 리스트: " + list); // 리스트 정렬하기 안됨

        // 수정 불가능한 리스트는 정렬 불가 (예외 발생)
        // Collections.sort(unmodifiableList); // 이 줄은 실행 시 예외 발생
    }
}