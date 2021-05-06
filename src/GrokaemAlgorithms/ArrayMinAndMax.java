package GrokaemAlgorithms;

/*
Поиск наименьшего и наибольшего значений в массиве
 */
public class ArrayMinAndMax {
    public static void main(String[] args) {
        int[] intArr = new int[20];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int)(Math.random() * 100);
        }

        choiceMinAndMaxInArray(intArr);
    }

    private static void choiceMinAndMaxInArray(int[] arr) {
        int smallest = arr[0];
        int biggest = arr[0];
        int smallestIndex = 0;
        int biggestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
            if (arr[i] > biggest) {
                biggest = arr[i];
                biggestIndex = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("наименьшее число в массиве: " + smallest + " под индексом : " + smallestIndex);
        System.out.println("наибольшее число в массиве: " + biggest + " под индексом : " + biggestIndex);
    }
}
