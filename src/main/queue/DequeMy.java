package main.queue;

import java.util.LinkedList;
import java.util.Queue;

public class DequeMy {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Elena1");
        queue.add("Elena2");
        queue.add("Elena3");
        queue.add("Elena4");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());
    }

}
