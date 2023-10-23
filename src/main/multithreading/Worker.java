package main.multithreading;

public class Worker implements Runnable {
    @Override
    public void run(){
        System.out.println("begin");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Over");
    }
}
