package ru.shapovalov.example;

import java.math.BigInteger;

public class ExampleEleven {

    //Тест скорости создания BigInteger
    public static void main(String[] args){
        for(int i = 0; i < 999999999;i++ ){

        }
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < 999999999;i++ ){
            new BigInteger("999999999");
        }
        long timeEnd = System.currentTimeMillis();
        long durationOne = timeEnd - timeStart;
        timeStart = System.currentTimeMillis();
        for(int i = 0; i < 999999999;i++ ){
            BigInteger.valueOf(999999999l);
        }
        timeEnd = System.currentTimeMillis();
        long durationTwo = timeEnd - timeStart;
        System.out.println("First: " + durationOne);
        System.out.println("Second: " + durationTwo);
    }
}
