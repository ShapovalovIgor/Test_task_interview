package ru.shapovalov.JavaConcurrencyBasics.ExampleFour;

import java.util.concurrent.TimeUnit;

class Semaphore {
    private final int permits;
    private int count;

    public Semaphore(int permits) {
        this.permits = permits;
    }

    private final Object lock = new Object();

    public void acquire() throws InterruptedException {
        // Implement.
        synchronized (lock) {
            while (count >= permits) {
                System.out.println("wait");
                lock.wait();
            }
            count++;
        }
    }

    public void release() {
        // Implement.
        synchronized (lock) {
            if (count > 0) {
                count--;
                if (count < permits) {
                    System.out.println("notify");
                    lock.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Run 10 threads that use the semaphore.
        // The group of 3 threads should be able to execute the critical section.
        Semaphore semaphore = new Semaphore(3);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();

                    System.out.println("Permitted thread:" + Thread.currentThread());

                    Thread.sleep(2000);

                    semaphore.release();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

    }
}