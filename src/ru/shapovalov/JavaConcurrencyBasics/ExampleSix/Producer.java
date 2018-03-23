package ru.shapovalov.JavaConcurrencyBasics.ExampleSix;

class Producer {
    private final Queue<String> queue;
    private final int id;
    private final int msgNum;
    private boolean shutdown;
    public static String POISON_PILL = new String("PoisonPill");
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
            String tmp = msg;

            try {
                Thread.sleep(100);
                if (shutdown) {
                    System.out.println("PROD" + id + " is stopped ");
                    queue.offer(POISON_PILL);
                    break;
                }
                queue.offer(msg);
                System.out.println("Sent message: " + msg);
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
        shutdown = true;
    }
}
