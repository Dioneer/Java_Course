package main.multithreading;

public class MultiSleep implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 8; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Ex8 extends Thread{
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}