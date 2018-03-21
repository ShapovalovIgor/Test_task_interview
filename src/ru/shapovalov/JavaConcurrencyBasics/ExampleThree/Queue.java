package ru.shapovalov.JavaConcurrencyBasics.ExampleThree;

import java.util.LinkedList;
import java.util.Objects;

class Queue<E>{
private final LinkedList<E> list = new LinkedList<>();

    E take() throws Exception {
        // Implement.
        synchronized (list) {
            while (list.isEmpty()) {
                list.wait();
            }


        }
        return  list.pollFirst();
    }

    void offer(E e) throws Exception {
        Objects.isNull(e + "N is null");
        synchronized (list) {
            list.add(e);
            list.notifyAll();
        }
    }
}

