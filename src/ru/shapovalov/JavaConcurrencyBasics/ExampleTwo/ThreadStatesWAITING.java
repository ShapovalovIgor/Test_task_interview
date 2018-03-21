package ru.shapovalov.JavaConcurrencyBasics.ExampleTwo;

import java.util.concurrent.TimeUnit;

public class ThreadStatesWAITING {
    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // Implement.
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t = new Thread(r);
        t.start();
        TimeUnit.SECONDS.sleep(2);

        System.out.println(t.getState());
    }
}
