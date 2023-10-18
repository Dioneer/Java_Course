package main.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetMy {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Zaur");
//        set.add("Oleg");
//        set.add("Andrey");
//        set.add("Olga");
//        System.out.println(set);
//        set.remove("Zaur");
//        set.forEach(System.out::println);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(10);
        set.add(5);
        set.forEach(System.out::print);
        Set<Integer> set1 = new HashSet<>();
        System.out.println();
        set1.add(7);
        set1.add(4);
        set1.add(3);
        set1.add(8);
//        set.addAll(set1);
//        set.forEach(System.out::print);
//        set.removeAll(set1);
//        set.retainAll(set1);
        System.out.println();
        set.forEach(System.out::print);
    }
}
