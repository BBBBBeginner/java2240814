package leetcode.L15_Matrix;

import java.util.ArrayList;
import java.util.List;

public class pascal {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        int loop = 0;

        while (loop < rowIndex) {
            List<Integer> next = new ArrayList<>();

            next.add(1);

            // prev에 있는 것들 2개씩 더해서
            // next에 넣기
            for (int i = 0; i < prev.size() - 1; i++) {
                next.add(prev.get(i) + prev.get(i + 1));
            }

            next.add(1);

            prev = next;
            loop++;
        }

        return prev;

    }
}