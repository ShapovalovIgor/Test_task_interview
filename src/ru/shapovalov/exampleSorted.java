package ru.shapovalov;

import java.util.Arrays;
import java.util.Random;

public class exampleSorted {
    public static void main(String[] args) {
        int[] arraySource = new int[9];
        for (int index = 0; index < arraySource.length; index++) {
            Random random = new Random();
            arraySource[index] = random.nextInt();
        }

        System.out.println("Исходный массив:" + Arrays.toString(arraySource));
        long timeStart = System.currentTimeMillis();
        System.out.println("Сортировка выбором (Choice sort):" + Arrays.toString(choiceSort(arraySource)));
        long timeEnd = System.currentTimeMillis();
        long durationOne = timeEnd - timeStart;
        timeStart = System.currentTimeMillis();
        System.out.println("Сортировка пузырьком (Bubble sort):" + Arrays.toString(bubbleSort(arraySource)));
        timeEnd = System.currentTimeMillis();
        long durationTwo = timeEnd - timeStart;
        timeStart = System.currentTimeMillis();
        System.out.println("Сортировка вставками (Bubble sort):" + Arrays.toString(insertSort(arraySource)));
        timeEnd = System.currentTimeMillis();
        long durationThree = timeEnd - timeStart;
        System.out.println("One: " + durationOne);
        System.out.println("Two: " + durationTwo);
        System.out.println("Three: " + durationThree);
        System.out.println("Four" + Arrays.toString(quickSort(arraySource)));

    }

    //Временая сложность O(n^2)
    private static int[] choiceSort(int[] array) {
        int minIndex;
        for (int indexPosition = 0; indexPosition < array.length - 1; indexPosition++) // - 1 так как когда мы подойдём к последниму элементу в массиве он уже будет отсартирован
        {
            minIndex = indexPosition;
            for (int indexToScan = indexPosition; indexToScan < array.length; indexToScan++) {
                if (array[minIndex] > array[indexToScan]) {
                    minIndex = indexToScan;
                }
            }
            int tmp = array[indexPosition];
            array[indexPosition] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }

    // Временая сложность O(n)
    private static int[] bubbleSort(int[] array) {
        boolean swapped = true;

        int j = 0;

        int tmp;

        while (swapped) {

            swapped = false;

            j++;

            for (int i = 0; i < array.length - j; i++) {

                if (array[i] > array[i + 1]) {

                    tmp = array[i];

                    array[i] = array[i + 1];

                    array[i + 1] = tmp;

                    swapped = true;

                }

            }

        }
        return array;
    }

    //Временая сложность O(n^2)
    private static int[] insertSort(int[] array) {
        int element;
        int indexToInsert;
        for (int indexPosition = 0; indexPosition < array.length - 1; indexPosition++) {
            element = array[indexPosition];
            indexToInsert = indexPosition;
            while (indexToInsert > 0
                    && array[indexToInsert - 1] > element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
        return array;
    }

    private static  int[]  quickSort(int[] array) {
        int[] tmpArray = new int[]{};
        tmpArray = array;
return quickSort(tmpArray, 0, 0);
    }
    private static int[] quickSort(int[] array, int lowerIndex, int higherIndex) {
        if (array == null || array.length == 0) {
            return null;
        }
        if (lowerIndex == 0
                && higherIndex == 0) {
            lowerIndex = 0;
            higherIndex = array.length - 1;
        }
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(array, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(array, lowerIndex, j);
        if (i < higherIndex)
            quickSort(array, i, higherIndex);
        return array;
    }

    private static void exchangeNumbers(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
