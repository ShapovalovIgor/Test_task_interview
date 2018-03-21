package ru.shapovalov.JavaConcurrencyBasics.ExampleTwo;

public class ThreadStatesRUNNABLE {
    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // Implement.
                while (true);
            }
        };

        Thread t = new Thread(r);

        // Implement.
        t.setDaemon(true);
        t.start();
        System.out.println(t.getState());
    }
}
