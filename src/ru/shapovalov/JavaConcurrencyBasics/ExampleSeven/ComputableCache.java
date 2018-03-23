package ru.shapovalov.JavaConcurrencyBasics.ExampleSeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ComputableCache<K, V> {
    private final Map<K, V> cache = new ConcurrentHashMap<>();
    private volatile List<K> keysList = new ArrayList<>();

    public synchronized V compute(K key) {
        keysList.add(key);
        V res = cache.get(key);

        if (res == null
                && !keysList.contains(key)) {
            res = computeExpensive(key);

            cache.putIfAbsent(key, res);

            System.out.println(Thread.currentThread().getName() + ": miss");
        } else {
            System.out.println(Thread.currentThread().getName() + ": hit");
        }

        return res;
    }

    private V computeExpensive(K key) {
        // Very expensive computation.
        return (V) new Object();
    }
}