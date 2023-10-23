package main.concurrentHM;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RunnableFuture;

public class CHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap map = new ConcurrentHashMap<>();
//        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Ira");
        map.put(2,"Irra");
        map.put(3,"Irrra");
        map.put(4,"Irrrra");
        map.put(5,"Irrrrra");
        System.out.println(map);
        Runnable runnable1 = ()->{
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i+":"+map.get(i));
            }
        };
        Runnable runnable2 = ()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "Elena");
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        thread1.join();
        Thread thread2 = new Thread(runnable2);
        thread2.start();
        thread2.join();
        System.out.println(map);
    }
}
