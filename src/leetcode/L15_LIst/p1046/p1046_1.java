package leetcode.L15_LIst.p1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p1046_1 {
    public static void main(String[] args) {
        // List<Integer> 초기화 및 값 추가
        List<Integer> stones = new ArrayList<>();
        stones.add(2);
        stones.add(7);
        stones.add(4);
        stones.add(1);
        stones.add(8);
        stones.add(1);

        // 리스트가 하나의 돌만 남을 때까지 반복
        while (stones.size() > 1) {
            // 리스트 정렬 및 뒤집기
            Collections.sort(stones);
            Collections.reverse(stones);

            // 가장 큰 두 돌 꺼내기
            int first = stones.get(0);
            int second = stones.get(1);

            // 두 돌 삭제
            stones.remove(0);  // 첫 번째 돌 삭제
            stones.remove(0);  // 두 번째 돌 삭제 (첫 번째가 삭제된 후 인덱스가 변경됨)

            // 두 돌을 부딪혀 남는 무게가 있으면 다시 리스트에 추가
            if (first != second) {
                stones.add(first - second);
            }
            System.out.println("남은 돌들: " + stones);
            Collections.reverse(stones);
        }

        // 남은 돌이 없으면 0을 출력, 있으면 그 돌의 무게를 출력
        int result = stones.isEmpty() ? 0 : stones.get(0);
        System.out.println("최종 남은 돌의 무게: " + result);
    }
}