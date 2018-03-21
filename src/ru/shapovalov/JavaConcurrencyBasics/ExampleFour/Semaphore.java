package ru.shapovalov.JavaConcurrencyBasics.ExampleFour;

import java.util.concurrent.TimeUnit;

class Semaphore {
    private final int permits;
    private int count = 0;

    public Semaphore(int permits) {
        this.permits = permits;
    }

    private final Object lock = new Object();

    public void acquire() throws InterruptedException {
        // Implement.
        synchronized (lock) {
            if (count > permits) {
                System.out.println("wait");

                lock.wait();
            } else {
                count++;
            }
        }
    }

    public void release() {
        // Implement.
        synchronized (lock) {
            if (count >= permits) {
                System.out.println("notify");
                count--;
                lock.notifyAll();
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
                    synchronized (semaphore) {
                        semaphore.acquire();
                        System.out.println(semaphore.count);
                        Thread.sleep(2000);

                        semaphore.release();

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
        try {
            semaphore.acquire();

            System.out.println("Permitted.");

            Thread.sleep(2000);

            semaphore.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}