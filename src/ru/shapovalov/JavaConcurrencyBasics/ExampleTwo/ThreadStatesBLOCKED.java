package ru.shapovalov.JavaConcurrencyBasics.ExampleTwo;

import java.util.concurrent.TimeUnit;

public class ThreadStatesBLOCKED {



    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
               synchronized (this){

               }
            }
        };

        Thread t = new Thread(r);

       synchronized (t){
           t.start();

           while (t.getState() != Thread.State.BLOCKED){

           }
           System.out.println(t.getState());
       }

    }
}
