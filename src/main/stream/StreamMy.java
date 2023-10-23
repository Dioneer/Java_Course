package main.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("hi");
        list.add("hello");
        list.add("good");
        List<String> list1 = list.stream().map(i->i+"k").collect(Collectors.toList());
        System.out.println(list1);
        int[] array = {5,9,3,2,1};
        array = Arrays.stream(array).map(i-> {if (i%3==0){ i= i/3;} return i;}).toArray();
        System.out.println(Arrays.toString(array));
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("hi");
        set.add("hello");
        set.add("good");
//        Set<Integer> set1 = set.stream().map(String::length).collect(Collectors.toSet());
//        System.out.println(set1);
//        List<String> list2 = list.stream().filter(i->i.equals("privet")).toList();
//        System.out.println(list2);
//        int[] array1 = {1,1,2,1,4,5};
//        Arrays.stream(array1).forEach(i->{i*=2;
//            System.out.println(i);});
//        Arrays.stream(array1).forEach(System.out::println);
        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(2);
        list3.add(4);
        list3.add(6);
        list3.add(57);
        int result = list3.stream().reduce((acc, item)-> {
            acc += item;
            System.out.println(acc);
            return acc;
        }).get();
    }
}
