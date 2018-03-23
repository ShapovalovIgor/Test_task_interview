package ru.shapovalov.JavaConcurrencyBasics.ExampleSix;

class Consumer {
    private final Queue<String> queue;
    private final int id;
    private final int prodNum;
    private int prodCounter;
    private final Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            doJob();
        }
    });

    Consumer(Queue<String> queue, int id, int prodNum) {
        this.queue = queue;
        this.id = id;
        this.prodNum = prodNum;
    }

    private void doJob() {
        // Implement.
        try {
            while (true) {

                String message = queue.take();
                System.out.println("CONS" + id + " received message: " + message);
                //We know;
                if (Producer.POISON_PILL == message) {
                    if(prodNum <=prodCounter) {
                        System.out.println("CONS" + id + " is stopped");
                        break;
                    }
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

    void shutdown() {
       //
    }
}
