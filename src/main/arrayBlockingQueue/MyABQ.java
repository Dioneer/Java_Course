package main.arrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class MyABQ {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);queue.add(4);
//        queue.offer(5);
//        System.out.println(queue);
       new Thread(()->{
           int i = 0;
           while (true){
               try {
                   queue.put(++i);
                   System.out.println("producer add: " +i);
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       }).start();

        while (true){
            try {
                Integer j = queue.take();
                System.out.println("producer remove: " +j);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
