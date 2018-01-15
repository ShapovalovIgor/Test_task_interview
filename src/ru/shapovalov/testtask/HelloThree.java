package ru.shapovalov.testtask;


import java.util.ArrayList;
import java.util.List;

public class HelloThree {
    // Необходимо реализовать на Java метод, принимающий на вход коллекцию строк и удаляющий из переданной коллекции все элементы, начинающиеся на «aaa».
// Сигнатура необходимого метода должна иметь вид:
    //   public static void filterTripleA(List<String> strings) {

    public static void main(String[] agrs) {
        List<String> listString = List.of("aaa", "aaaaaaaaaaaaft", "bbbbbb", "baaaa", "aa");
        filterTripleA(listString);
    }

    public static void filterTripleA(List<String> strings) {
        List<String> tempList = new ArrayList();
        for (String string : strings) {
            char[] arrayChar = string.toCharArray();
            if (2 < arrayChar.length) {
                Character characterA = new Character('a');
                if (characterA.equals(arrayChar[0])
                        && characterA.equals(arrayChar[1])
                        && characterA.equals(arrayChar[2])) {
                    System.out.println("Remove element: " + string);
                } else {
                    tempList.add(string);
                }
            } else {
                tempList.add(string);
            }
        }
        strings = tempList;
        System.out.println("New size:" + strings);
    }
}
