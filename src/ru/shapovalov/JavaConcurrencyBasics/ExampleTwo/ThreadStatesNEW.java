package main.java.com.netcracker.java_concurrency_basics.TwoExample;

public class ThreadStatesNEW {
    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                // Implement.
            }
        };

        Thread t = new Thread(r);

        // Implement.

        System.out.println(t.getState());
    }
}
