package ch05_lecture.p01Array.p02Reference;

public class C08Matrix {
    public static void main(String[] args) {
        int[][] m1 = {
                {30, 40},
                {22, 11}
        };
        int[][] m2 = new int[m1.length][]; // [2][{null},{null}]

        for (int i = 0; i < m1.length; i++) {
            m2[i] = m1[i];
        }
        m2[0][0] = 90;
        System.out.println(m1[0][0]);
    }
}
