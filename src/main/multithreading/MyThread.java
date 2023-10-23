package main.multithreading;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 25; i++) {
            System.out.print(i+"=");
        }
        Thread.currentThread().setName("Thread-11");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());
    }
}
class MyThread2 implements Runnable {
    public void run(){
        for (int i = 25; i < 50; i++) {
            System.out.print(i+"=");
        }
        Thread.currentThread().setName("Thread-22");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
    }
}