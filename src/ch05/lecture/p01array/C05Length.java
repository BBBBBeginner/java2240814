package ch05.lecture.p01array;

public class C05Length {
    public static void main(String[] args) {


        int i = 5;


        int[] arr = new int[3];
        int l = arr.length;
        System.out.println(arr.length);

        int[] drr = new int[3];
        drr[0] = 5;
        drr[1] = 7;
        drr[2] = 9;
// length 까지만 꺼내 와라 -> 배열 에서 선언한 변수만큼 꺼내라.
        for (int j = 0; j < drr.length; j++) {
            System.out.println(drr[j]);
        }
    }
}
