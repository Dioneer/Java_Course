package main.copyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyCOWA {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<>();
        arr.add("list");
        arr.add("list1");
        arr.add("list2");
        arr.add("list3");
        System.out.println(arr);
        Runnable runnable1 = () ->{
            Iterator<String> iter = arr.listIterator();
            while (iter.hasNext()){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iter.next());
            }
        };
        Runnable runnable2=()->{
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            arr.remove(arr.size()-1);
            arr.add("elena");
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        thread1.join();
        Thread thread2 = new Thread(runnable2);
        thread2.start();
        thread2.join();
        System.out.println(arr);
    }
}
