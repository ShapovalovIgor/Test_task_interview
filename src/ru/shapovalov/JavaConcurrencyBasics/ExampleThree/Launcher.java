package ru.shapovalov.JavaConcurrencyBasics.ExampleThree;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    private static final int CONSUMERS_NUM = 2;
    private static final int PRODUCER_NUM = 3;
    private static final int MSG_NUM = 100;

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        List<Consumer> consumers = new ArrayList<>(CONSUMERS_NUM);

        for (int i = 0; i < CONSUMERS_NUM; i++) {
            consumers.add(new Consumer(queue, i));
        }

        List<Producer> producers = new ArrayList<>(PRODUCER_NUM);

        for (int i = 0; i < PRODUCER_NUM; i++) {
            producers.add(new Producer(queue, i, MSG_NUM));
        }


        for (Consumer consumer : consumers) {
            consumer.start();
        }

        for (Producer producer : producers) {
            producer.start();
        }
        // Start producers and consumers.

        // No shutdown is needed.
    }
}
