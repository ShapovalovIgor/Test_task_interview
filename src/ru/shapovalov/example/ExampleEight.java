package ru.shapovalov.example;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExampleEight implements Runnable {
    //Тест многопоточности + Рефлексии

    int intSetConstant;

    public static void main(String[] args) throws InterruptedException {
        ExampleEight firstTest = new ExampleEight(11);
        ExampleEight secondTest = new ExampleEight(12);
        ExecutorService executorService = Executors.newFixedThreadPool(2);//Если измень на 1 то потоки будут выполнятся последовательно
        executorService.submit(firstTest);
        executorService.submit(secondTest);
        TimeUnit.SECONDS.sleep(3);
        System.exit(0);
    }

    public ExampleEight(int i) {
        this.intSetConstant = i;
    }

    @Override
    public void run() {
        System.out.println("Start thread:" + intSetConstant);
        TestRefactoring testRefactoring = new TestRefactoring();
        try {
            testRefactoring.print();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ExampleEight exampleSeven = new ExampleEight(intSetConstant);
        try {
            exampleSeven.setNewInt(testRefactoring, intSetConstant);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        try {
            testRefactoring.print();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class TestRefactoring {
        private int testConstant = 123;

        public TestRefactoring() {
        }

        private void print() throws InterruptedException {
            int count = 0;
            while (true){
            System.out.println("Out thread:"+testConstant);
                TimeUnit.MILLISECONDS.sleep(400);
            count++;
            if(count > 1){
                break;
            }
            }
        }
    }

    private void setNewInt(Object object, int newValue) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
            field.setAccessible(true);
            field.setInt(object, newValue);
            field.setAccessible(false);
        }
    }
}
