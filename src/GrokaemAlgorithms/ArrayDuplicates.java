package GrokaemAlgorithms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
    Поиск дубликатов в массиве
 */
public class ArrayDuplicates {
    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        int val;
        boolean noDuplicate = true;

        Set<Integer> duplicateSet = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            val = arr[j];
            for (int k = 0; k < arr.length; k++) {
                if (j != k) {
                    if (val == arr[k]) {
                        duplicateSet.add(arr[k]);
                        noDuplicate = false;
                    }
                }
            }
        }


        if (!noDuplicate) {
            System.out.println("Дубликаты в массиве:");
            Iterator<Integer> iterator = duplicateSet.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }

        if (noDuplicate)
            System.out.println("Дубликатов нет");
    }
}

