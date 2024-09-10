package leetcode.L15_Key;

import java.util.HashMap;
import java.util.Map;

public class p1512 {
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // 배열을 순회하며 숫자의 빈도를 계산
        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num);
            }
            map.put(num, map.getOrDefault(num, 0) + 1); // 숫자의 빈도 증가
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums1));

    }
}