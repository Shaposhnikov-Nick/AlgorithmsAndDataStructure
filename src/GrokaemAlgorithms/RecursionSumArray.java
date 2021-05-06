package GrokaemAlgorithms;

import java.util.Arrays;

/*
Сумма массива с применением рекурсии
 */
public class RecursionSumArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Summa = " + arrSum(arr, 0));
    }

    private static int arrSum(int[] arr, int index) {
        int sum = 0;

        if (index == arr.length)
            return 0;
        else {
            sum = arr[index] + arrSum(arr, index + 1);
        }
        return sum;
    }
}
