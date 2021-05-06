package Alishev;

import java.util.Arrays;
/*
На входе массив цифр. Составить из них максимально большое число.
 */
public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(naxNumberFromDigits(digits));
    }

    public static String naxNumberFromDigits(int[] digits) {
        Arrays.sort(digits);
        String result = "";

        for (int i = digits.length - 1; i >= 0; i--)
            result += digits[i];

        return result;
    }
}
