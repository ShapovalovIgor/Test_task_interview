package ru.shapovalov;

import java.util.Arrays;
import java.util.Random;

public class exampleSorted {
    public static void main(String[] args) {
        int[] arraySource = new int[99999];
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
        for (int indexToScan = 0; indexToScan < array.length - 1; indexToScan++) {
            int tmp = array[indexToScan];
            if (array[indexToScan] > array[indexToScan + 1]) {
                array[indexToScan] = array[indexToScan + 1];
                array[indexToScan + 1] = tmp;
            }
        }
        return array;
    }

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
}
