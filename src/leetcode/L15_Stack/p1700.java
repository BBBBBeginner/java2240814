package leetcode.L15_Stack;

import java.util.LinkedList;
import java.util.Queue;

public class p1700 {
    public int countStudents(int[] num1, int[] num2) {
        Queue<Integer> students = new LinkedList<>();
        Queue<Integer> sandwiches = new LinkedList<>();
        boolean again = true;
        int count = 0;
        // 샌드위치수 학생수 알려주기
        // 학생
        // 틀리면 남은것 표시

        for (int n : num1) {
            students.offer(n);
        }
        for (int n : num2) {
            sandwiches.offer(n);
        }

        while (again) {

            if (students.peek().equals(sandwiches.peek())) {
                students.poll();
                sandwiches.poll();
                count++;
            } else {
                students.poll();
                sandwiches.poll();
            }

            if (students.size() == 0 || sandwiches.size() == 0) {
                again = false;
                break;
            }
        }
        System.out.println(count);
        return count;

    }
}
