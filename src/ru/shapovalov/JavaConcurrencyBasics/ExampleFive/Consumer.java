package ru.shapovalov.JavaConcurrencyBasics.ExampleFive;

class Consumer {
    private final Queue<String> queue;
    private final int id;
    private final Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            doJob();
        }
    });

    Consumer(Queue<String> queue, int id) {
        this.queue = queue;
        this.id = id;
    }

    private void doJob() {
        // Implement.
        try {
        while (!Thread.currentThread().isInterrupted()) {

                String message = queue.take();
                System.out.println("CONS" + id + " received message: " + message);
        }
        } catch (InterruptedException e) {
            System.out.println("CONS" + id + " is stopped");
        }catch (Exception e) {
            e.printStackTrace();
        }
        // Replace <msg> with real msg.
    }

    void start() {
        // Implement
        t.start();
    }

    void shutdown(){
        t.interrupt();
    }
}
