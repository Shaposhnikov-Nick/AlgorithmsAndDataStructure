package GrokaemAlgorithms;

import java.util.Arrays;

/*
Бинарный поиск O(log n)
 */
public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arrayInt = new int[25];

        for (int i = 0; i < arrayInt.length; i++) { // заполняем массив произвольными числами
            arrayInt[i] = (int)(Math.random() * 100);
        }

        int search = 12; // искомое число
        System.out.println("Искомое число: " + search);

        arraySort(arrayInt); // список обязательно должен быть отсортирован (здесь сортировка пузырьком)

        binarySearch(arrayInt, search); // поиск числа в массиве
    }

    public static int[] arraySort(int[] arrayInt) {
        int temp = 0;

        System.out.println("Массив до сортировки " + Arrays.toString(arrayInt));

        for (int j = arrayInt.length -1; j > 0 ; j--) {
            for (int i = 0; i < j; i++) {
                if (arrayInt[i] > arrayInt[i + 1]) {
                    temp = arrayInt[i];
                    arrayInt[i] = arrayInt[i + 1];
                    arrayInt[i + 1] = temp;
                }
            }
        }

        System.out.println("Массив после сортировки " + Arrays.toString(arrayInt));
        return arrayInt;
    }

    public static void binarySearch(int[] arrayInt, int search) {
        int low = 0;
        int high = arrayInt.length - 1;
        int mid;
        boolean outOfArr = true;

        while (low <= high) {
            mid = (low + high) / 2;
            if (search == arrayInt[mid]) {
                System.out.println("Искомое число " + arrayInt[mid] + " есть в массиве.");
                outOfArr = false;
                return;
            }
            if (search < arrayInt[mid]) {
                high = mid - 1;
            }
            if (search > arrayInt[mid]) {
                low = mid + 1;
            }
        }

        if (outOfArr) {
            System.out.println("Искомое число " + search + " отсутствует в массиве");
        }
    }
}

/*
123
 */