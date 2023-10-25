package main.stream;

import java.util.ArrayList;
import java.util.List;

public class Parallel {
    public static void main(String[] args) {
        List<Double>arr= new ArrayList<>();
        arr.add(0.5);
        arr.add(1.5);
        arr.add(2.5);
        arr.add(3.5);
        arr.add(4.5);
        double summ = arr.parallelStream().reduce(Double::sum).get();
        System.out.println(summ);
    }
}
