package ru.shapovalov.testtask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.IntStream;

//1)Необходимо реализовать на Java метод, принимающий на вход коллекцию строк и выбрасывающий из переданной коллекции все элементы, начинающиеся на «aaa».
//        Сигнатура метода должна иметь вид:
//2)Необходимо реализовать Java-метод, не использующий циклы, печатающий все неотрицательные чётные числа, небольшие указанного.

public static void filterTripleA(Collection strings);
public class HelloTen {


    public static void main(String[] args) {
        ArrayList<String> ee = new ArrayList<>();
        ee.add("aaatuyrfty");
        ee.add("ugiyyfio");
        System.out.println(ee.size());
        filterTripleA(ee);
        System.out.println(ee.size());
        ee.add("aaatuyrfty");
        filterTripleAOne(ee);
        printEvenNumbers(8);

    }

    public static void filterTripleAOne(Collection strings) {
        strings.removeIf(e -> ((String) e).startsWith("aaa"));
    }

    public static void filterTripleA(Collection strings) {
        for (Object s : strings) {
            if (((String) s).startsWith("aaa")) ;
            {
                strings.remove(s);
            }
        }
    }

    public static void printEvenNumbers(int number) {
        IntStream.range(0, number + 1)
                .filter(i -> (i % 2) == 0)
                .forEach(System.out::println);
    }
}