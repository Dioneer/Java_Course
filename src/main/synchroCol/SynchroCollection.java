package main.synchroCol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchroCollection {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> source = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            source.add(i);
//        }
        for (int i = 0; i < 11; i++) {
            source.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(source);
//        ArrayList<Integer> target = new ArrayList<>();
        Runnable runnable1= ()->{
            synchronized (synchList){
            Iterator<Integer> item = synchList.iterator();
            while(item.hasNext()){
                System.out.println(item.next());
            }}
        };
        Runnable runnable2= ()->{synchList.remove(10);};
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
