package ch05_lecture.p01Array.p02Reference;

import java.util.Arrays;

public class C09MatrixCopy {
    public static void main(String[] args) {
        int[][] m1 = {{98, 76}, {54, 21}};

        int[][] m2 = new int[m1.length][];// [2][null]

        //m2 에 m1을 복사하는 코드 작성
        for (int i = 0; i < m1.length; i++) {
            int[] row = new int[m1[i].length];
            for (int j = 0; j < m1[i].length; j++) {
                row[j] = m1[i][j];
            }
            m2[i] = row;
        }
        System.out.println("복사후 m2");
        System.out.println(Arrays.toString(m2[0]));
        System.out.println(Arrays.toString(m1[0]));


    }
}
