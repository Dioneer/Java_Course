package main.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,12);
        stream1.filter(i->{
            System.out.println("!");
            return i%2==0;
        }).collect(Collectors.toList());
    }
}
