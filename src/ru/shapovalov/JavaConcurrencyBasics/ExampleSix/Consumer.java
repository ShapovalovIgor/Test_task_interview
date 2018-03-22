package ru.shapovalov.JavaConcurrencyBasics.ExampleSix;

class Consumer {
    private final Queue<String> queue;
    private final int id;
    private String tmp;
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
            while (true) {

                String message = queue.take();
                System.out.println("CONS" + id + " received message: " + message);
                if (!message.equals(tmp)
                        && tmp != null) {
                    System.out.println("CONS" + id + " is stopped");
                    break;
                } else {
                    tmp = message;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // Replace <msg> with real msg.
    }

    void start() {
        // Implement
        t.start();
    }
}
