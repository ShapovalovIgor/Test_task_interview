package ru.shapovalov.testtask;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class HelloFour {
    //Написать метод возвращабщий факториал
    public static void main(String args[]) {
        int factorialList = factorial(3);
        System.out.println(factorialList);
        BigInteger factorial = factorial(new BigInteger("3"));
        System.out.println(factorial.intValue());
    }

    public static int factorial(int num) {
        return (num == 0) ? 1 : num * factorial (num - 1);
    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;

        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }

        return result;
    }
}
