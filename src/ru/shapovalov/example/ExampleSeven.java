package ru.shapovalov.example;

import java.lang.reflect.Field;

public class ExampleSeven {
//Тест рефлексии меняем значение в переменной
    public static void main(String[] args) throws IllegalAccessException {
        TestRefactoring testRefactoring = new TestRefactoring();
        testRefactoring.print();
        ExampleSeven exampleSeven = new ExampleSeven();
        exampleSeven.testReflectionMethod(testRefactoring);
        testRefactoring.print();
    }

    static class TestRefactoring {
        private static int testConstant = 123;

        public TestRefactoring() {
        }

        private void print() {
            System.out.println(testConstant);
        }
    }

    private void testReflectionMethod(Object object) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            field.setAccessible(true);
            field.setInt(object, 12);
            field.setAccessible(false);
        }
    }
}
