package main.java.com.netcracker.java_concurrency_basics.TwoExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ThreadStatesWAITING {
    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // Implement.
                synchronized (this) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        // Implement.
        t2.start();
        t.start();
        TimeUnit.SECONDS.sleep(2);

        System.out.println(t.getState());
    }
}
