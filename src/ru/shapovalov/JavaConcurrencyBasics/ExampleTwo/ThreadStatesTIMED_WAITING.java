package ru.shapovalov.JavaConcurrencyBasics.ExampleTwo;

import java.util.concurrent.TimeUnit;

public class ThreadStatesTIMED_WAITING {
    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // Implement.
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread t = new Thread(r);
        // Implement.
        t.start();
        TimeUnit.SECONDS.sleep(1);

        System.out.println(t.getState());
    }
}
