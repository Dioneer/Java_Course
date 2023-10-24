package main.compar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparable{
    public static void main(String[] args) {
        List<Employee> arr = new ArrayList<>();
//        arr.add("elena");
//        arr.add("ivan");
//        arr.add("maty");
//        arr.add("anna");
//        System.out.println(arr);
//        Collections.sort(arr);
//        System.out.println(arr);
        Employee em1 = new Employee(100, "ASd", "Asdadsssssss", 1000);
        Employee em2 = new Employee(101, "Ivan", "Easdasd", 10000);
        Employee em3 = new Employee(102, "Roman", "Awasdasd", 100000);
        arr.add(em1);
        arr.add(em2);
        arr.add(em3);
        System.out.println(arr);
        Collections.sort(arr, new MynameComp());
        System.out.println(arr);
    }
}
