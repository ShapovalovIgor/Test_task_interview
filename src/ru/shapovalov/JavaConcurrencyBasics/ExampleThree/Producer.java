package ru.shapovalov.JavaConcurrencyBasics.ExampleThree;

import java.util.concurrent.TimeUnit;

class Producer {
    private final Queue<String> queue;
    private final int id;
    private final int msgNum;
    private final Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            doJob();
        }
    });

    Producer(Queue<String> queue, int id, int msgNum) {
        this.queue = queue;
        this.id = id;
        this.msgNum = msgNum;
    }

    private void doJob() {
        // Implement.
        // Replace <id> with real id.
        for (int i = 0; i < msgNum; i++) {
            String msg = "PROD" + id + "-" + i;
            try {
                queue.offer(msg);
                System.out.println("Sent message: " + msg);
                TimeUnit.SECONDS.sleep(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void start() {
        // Implement.
        t.start();
    }
}
