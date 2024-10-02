package ch05.exercise;

public class CheckOut_2 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        System.out.println(array.length);
        System.out.println(array[2].length);

        int[][] array2 = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int evg = 0;
        int elements = 0;
        for (int i = 0; i < array2.length; i++) {
            for (sum = 0; sum < array2[i].length; sum++) {
                evg += array2[i][sum];
                elements++;
            }
        }
        System.out.println(evg);
        System.out.println(evg / elements);
    }
}

