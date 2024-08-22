package ch05.p01Array.p01_ex;

public class Array_enhancedFor {
    public static void main(String[] args) {
        int[] scores = {84, 90, 96};
        int sum = 0;

//        for (int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }

        for (int score : scores) {
            sum += score;
        }
        System.out.println("총합 :" + sum);

        double avg = (double) sum / scores.length;

        System.out.println("평균 : " + avg);
    }
}
