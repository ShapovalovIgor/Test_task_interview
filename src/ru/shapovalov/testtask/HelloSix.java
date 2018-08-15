package ru.shapovalov.testtask;

import java.util.concurrent.TimeUnit;

public class HelloSix {
    private static boolean stopped = false;
    public static void main( String[] args ) throws InterruptedException {
        new Thread( new C() ).start();
        new Thread( new D() ).start();
        TimeUnit.SECONDS.sleep( 5 );
        System.out.println( "Done" );
        stopped = true;
    }
    static class C implements Runnable {
        @Override
        public void run() {
            while( !stopped ) {
            }
            System.out.println( "Out" );
        }
    }

    static class D implements Runnable {
        @Override
        public void run() {
            while( true ) {
                if( stopped ) {
                    break;
                }
            }
            System.out.println( "Out" );
        }
    }
}

//Выведится Done но потоки не завершатся
