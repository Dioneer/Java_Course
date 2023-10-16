package main.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1, 8);
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = {5,1,4,2};
        System.arraycopy(arr1,0, arr3, 0, 3);
        System.out.println(Arrays.toString(arr3));
        ArrayList<String> arrS= new ArrayList<>();
        arrS.add("elena1");
        arrS.add("elena2");
        arrS.add("elena3");
        System.out.println(arrS);
        List<String>list = new ArrayList<>(arrS);
        System.out.println(list);
        System.out.println(arrS == list);
        List<Integer>test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(1, 6);
//        test.forEach(System.out::println);
        test.stream()
                .map(val->val*2)
                .forEach(System.out::println);
        System.out.println(test);
    }
}
