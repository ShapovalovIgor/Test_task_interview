package main.java.com.netcracker.java_concurrency_basics.TwoExample;

import java.util.concurrent.TimeUnit;

public class ThreadStatesTIMED_WAITING {
    public static void main(String[] args) throws Exception {
        Print print = new Print();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // Implement.
                print.printConsole("Thread One");
            }
        };

        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        // Implement.
        t2.start();
        t.start();
        TimeUnit.SECONDS.sleep(1);

        System.out.println(t.getState());
    }
    public static class Print{
        public synchronized void printConsole(String s){
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s);
        }
    }
}
