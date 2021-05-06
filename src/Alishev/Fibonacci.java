package Alishev;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(10));
        System.out.println();
        System.out.println(fibEffective(100));
    }

    //наивный, медленный, O(2^n)
    private static long fibNaive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibNaive(n - 1) + fibNaive(n - 2);

        ////////
    }

    //эффективный  O(n)
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }
}

