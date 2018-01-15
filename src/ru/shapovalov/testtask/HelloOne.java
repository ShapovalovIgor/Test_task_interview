package ru.shapovalov.testtask;

public class HelloOne {
    //Необходимо реализовать программу на Java, печатающую в консоль сумму всех числовых параметров командной строки. Пример строки "1fawetgdhst3gerherhetrhsdhd3dgerhge3gsh1ggg1"
    public static void main(String[] agrs) {
        System.out.println(agrs[0]);
        String inputString = agrs[0];
        char[] charArray = inputString.toCharArray();
        int inputStrAgrs = 0;
        for (int getChar = 0; getChar < charArray.length; getChar++) {
            try {
//                System.out.println(charArray[getChar]);
                int num = Integer.parseInt(String.valueOf(charArray[getChar]));
                inputStrAgrs = num + inputStrAgrs;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(inputStrAgrs);
    }
}
