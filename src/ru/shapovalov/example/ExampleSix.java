package ru.shapovalov.example;

public class ExampleSix {
    public static void main(String args[]) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println("Input:" + array[0]);

        System.out.println("Output:" + shiftLeft(array,1)[0]);

    }




    //    Циклический сдвиг влево
    public static int[] shiftLeft(int[] a, int shift) {
        if (a != null) {
            int length = a.length;
            int[] b = new int[length];
            System.arraycopy(a, shift, b, 0, length - shift);
            System.arraycopy(a, 0, b, length - shift, shift);
            return b;
        } else {
            return null;
        }
    }
}
