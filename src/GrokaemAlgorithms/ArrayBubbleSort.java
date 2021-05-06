package GrokaemAlgorithms;
/*
Bubble sort - сортировка пузырьком O(n^2)
 */
public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        System.out.println("Array before sort: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        // сортировка:
        int temp;
        for (int j = arr.length-1; j > 0 ; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Array after sort: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
