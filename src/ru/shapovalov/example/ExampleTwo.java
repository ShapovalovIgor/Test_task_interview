package ru.shapovalov.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;


public class ExampleTwo {
    //Пример возникновения колизии в HashMap

    public static void main(String args[]) {

        String cat1Value = "Cat1";
        String cat2Value = "Cat2";
        TestString testString1 = new TestString();
        TestString testString2 = new TestString();
        Map<TestString, String> catMap = Map.of(testString1, cat1Value, testString2, cat2Value);
        for (Map.Entry catEntry : catMap.entrySet()) {
            System.out.println("Key-" + catEntry.getKey() + "\nValue-" + catEntry.getValue());
            System.out.println(catMap);

        }
    }


    protected static class TestString {

        int i = 33;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestString that = (TestString) o;
            Random random = new Random();
            return i == that.i + random.nextInt();
        }

        @Override
        public int hashCode() {

            return Objects.hash(i);
        }
    }
}
