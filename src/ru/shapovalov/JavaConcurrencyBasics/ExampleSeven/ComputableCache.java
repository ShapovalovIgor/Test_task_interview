package ru.shapovalov.JavaConcurrencyBasics.ExampleSeven;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class ComputableCache<K, V> {
    private final Map<K, V> cache = new ConcurrentHashMap<>();
    private volatile Map<K, Object> keysMap = new ConcurrentHashMap<>();

    public V compute(K key) {
        Objects.requireNonNull(key, "Key not null");
        if (!keysMap.containsKey(key))
            keysMap.put(key, new Object());

        V res = cache.get(key);

        if (res != null) {
            return res;
        }
        V res0;
        synchronized (keysMap.get(key)) {
            res0 = computeExpensive(key);
        }
        res = cache.putIfAbsent(key, res0);
        return res == null ? res0 : res;
    }


    private V computeExpensive(K key) {
        // Very expensive computation.
        return (V) new Object();
    }
}