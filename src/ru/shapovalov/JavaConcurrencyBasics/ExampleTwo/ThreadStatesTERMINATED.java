package ru.shapovalov.JavaConcurrencyBasics.ExampleTwo;

public class ThreadStatesTERMINATED {
    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // Implement.
            }
        };

        Thread t = new Thread(r);
        // Implement.

        t.start();
        t.join();

        System.out.println(t.getState());
    }
}
