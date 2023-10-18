package main.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class arrayDeque {
    public static void main(String[] args) {
        Deque<Integer> item = new ArrayDeque<>();
        item.addFirst(1);
        item.addLast(25);
    }
}
