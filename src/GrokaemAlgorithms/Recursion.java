package GrokaemAlgorithms;

public class Recursion {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("Факториал числа " + n + " равен " + fact(n));
    }

    private static long fact(int n) {
        long fact = 0;
        if (n == 0)
            return 1;
        if (n < 0) {
            System.out.print("Отрицательно число: ");
            return n;
        }

        fact = n * fact(n - 1);

        return fact;
    }
}
