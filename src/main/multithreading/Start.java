package main.multithreading;

import com.sun.security.jgss.GSSUtil;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        /**
         * последовательно
         */
//        System.out.println("Privet");
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i);
//        }
//        System.out.println(" Poka");
        /**
         * multi
         */
//        MyThread t1 = new MyThread();
//        t1.start();
//        Thread thread2 = new Thread(new MyThread2());
//        thread2.start();
        /**
         * sleep
         */
//        Thread ms = new Thread(new MySleep());
//        ms.start();
        /**
         * multi sleep
         */
//        Thread tr1 = new Thread(new MultiSleep());
//        tr1.start();
//        Thread tr2 = new Ex8();
//        tr2.start();
//        tr1.join();
//        tr2.join();
//        System.out.println("Stop");
        /**
         * multi sleep
         */
        System.out.println("Method start");
        Thread tr2 = new Thread(new Worker());
        tr2.start();
        tr2.join(1500);
        System.out.println("Method end");
    }
}
