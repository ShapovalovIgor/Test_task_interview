package main.java.com.netcracker.java_concurrency_basics.TwoExample;

import java.util.concurrent.TimeUnit;

public class ThreadStatesBLOCKED {



    public static void main(String[] args) throws Exception {
        Print print = new Print();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                   print.setaDouble(i+.0);

                }
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

        private volatile Double aDouble;

        public Double getaDouble() {
            return aDouble;
        }

        public void setaDouble(Double aDouble) {
            this.aDouble = aDouble;
        }
    }
}
