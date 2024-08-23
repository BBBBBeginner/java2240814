package ch05_lecture.p01Array.p02_ex;

public class ReferenceVariableCompare {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{1, 2, 3};
        arr3 = arr2; // 배열 변수 arr2의 값을 배열 변수 arr3에 대입

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);

    }
}
