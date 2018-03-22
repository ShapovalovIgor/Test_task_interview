package ru.shapovalov.JavaConcurrencyBasics.ExampleFive;

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
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("PROD" + id + " is stopped ");
                break;
            }
            String msg = "PROD" + id + "-" + i;
            try {
                Thread.sleep(100);
                queue.offer(msg);
                System.out.println("Sent message: " + msg);
            } catch (InterruptedException e) {
                System.out.println("PROD" + id + " is stopped ");
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void start() {
        // Implement.
        t.start();
    }

    void shutdown() {
        t.interrupt();
    }
}
