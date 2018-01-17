package ru.shapovalov.example;

public class ExempleThree {

    public static void main(String[] args) {
        int[][] arrayOfInts = new int[4][25000];
        long timeStart = System.currentTimeMillis();
        for (int k = 0; k < 100000; k++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 25000; j++) {
                    arrayOfInts[i][j] = 10;
                }
            }
        }
        long timeEnd = System.currentTimeMillis();
        long durationOne = timeEnd - timeStart;
        timeStart = System.currentTimeMillis();
        for (int k = 0; k < 100000; k++) {
            for (int i = 0; i < 25000; i++) {
                for (int j = 0; j < 4; j++) {
                    arrayOfInts[j][i] = 11;
                }
            }
        }
        timeEnd = System.currentTimeMillis();
        long durationTwo = timeEnd - timeStart;
        System.out.println("First: " + durationOne);
        System.out.println("Second: " + durationTwo);
    }
}
